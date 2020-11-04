package com.labaik.vivification.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class BenefactorDto {

    private String firstName;
    private String lastName;
    private String nationality;
    private String phoneSubscriber;
    private String gender;
}
