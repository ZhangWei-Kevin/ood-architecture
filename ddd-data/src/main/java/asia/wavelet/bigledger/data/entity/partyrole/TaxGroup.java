package asia.wavelet.bigledger.data.entity.partyrole;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import asia.wavelet.bigledger.data.entity.common.BaseEntity;

@Entity
@Table(name = "tax_group")
public class TaxGroup extends BaseEntity {
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "tax_group_guid")
	private Set<Company> companies;

	protected TaxGroup() {
	    super();
    }
	
	public TaxGroup(String code, String name, String description) {
	    super(code, name, description);
    }

	public Set<Company> getCompanies() {
		return companies;
	}

	public void setCompanies(Set<Company> companies) {
		this.companies = companies;
	}
}
