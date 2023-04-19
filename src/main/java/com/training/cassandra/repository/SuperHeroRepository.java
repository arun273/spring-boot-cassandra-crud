package com.training.cassandra.repository;

import com.training.cassandra.model.SuperHero;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperHeroRepository extends CassandraRepository<SuperHero, Long> {

}
