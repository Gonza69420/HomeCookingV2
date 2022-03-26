package repository;

import model.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepositoryClient extends CrudRepository<Client, Long> {

    @Query("select c from Client c where c.lastName like %?1%")
    List<Client> findByLastName(String lastName);

    @Query("select c from Client c where c.firstName like %?1%")
    List<Client> findByFirstName(String firstName);

    @Query("select c from Client c where c.mail like %?1%")
    Client findBymail(String mail);

    @Query("select c from Client c where c.DNI like %?1%")
    Client findByDNI(String DNI);


}
