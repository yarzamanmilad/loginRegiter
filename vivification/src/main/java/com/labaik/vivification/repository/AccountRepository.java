package com.labaik.vivification.repository;

import com.labaik.vivification.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
    Account findByEmail(String email);
}
