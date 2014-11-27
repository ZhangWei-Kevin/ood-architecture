package asia.wavelet.emp.domain.businessinteraction;

import java.util.Set;

import asia.wavelet.domain.DomainObject;
public abstract class BusinessInteraction<I extends BusinessInteractionItem> extends DomainObject implements
        IBusinessInteraction {

    private BusinessInteractionType businessInteractionType;

    private Set<I> items;


    protected BusinessInteraction() {}

}
