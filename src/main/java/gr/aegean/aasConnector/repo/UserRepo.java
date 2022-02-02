package gr.aegean.aasConnector.repo;

import gr.aegean.aasConnector.model.AasUser;
import gr.aegean.aasConnector.model.UserApplication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepo extends CrudRepository<AasUser, String> {

    public Optional<AasUser> findByLogin(String login);
}


