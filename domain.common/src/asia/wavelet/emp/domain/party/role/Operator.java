package asia.wavelet.emp.domain.party.role;

public abstract class Operator extends PartyRole implements IAuthorizable {
	private String password;

	protected Operator() {
		super();
	}

}
