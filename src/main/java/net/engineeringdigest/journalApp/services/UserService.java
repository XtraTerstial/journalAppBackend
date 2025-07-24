package net.engineeringdigest.journalApp.services;

import lombok.NonNull;
import net.engineeringdigest.journalApp.Repo.UserRepository;
import net.engineeringdigest.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveEntry(User user){
        userRepository.save(user);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public Optional<User> findById(ObjectId id){
        return userRepository.findById(String.valueOf(id));
    }
    public void deleteById(ObjectId id){
        userRepository.deleteById(String.valueOf(id));
    }

    public User findByUserName(@NonNull String username) {
        return userRepository.findByUsername(username);
    }
}
