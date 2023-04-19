package com.training.cassandra.service.impl;


import com.training.cassandra.exception.handler.ServerException;
import com.training.cassandra.model.User;
import com.training.cassandra.repository.UserRepository;
import com.training.cassandra.service.UserService;
import org.reactivestreams.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Flux<User> findByName(String email) {
        return userRepository.findByName(email);
    }

    @Override
    public Flux<User> saveAll(Publisher<User> users) {
        return userRepository.saveAll(users);
    }

    @Override
    public Flux<User> listUsers() {
        return userRepository.findAll();
    }

    @Override
    public Mono<User> findById(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public Mono<User> updateUser(Integer userId, User user) {
        return userRepository.findById(userId)
                .flatMap(dbUser -> {
                    dbUser.setAge(user.getAge());
                    dbUser.setSalary(user.getSalary());
                    return userRepository.save(dbUser);
                });
    }

    public Mono<User> createUser(User user) {
        return userRepository.save(user);
    }

    public Mono<User> deleteUser(Integer userId) {
        return userRepository.findById(userId)
                .flatMap(existingUser -> userRepository.delete(existingUser)
                        .then(Mono.just(existingUser)));
    }

    public Mono<User> exception() {
        return Mono.error(new ServerException("userId is not found"));
    }


}
