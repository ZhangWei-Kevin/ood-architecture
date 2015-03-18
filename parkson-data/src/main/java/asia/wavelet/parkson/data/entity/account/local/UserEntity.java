package asia.wavelet.parkson.data.entity.account.local;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import asia.wavelet.parkson.data.entity.common.BaseEntity;

@Entity
@Table(name = "userss")
public class UserEntity extends BaseEntity{

	private String username;

	private String password;

	
	private boolean enabled;
	
	
	private boolean locked;

	
	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name="IS_ENABLED")
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Column(name="IS_LOCKED")
	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	
	
	
}
