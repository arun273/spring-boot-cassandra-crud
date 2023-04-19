package com.training.cassandra.service;

import com.training.cassandra.model.SuperHero;

import java.util.List;

public interface SuperHeroQueryService {

    List<SuperHero> save();

    List<SuperHero> getAll();

    List<SuperHero> getSuperHeroByName(String name);

    SuperHero getOneSuperHeroByName(String name);

    List<SuperHero> getSuperHeroByNameLike(String name);

    SuperHero getSingleSuperHeroBySuperName(String superName);

    List<SuperHero> getSuperHeroByAgeGreaterThan(int age);

    List<SuperHero> getSuperHeroWhoCanFly(boolean canFly);

}
