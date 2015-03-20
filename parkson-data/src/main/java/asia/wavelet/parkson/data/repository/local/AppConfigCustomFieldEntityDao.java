package asia.wavelet.parkson.data.repository.local;

import org.springframework.data.repository.CrudRepository;

import asia.wavelet.parkson.data.entity.account.local.AppConfigCustomFieldEntity;

public interface AppConfigCustomFieldEntityDao extends
		CrudRepository<AppConfigCustomFieldEntity, String> {
}
