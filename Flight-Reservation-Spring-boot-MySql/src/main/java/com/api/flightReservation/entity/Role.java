package com.api.flightReservation.entity;

import org.springframework.security.core.GrantedAuthority;

import com.api.flightReservation.entity.common.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Role extends AbstractEntity  implements GrantedAuthority {

    private String name;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAuthority() {
        return name;
    }
}
