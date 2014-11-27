package asia.wavelet.emp.domain.businessinteraction;

import java.util.List;

import asia.wavelet.emp.domain.party.role.Employee;

public interface IAct extends IBusinessInteraction {
	ActType getActType();
	Employee getOperator();
	String getLocation();
	void run();
	void setParent(IAct act);
	IAct getParent();
	void addChild(IAct act);
	List<IAct> getChildren(); 
}
