package asia.wavelet.parkson.data.entity.common;

import java.util.Calendar;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@MappedSuperclass
public abstract class BaseEntity {
	private static Logger logger = LoggerFactory.getLogger(BaseEntity.class);
	
	@Id
	private String guid;

	@Version
	private Integer version;

	private String code;

	private String name;

	private Calendar startLifecycle;
	
	private Calendar endLifecycle;

//	private Integer serialNumber;

	private String description;
	
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

	public Calendar getStartLifecycle() {
		return startLifecycle;
	}

	public void setStartLifecycle(Calendar startLifecycle) {
		this.startLifecycle = startLifecycle;
	}

	public Calendar getEndLifecycle() {
		return endLifecycle;
	}

	public void setEndLifecycle(Calendar endLifecycle) {
		this.endLifecycle = endLifecycle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
