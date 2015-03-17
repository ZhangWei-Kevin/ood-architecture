package asia.wavelet.parkson.data.entity.common;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.repository.NoRepositoryBean;

@MappedSuperclass
@NoRepositoryBean
public abstract class CommonEntity {
	
	private String guid;

	@Id
	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

}
