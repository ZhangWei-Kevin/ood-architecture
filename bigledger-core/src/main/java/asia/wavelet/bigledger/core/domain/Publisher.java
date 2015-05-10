package asia.wavelet.bigledger.core.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.openkoala.koala.commons.domain.KoalaAbstractEntity;


@Entity
@Table(name = "PUBLISHERS")
public class Publisher extends KoalaAbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8223737935434243709L;

	private String addrress;
	
	@Override
	public String[] businessKeys() {
		return null;
	}

	public String getAddrress() {
		return addrress;
	}

	public void setAddrress(String addrress) {
		this.addrress = addrress;
	}

}
