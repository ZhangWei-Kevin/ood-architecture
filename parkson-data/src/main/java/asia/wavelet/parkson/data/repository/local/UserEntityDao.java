package asia.wavelet.parkson.data.repository.local;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import asia.wavelet.parkson.data.entity.account.local.UserEntity;

//@NoRepositoryBean
public interface UserEntityDao extends CrudRepository<UserEntity, String> {

	List<UserEntity> findByGuid(String guid);
}
