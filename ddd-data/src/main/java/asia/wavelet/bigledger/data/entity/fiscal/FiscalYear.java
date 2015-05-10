package asia.wavelet.bigledger.data.entity.fiscal;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import asia.wavelet.bigledger.data.entity.common.BaseEntity;
import asia.wavelet.bigledger.data.entity.partyrole.Company;
import asia.wavelet.bigledger.system.common.TimePeriod;

@Entity
@Table(name = "fiscal_year")
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING, length = 128)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class FiscalYear extends BaseEntity {
	
	@Embedded
	@AttributeOverrides({
			@AttributeOverride(name = "startTime", column = @Column(name = "start_time")),
			@AttributeOverride(name = "endTime", column = @Column(name = "end_time")) })
	private TimePeriod period;
	
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "company_id", referencedColumnName = "guid")
	private Company company;

	public TimePeriod getPeriod() {
		return period;
	}

	public void setPeriod(TimePeriod period) {
		this.period = period;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
