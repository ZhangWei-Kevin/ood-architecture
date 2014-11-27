package asia.wavelet.emp.domain.businessinteraction;

import asia.wavelet.domain.DomainObject;

public abstract class BusinessInteractionItem extends DomainObject {
	private BusinessInteraction<?> businessInteraction;
	
	protected BusinessInteractionItem() {
		super();
	}

}
