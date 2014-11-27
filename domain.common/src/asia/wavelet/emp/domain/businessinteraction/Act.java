package asia.wavelet.emp.domain.businessinteraction;

import java.util.ArrayList;
import java.util.List;

import asia.wavelet.emp.domain.party.role.Employee;

public abstract class Act extends BusinessInteraction<BusinessInteractionItem> implements IAct {
    private static ThreadLocal<IAct> actHolder = new ThreadLocal<IAct>();

    private Long targetObjectId;
    
	private Employee operator;
	private String location;

	private IAct parent;

	private List<IAct> children;

	public static IAct getCurrent() {
		return actHolder.get();
	}

	public static void clear() {
		actHolder.set(null);
	}

	public static void switchCurrent(IAct act){
		actHolder.set(act);
	}
	protected Act() {
		super();
	}

	public Act(String actTypeCode) {
		if (getCurrent() == null) {
			actHolder.set(this);
		}
	}

	public Long getTargetObjectId() {
        return targetObjectId;
    }
	
	protected final void setTargetObjectId(Long targetObjectId) {
        this.targetObjectId = targetObjectId;
    }
	
	public Employee getOperator() {
		return operator;
	}

	
	public String getLocation() {
		return location;
	}

	private boolean ran = false;
	
	
	public void setRan(boolean ran) {
		this.ran = ran;
	}

    public final void run() {
        preprocess();
        doRun();
        postprocess();
//        setEnd(getCurrentDateTime());
        ran = true;
    }

	protected void preprocess() {
	}
	protected abstract void doRun();

	protected void postprocess() {
		runChildren();
	}

	protected void runChildren(){
		List<IAct> children = getChildren();
		for (IAct child : children) {
			if(!((Act)child).ran){
				child.run();
			}
		}
	}
	
	public void setOperator(Employee operator){
		this.operator =  operator;
	}
	
	public void setOperator(String operatorCode){
//		setOperator(Employee.getEmployeeFinder().findByCode(operatorCode));
	}

	public ActType getActType() {
		return (ActType) this.getBusinessInteractionType();
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setParent(IAct act) {
		this.parent = act;
		act.getChildren().add(this);
	}

	public IAct getParent() {
		return parent;
	}

	public void addChild(IAct act) {
		act.setParent(this);
	}

	public List<IAct> getChildren() {
		if (children == null) {
			children = new ArrayList<IAct>();
		}
		return children;
	}
    
    protected void setChildren(List<IAct> children) {
        assert children != null : "childrenΪnull";
        this.children = children;
    }

}
