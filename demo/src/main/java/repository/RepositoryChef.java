package repository;

import model.Chef;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepositoryChef extends CrudRepository<Chef, Long> {
    List<Chef> findByLastName(String lastName);
    List<Chef> findBymail(String mail);
}
