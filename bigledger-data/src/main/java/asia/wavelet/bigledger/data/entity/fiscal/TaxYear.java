package asia.wavelet.bigledger.data.entity.fiscal;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
@DiscriminatorValue("TaxYear")
public class TaxYear extends FiscalYear {
	
	@ManyToOne
	@JoinColumn(name = "financial_year_guid", referencedColumnName = "guid")
	private FinancialYear financialYear;
	
	public FinancialYear getFinancialYear() {
		return financialYear;
	}

	public void setFinancialYear(FinancialYear financialYear) {
		this.financialYear = financialYear;
	}
	
}
