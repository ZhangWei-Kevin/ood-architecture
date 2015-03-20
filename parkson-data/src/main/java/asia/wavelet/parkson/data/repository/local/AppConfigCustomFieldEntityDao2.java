package asia.wavelet.parkson.data.repository.local;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import asia.wavelet.parkson.data.entity.account.local.AppConfigCustomFieldEntity;

public interface AppConfigCustomFieldEntityDao2 extends
		PagingAndSortingRepository<AppConfigCustomFieldEntity, String>,
		JpaSpecificationExecutor<AppConfigCustomFieldEntity> {

	List<AppConfigCustomFieldEntity> findByName(String name,
			Pageable pageRequest);

}
