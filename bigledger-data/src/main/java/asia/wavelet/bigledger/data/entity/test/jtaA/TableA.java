package asia.wavelet.bigledger.data.entity.test.jtaA;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TAB_A")
public class TableA {
	@Id
	private Long id;
	private String code;
	
	
	
	public TableA() {
	    super();
    }
	public TableA(Long id, String code) {
	    super();
	    this.id = id;
	    this.code = code;
    }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	
}
