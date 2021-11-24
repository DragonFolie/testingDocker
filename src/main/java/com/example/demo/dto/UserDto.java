package com.example.demo.dto;


import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class UserDto {

    private String name;
    private String surname;


    public UserDto() {
    }


    public UserDto(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }




}
