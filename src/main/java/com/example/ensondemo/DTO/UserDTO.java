package com.example.ensondemo.DTO;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.transaction.Transactional;

@Getter
@Setter
@Transactional

public class UserDTO {
    @JsonProperty("id")
    public  Integer id;

    @JsonProperty("first_name")
    public  String firstName;

    @JsonProperty("last_name")
    public  String lastName;


}
