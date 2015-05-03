package asia.wavelet.bigledger.data.entity.fiscal;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;



@Entity
@DiscriminatorValue("FinancialYear")
public class FinancialYear extends FiscalYear {
	
}
