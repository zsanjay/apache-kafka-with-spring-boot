package com.sanjay.spring_kafka.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student {

    private int id;
    private String firstName;
    private String lastName;
}
