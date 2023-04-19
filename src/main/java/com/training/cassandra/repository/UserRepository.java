package com.training.cassandra.repository;

import com.training.cassandra.model.User;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface UserRepository extends ReactiveCrudRepository<User, Integer> {  // for Cassandra ReactiveCrudRepository

    @AllowFiltering
    Flux<User> findByName(String name);
}
