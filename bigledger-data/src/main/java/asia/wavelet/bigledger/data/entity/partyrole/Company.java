package asia.wavelet.bigledger.data.entity.partyrole;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import asia.wavelet.bigledger.data.entity.common.BaseEntity;

@Entity
@Table(name = "company")
public class Company extends BaseEntity{
	
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name = "tax_group_guid", referencedColumnName = "guid")
	private TaxGroup taxGroup;

	public TaxGroup getTaxGroup() {
		return taxGroup;
	}

	public void setTaxGroup(TaxGroup taxGroup) {
		this.taxGroup = taxGroup;
	}
	
	
}
