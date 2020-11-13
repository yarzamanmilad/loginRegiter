package com.labaik.vivification.security;

import com.labaik.vivification.domain.Account;
import com.labaik.vivification.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    private final AccountRepository accountRepository;
    @Override
    public UserPrinciple loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account=accountRepository.findByEmail(username);
        UserPrinciple userPrinciple=new UserPrinciple(account);
        return userPrinciple;
    }
}
