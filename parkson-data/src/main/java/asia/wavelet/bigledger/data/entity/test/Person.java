package asia.wavelet.bigledger.data.entity.test;

import javax.persistence.Entity;
import javax.persistence.Table;

import asia.wavelet.bigledger.data.entity.common.BaseEntity;

@Entity
@Table(name = "persons")
public class Person extends BaseEntity {

	protected Person() {
	    super();
    }

	public Person(String code, String name, String description) {
	    super(code, name, description);
    }

}
