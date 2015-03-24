package asia.wavelet.bigledger.data.repository.test;

import org.springframework.data.repository.CrudRepository;

import asia.wavelet.bigledger.data.entity.test.Person;

public interface PersonDao extends CrudRepository<Person, String> {

}
