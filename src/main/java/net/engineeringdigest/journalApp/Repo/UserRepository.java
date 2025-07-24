package net.engineeringdigest.journalApp.Repo;

import net.engineeringdigest.journalApp.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {

    User findByUsername(String username);
}
