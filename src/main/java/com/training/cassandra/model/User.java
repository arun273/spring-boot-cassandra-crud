package com.training.cassandra.model;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@ToString
@EqualsAndHashCode(of = {"id", "name", "department"})
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table
public class User {

    @PrimaryKey
    private Integer id;
    private String name;
    private int age;
    private double salary;
    private String department;
}
