package asia.wavelet.parkson.data.entity.account.remote;

import javax.persistence.Entity;
import javax.persistence.Table;

import asia.wavelet.parkson.data.entity.common.BaseEntity;

@Entity
@Table(name = "test_jta")
public class TestJtaEntity extends BaseEntity{

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
