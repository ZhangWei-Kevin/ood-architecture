package asia.wavelet.bigledger.data.entity.test.jtaB;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TAB_B")
public class TableB {
	@Id
	private Long id;
	private String code;
	
	
	public TableB() {
	    super();
    }
	public TableB(Long id, String code) {
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
