package asia.wavelet.emp.domain.party.role;

public class PartyIdentification {
	private PartyIdentificationType type;
	private String no;

	protected PartyIdentification() {
		super();
	}

	public PartyIdentificationType getType() {
		return type;
	}

	public void setType(PartyIdentificationType type) {
		this.type = type;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}
}
