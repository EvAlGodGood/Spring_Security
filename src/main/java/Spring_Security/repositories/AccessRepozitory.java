package Spring_Security.repositories;


import Spring_Security.entities.Access;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessRepozitory extends CrudRepository<Access, Long> {
}
