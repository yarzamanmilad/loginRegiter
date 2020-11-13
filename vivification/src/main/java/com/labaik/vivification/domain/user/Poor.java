package com.labaik.vivification.domain.user;

import com.labaik.vivification.domain.Account;
import com.labaik.vivification.domain.address.Address;
import com.labaik.vivification.domain.enums.*;
import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "POOR")
public class Poor  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String nationality;
    private String phoneSubscriber;
    private int numberOfChildren;
    private int numberOfDisabledChildren;
    private  long creditCardNumber;
    @Enumerated(EnumType.STRING)
    private MaritalStatus maritalStatus;
    @Enumerated(EnumType.STRING)
    private MinimumWage minimumWage;

    private double requestedAmount;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Enumerated(EnumType.STRING)
    private States state;
    @Enumerated(EnumType.STRING)
    private Citys city;
    private String addressDetails;
    @Enumerated(EnumType.STRING)
    private AuthenticationStatus authenticationStatus;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

}
