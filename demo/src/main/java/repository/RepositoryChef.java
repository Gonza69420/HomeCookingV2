package repository;

import model.Chef;
import model.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepositoryChef extends CrudRepository<Chef, Long> {
    List<Client> findByLastName(String lastName);
    List<Client> findBymail(String mail);
}