package com.labaik.vivification.repository;

import com.labaik.vivification.domain.user.Benefactor;

import org.springframework.data.jpa.repository.JpaRepository;


public interface BenefactorRepository extends JpaRepository<Benefactor, Long> {
}
