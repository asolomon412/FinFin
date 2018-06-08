package finalprep.FinFin.daorepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import finalprep.FinFin.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

	List<Person> findByFavColor(String color); // this is being assigned to a list because there may be multiple people with the same favColor

	List<Person> findByNameContaining(String parts); // this should not be assigned to a Person, because it may contain more than one search result

}
