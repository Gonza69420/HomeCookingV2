package repository;

import model.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepositoryClient extends CrudRepository<Client, Long> {
    List<Client> findByLastName(String lastName);
    List<Client> findBymail(String mail);


}
