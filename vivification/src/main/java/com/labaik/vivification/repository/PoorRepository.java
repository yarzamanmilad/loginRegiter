package com.labaik.vivification.repository;

import com.labaik.vivification.domain.user.Poor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface PoorRepository extends JpaRepository<Poor,Long> {
    Optional<Poor> findByFirstName(String name);
}
