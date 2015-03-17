package asia.wavelet.parkson.data.entity.account.remote;

import javax.persistence.Entity;
import javax.persistence.Table;

import asia.wavelet.parkson.data.entity.common.CommonEntity;

@Entity
@Table(name = "test_jta")
public class TestJtaEntity extends CommonEntity{

	private String name;

	
	public TestJtaEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
