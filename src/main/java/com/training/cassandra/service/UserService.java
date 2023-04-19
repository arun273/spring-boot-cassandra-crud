package com.training.cassandra.service;

import com.training.cassandra.model.User;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {

    Flux<User> findByName(String email);

    Flux<User> saveAll(Publisher<User> users);

    Flux<User> listUsers();

    Mono<User> findById(Integer id);

    Mono<User> updateUser(Integer userId, User user);

    Mono<User> createUser(User user);

    Mono<User> deleteUser(Integer userId);

    public Mono<User> exception();
}
