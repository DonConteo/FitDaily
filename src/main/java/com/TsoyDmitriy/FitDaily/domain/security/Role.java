package com.TsoyDmitriy.FitDaily.domain.security;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "auth_role")
public class Role implements GrantedAuthority {

    @Id
    private Integer id;
    private String name;

    @Override
    public String getAuthority() {
        return String.format("ROLE_%s", name);
    }

    public Role(String name) {
        this.name = name;
    }
}
