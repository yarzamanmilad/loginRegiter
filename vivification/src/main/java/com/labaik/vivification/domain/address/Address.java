package com.labaik.vivification.domain.address;


import com.labaik.vivification.domain.enums.Citys;
import com.labaik.vivification.domain.enums.States;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Data
@AllArgsConstructor

@Accessors(chain = true)
@RequiredArgsConstructor
@Entity
@Table(name = "ADDRESS")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String details;
    @Enumerated(EnumType.STRING)
    private States state;
    @Enumerated(EnumType.STRING)
    private Citys city;

}
