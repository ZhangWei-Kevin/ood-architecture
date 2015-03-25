package asia.wavelet.bigledger.data.entity.test;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import asia.wavelet.bigledger.data.entity.common.BaseEntity;

@Entity
@Table(name = "persons")
public class Person extends BaseEntity {

	@ManyToOne
	@JoinColumn(name = "country_id", referencedColumnName = "guid")
	private Country country;
	
	protected Person() {
	    super();
    }

	public Person(String code, String name, String description) {
	    super(code, name, description);
    }

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}
