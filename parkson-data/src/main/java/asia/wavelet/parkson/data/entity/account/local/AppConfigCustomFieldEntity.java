package asia.wavelet.parkson.data.entity.account.local;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import asia.wavelet.parkson.data.entity.common.BaseEntity;

@Entity
@Table(name = "app_cfg_custom_field")
public class AppConfigCustomFieldEntity extends BaseEntity {

	@Column(name = "field_type")
	private String fieldType;
	
	@Column(name = "foreign_table")
	private String foreignTable;
	
	@Column(name = "appearance_json")
	private String appearanceJson;

	@Column(name = "validation_json")
	private String validationJson;
	
	@Column(name = "value_json")
	private String valueJson;
	
	@Column(name = "action_json")
	private String actionJson;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "logJson")
	private String logJson;

	public AppConfigCustomFieldEntity() {}

	public String getFieldType() {
		return fieldType;
	}

	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

	public String getForeignTable() {
		return foreignTable;
	}

	public void setForeignTable(String foreignTable) {
		this.foreignTable = foreignTable;
	}

	public String getAppearanceJson() {
		return appearanceJson;
	}

	public void setAppearanceJson(String appearanceJson) {
		this.appearanceJson = appearanceJson;
	}

	public String getValidationJson() {
		return validationJson;
	}

	public void setValidationJson(String validationJson) {
		this.validationJson = validationJson;
	}

	public String getValueJson() {
		return valueJson;
	}

	public void setValueJson(String valueJson) {
		this.valueJson = valueJson;
	}

	public String getActionJson() {
		return actionJson;
	}

	public void setActionJson(String actionJson) {
		this.actionJson = actionJson;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLogJson() {
		return logJson;
	}

	public void setLogJson(String logJson) {
		this.logJson = logJson;
	}
	
}
