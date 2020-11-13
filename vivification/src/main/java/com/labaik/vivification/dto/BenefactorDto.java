package com.labaik.vivification.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class BenefactorDto {

    private String firstName;
    private String lastName;
    private String nationality;
    private String phoneSubscriber;
    private String gender;
    private String role;
    private String email;
    private String password;
}
