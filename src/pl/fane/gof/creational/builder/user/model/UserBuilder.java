package pl.fane.gof.creational.builder.user.model;

import pl.fane.gof.creational.builder.user.Builder;

public class UserBuilder implements Builder<User> {

    private User user;

    public UserBuilder() {
        this.user = new User();
    }

    @Override
    public User build() {
        try{
            return user;
        }finally {
            user = new User();
        }
    }

    public UserBuilder surname(String surname) {
        user.setSurname(surname);
        return this;
    }

    public UserBuilder lastname(String lastname) {
        user.setLastname(lastname);
        return this;
    }

    public UserBuilder email(String email) {
        user.setEmail(email);
        return this;
    }

    public UserBuilder age(Integer age) {
        user.setAge(age);
        return this;
    }

    public UserBuilder height(Integer height) {
        user.setHeight(height);
        return this;
    }
}
