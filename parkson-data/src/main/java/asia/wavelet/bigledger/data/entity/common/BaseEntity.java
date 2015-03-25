package asia.wavelet.bigledger.data.entity.common;

import java.util.UUID;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import asia.wavelet.bigledger.system.common.TimePeriod;

@MappedSuperclass
public abstract class BaseEntity {
	private static Logger logger = LoggerFactory.getLogger(BaseEntity.class);

	@Id
	private String guid;

	@Version
	private Integer version;

	@Column(name = "code")
	private String code;

	@Column(name = "name")
	private String name;

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "startTime", column = @Column(name = "start_lifecycle")),
	        @AttributeOverride(name = "endTime", column = @Column(name = "end_lifecycle")) })
	private TimePeriod lifecycle;

	@Column(name = "description")
	private String description;

	/**
	 * fetch from database
	 */
	protected BaseEntity() {
		super();
	}

	public BaseEntity(String code, String name, String description) {
		super();
		this.guid = UUID.randomUUID().toString().toUpperCase();
		this.version = 0;
		this.code = code;
		this.name = name;
		this.lifecycle = TimePeriod.createDefault();
		this.description = description;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
