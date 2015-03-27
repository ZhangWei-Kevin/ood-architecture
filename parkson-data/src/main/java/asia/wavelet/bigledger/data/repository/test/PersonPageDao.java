package asia.wavelet.bigledger.data.repository.test;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import asia.wavelet.bigledger.data.entity.test.Person;

public interface PersonPageDao extends PagingAndSortingRepository<Person, String> {
	Page<Person> findByDescriptionLike(String name, Pageable pageRequest);
}
