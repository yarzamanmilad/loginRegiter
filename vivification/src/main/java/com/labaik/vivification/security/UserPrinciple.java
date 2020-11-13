package com.labaik.vivification.security;

import com.labaik.vivification.domain.Account;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class UserPrinciple extends User {
    public UserPrinciple(Account account) {
        super(account.getEmail(), account.getPassword(), account.getRoles());
    }

    public UserPrinciple(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }
}
