package asia.wavelet.emp.domain.businessinteraction;

import asia.wavelet.domain.IDomainObject;

public interface IBusinessInteraction extends IDomainObject {
	BusinessInteractionType getBusinessInteractionType();
}
