package gr.aegean.aasConnector.repo;

import gr.aegean.aasConnector.model.UserApplication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserApplicationRepo extends CrudRepository<UserApplication, Integer> {
    public Optional<UserApplication> findByUserId(String userId);
}
