package asia.wavelet.domain;

import asia.wavelet.common.Period;

public abstract class DomainObject implements IDomainObject,
		Comparable<DomainObject> {

	// private final static Log log = LogFactory.getLog(DomainObject.class);

	private Long id;

	private Integer version;

	private Period lifecycle;

	private String name;

	private String code;

	private Integer serialNumber;

	private String description;
	
	public int compareTo(DomainObject obj) {
		return serialNumber.compareTo(obj.getSerialNumber());
	}


	public Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Period getLifecycle() {
		return lifecycle;
	}

	public void setLifecycle(Period lifecycle) {
		this.lifecycle = lifecycle;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
