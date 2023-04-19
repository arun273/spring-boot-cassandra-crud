package com.training.cassandra.model;

import lombok.Builder;
import lombok.Data;

import org.springframework.data.cassandra.core.mapping.*;

import java.io.Serializable;

@Data
@Builder
@Table("super_hero")
public class SuperHero implements Serializable {

    @PrimaryKey
    private Long id;

    private String name;

    @Column("super_name")
    private String superName;

    private String profession;

    private int age;

    @Column("super_powers")
    @Frozen
    private SuperPowers superPowers;

}