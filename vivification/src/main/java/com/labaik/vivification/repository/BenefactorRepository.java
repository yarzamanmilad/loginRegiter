package com.labaik.vivification.repository;

import com.labaik.vivification.domain.user.Benefactor;

import com.labaik.vivification.domain.user.Poor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BenefactorRepository extends JpaRepository<Benefactor, Long> {

    Benefactor findByNationality(String nationality);
    Benefactor findByAccount_Email(String email);
}
