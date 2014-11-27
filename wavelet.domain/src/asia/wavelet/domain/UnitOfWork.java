package asia.wavelet.domain;

import java.util.ArrayList;
import java.util.List;

public class UnitOfWork {
	private static ThreadLocal<UnitOfWork> current = new ThreadLocal<UnitOfWork>();
	// private static Log log = LogFactory.getLog(UnitOfWork.class);

	private static int warnUpperLimitObjectCount = 200;
	private static int errorUpperLimitObjectCount = 500;

	public static void initUpperLimitSize(int _warnUpperLimitObjectCount,
			int _errorUpperLimitObjectCount) {
		warnUpperLimitObjectCount = _warnUpperLimitObjectCount;
		errorUpperLimitObjectCount = _errorUpperLimitObjectCount;
	}

	public static UnitOfWork newCurrent() {
		setCurrent(new UnitOfWork());
		return getCurrent();
	}

	private static IUnitOfWorkFactory crrentUnitOfWorkFactory;

	public static void setFactory(IUnitOfWorkFactory unitOfWorkFactory) {
		crrentUnitOfWorkFactory = unitOfWorkFactory;
	}

	public static void setCurrent(UnitOfWork unitOfWork) {
		current.set(unitOfWork);
	}

	public static UnitOfWork getCurrent() {
		if (current.get() == null) {
			current.set(crrentUnitOfWorkFactory.create());
		}
		UnitOfWork unitOfWork = current.get();
		return unitOfWork;
	}

	private List<IDomainObject> createdObjects = new ArrayList<IDomainObject>();
	private List<IDomainObject> dirtyObjects = new ArrayList<IDomainObject>();
	private List<IDomainObject> destroyedObjects = new ArrayList<IDomainObject>();

	public final void registerCreated(IDomainObject domainObject) {

		if (createdObjects.contains(domainObject)) {
			return;
		}

		createdObjects.add(domainObject);
	}

	private List<IDomainObject> createdObjectsNotNeedPersistence = new ArrayList<IDomainObject>();

	public final void registerDirty(IDomainObject domainObject) {

		if (dirtyObjects.contains(domainObject)
				|| createdObjects.contains(domainObject)) {
			return;
		}

		if (createdObjectsNotNeedPersistence.contains(domainObject)) {
			return;
		}

		dirtyObjects.add(domainObject);

	}

	public final void registerDestroyed(IDomainObject domainObject) {

		if (destroyedObjects.contains(domainObject)) {
			return;
		}

		if (createdObjects.contains(domainObject)) {
			createdObjects.remove(domainObject);
			createdObjectsNotNeedPersistence.add(domainObject);
		}

		if (createdObjectsNotNeedPersistence.contains(domainObject)) {
			return;
		}

		if (dirtyObjects.contains(domainObject)) {
			dirtyObjects.remove(domainObject);
		}

		destroyedObjects.add(domainObject);
	}

	public final void commit() {
		beginCommit();
		deleteDestroyed();
		updateDirty();
		insertCreated();
		try {
			beginSave();
			saving();
			endSave();
		} catch (Throwable ex) {
			saveError(ex);
		} finally {
			saveFinal();
			clear();
		}
	}

	public final void tryCommit() {
		beginCommit();
		deleteDestroyed();
		updateDirty();
		insertCreated();
		try {
			beginSave();
			saving();
			rollback();
		} catch (Throwable ex) {
			saveError(ex);
		} finally {
			saveFinal();
			clear();
		}
	}

	public final void save() {
		beginCommit();
		deleteDestroyed();
		updateDirty();
		insertCreated();
		try {
			beginSave();
			saving();
			flush();
			getDestroyedObjects().clear();
			getDirtyObjects().clear();
			getCreatedObjects().clear();
		} catch (Throwable ex) {
			saveError(ex);
		} finally {
			saveFinal();
		}
	}

	protected void flush() {
	}

	protected void rollback() {
	}

	protected void beginCommit() {

	}

	protected void beginSave() {

	}

	protected void saving() {
	}

	protected void endSave() {

	}

	protected void saveError(Throwable ex) {

	}

	protected void saveFinal() {

	}

	public void clear() {
		current.set(null);
	}

	protected void deleteDestroyed() {
		for (IDomainObject domainObject : destroyedObjects) {
		}
	}

	protected void updateDirty() {
		for (IDomainObject domainObject : dirtyObjects) {
		}
	}

	protected void insertCreated() {
		for (IDomainObject domainObject : createdObjects) {
		}
	}

	public List<IDomainObject> getCreatedObjects() {
		return createdObjects;
	}

	public List<IDomainObject> getDestroyedObjects() {
		return destroyedObjects;
	}

	public List<IDomainObject> getDirtyObjects() {
		return dirtyObjects;
	}
}