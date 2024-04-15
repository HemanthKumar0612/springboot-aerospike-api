package dev.HemanthKumar.springbootaerospikeAPI.repository;


import dev.HemanthKumar.springbootaerospikeAPI.entites.User;
import org.springframework.data.aerospike.repository.AerospikeRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends AerospikeRepository<User, Integer> {
    Optional<User> findById(int id);

    void save(User user);

    void deleteById(int id);
}
