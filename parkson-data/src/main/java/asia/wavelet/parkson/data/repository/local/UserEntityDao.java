package asia.wavelet.parkson.data.repository.local;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import asia.wavelet.parkson.data.entity.account.local.UserEntity;

public interface UserEntityDao extends CrudRepository<UserEntity, String> {

	List<UserEntity> findByGuid(String guid);
}
