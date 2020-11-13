package com.labaik.vivification.domain.enums;

import org.springframework.security.core.GrantedAuthority;

public enum Roles implements GrantedAuthority {
    poor,benefactor,admin;

    @Override
    public String getAuthority() {
        return null;
    }
}
