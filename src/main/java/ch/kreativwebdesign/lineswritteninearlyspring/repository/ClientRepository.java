package ch.kreativwebdesign.lineswritteninearlyspring.repository;

import ch.kreativwebdesign.lineswritteninearlyspring.model.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientRepository extends CrudRepository<Client, Long> {
    List<Client> findByLastName(String lastName);
}
