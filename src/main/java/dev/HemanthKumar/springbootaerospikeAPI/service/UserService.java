package dev.HemanthKumar.springbootaerospikeAPI.service;

import dev.HemanthKumar.springbootaerospikeAPI.entites.User;
import dev.HemanthKumar.springbootaerospikeAPI.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public Optional<User> readUserById(int id) {
        return userRepository.findById(id);
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void removeUserById(int id) {
        userRepository.deleteById(id);
    }
}

