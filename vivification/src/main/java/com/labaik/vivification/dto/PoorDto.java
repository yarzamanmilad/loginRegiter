package com.labaik.vivification.dto;

import com.labaik.vivification.domain.address.Address;
import com.labaik.vivification.domain.enums.*;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

@Data
@Accessors(chain = true)
public class PoorDto {

    private String firstName;
    private String lastName;
    private String nationality;
    private String phoneSubscriber;
    private String gender;
    private int numberOfChildren;
    private int numberOfDisabledChildren;
    private  long creditCardNumber;

    private String maritalStatus;

    private String minimumWage;

    private double requestedAmount;

    private String state;
    private String city;
    private String  addressDetails;

    private String role;
    private String email;
    private String password;
}
