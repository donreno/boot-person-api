package com.nisum.personapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
@AllArgsConstructor
public class Person {

    @Id private String id;
    private String firstName;
    private String lastName;
    private Integer age;

}