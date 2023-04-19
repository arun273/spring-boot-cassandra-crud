package com.training.cassandra.service.impl;

import com.training.cassandra.model.SuperHero;
import com.training.cassandra.repository.SuperHeroRepository;
import com.training.cassandra.service.SuperHeroService;
import com.training.cassandra.utils.HelperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperHeroServiceImpl implements SuperHeroService {

    @Autowired
    private SuperHeroRepository repository;

    @Override
    public List<SuperHero> save() {

        List<SuperHero> superHeroes = repository.findAll();
        if (superHeroes.isEmpty())
            repository.saveAll(HelperUtil.getSuperHeroesData());

        return repository.findAll();
    }

    @Override
    public List<SuperHero> findAll() {
        return repository.findAll();
    }

    @Override
    public SuperHero findById(Long id) {
        return repository.findById(id).orElse(SuperHero.builder().build());
    }

    @Override
    public SuperHero save(SuperHero superHero) {
        return repository.save(superHero);
    }

    @Override
    public SuperHero update(SuperHero superHero) {
        return repository.save(superHero);
    }

    @Override
    public void delete(Long id) {
        repository.findById(id).ifPresent(superHero -> repository.delete(superHero));
    }
}