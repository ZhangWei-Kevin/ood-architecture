package asia.wavelet.parkson.data.repository.remote;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import asia.wavelet.parkson.data.entity.account.remote.TestJtaEntity;

//@NoRepositoryBean
public interface TestJtaEntityDao extends CrudRepository<TestJtaEntity, String> {

	List<TestJtaEntity> findByGuid(String guid);
}
