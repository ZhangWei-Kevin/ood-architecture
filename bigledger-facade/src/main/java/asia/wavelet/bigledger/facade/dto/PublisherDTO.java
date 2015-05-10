package asia.wavelet.bigledger.facade.dto;

import java.io.Serializable;

public class PublisherDTO implements Serializable {

	private Long id;

	private int version;

			
		private String addrress;
		
			
	
	public void setAddrress(String addrress) { 
		this.addrress = addrress;
	}

	public String getAddrress() {
		return this.addrress;
	}
		
		
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PublisherDTO other = (PublisherDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}