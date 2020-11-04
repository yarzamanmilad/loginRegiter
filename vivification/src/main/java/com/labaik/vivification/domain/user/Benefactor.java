package com.labaik.vivification.domain.user;

import com.labaik.vivification.domain.enums.Gender;
import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor

@Accessors(chain = true)
@RequiredArgsConstructor
@Entity
@Table(name = "BENEFACTOR")
public class Benefactor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String nationality;
    private String phoneSubscriber;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    /*@ManyToMany
    private List<Poor> poors;*/
}
