package asia.wavelet.domain;

import java.util.Calendar;

public abstract class DomainObject {

	private Long id;

	private Integer version;

	private Period lifecycle = new Period();

	private String code;

	private String name;

	private String description;

	protected DomainObject() {
	}

	protected DomainObject(String code, String name) {
		super();
	}

	public final void destory() {
	}

	protected void onDestory() {

	}

	public DomainObject(String name) {
		this(null, name);
	}

	public Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setLifecycle(Period lifecycle) {
		this.lifecycle = lifecycle;
	}

	public Period getLifecycle() {
		return lifecycle.clone();
	}

	public void setEnd(Calendar end) {
		lifecycle.setEndTime((Calendar) end.clone());
	}

	public void setStart(Calendar start) {
		lifecycle.setStartTime((Calendar) start.clone());
	}

	@Override
	public int hashCode() {
		assert id != null : this.getClass().getName() + " id为null";
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof DomainObject)) {
			return false;
		}
		DomainObject domainObj = (DomainObject) obj;
		return this.getId().longValue() == domainObj.getId().longValue();
	}
}