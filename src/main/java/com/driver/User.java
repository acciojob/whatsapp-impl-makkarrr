package com.driver;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class User {
    private String name;
    private String mobile;

    public User(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getName(), user.getName()) && Objects.equals(getMobile(), user.getMobile());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMobile());
    }
}
