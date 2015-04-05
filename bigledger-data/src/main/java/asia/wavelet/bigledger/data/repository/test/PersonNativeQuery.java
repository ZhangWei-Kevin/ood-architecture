package asia.wavelet.bigledger.data.repository.test;

import java.util.List;

import org.springframework.data.domain.PageRequest;

import asia.wavelet.parkson.dto.test.PersonInfo;

public interface PersonNativeQuery {
	public List<PersonInfo> findBy(PageRequest pageRequest);
}
