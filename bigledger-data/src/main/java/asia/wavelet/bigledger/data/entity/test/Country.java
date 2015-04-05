package asia.wavelet.bigledger.data.entity.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import asia.wavelet.bigledger.data.entity.common.BaseEntity;

@Entity
@Table(name = "countries")
public class Country extends BaseEntity {

	@Column(name = "area")
	private String area;
	
	
	protected Country() {
	    super();
    }

	public Country(String code, String name, String description, String area) {
	    super(code, name, description);
	    this.area = area;
    }
	

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	
	
}
