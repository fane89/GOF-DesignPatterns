package pl.fane.gof.creational.builder.user;

import pl.fane.gof.creational.builder.user.model.User;
import pl.fane.gof.creational.builder.user.model.UserBuilder;

public class BuilderMain {

    public static void main(String[] args) {
        UserBuilder userBuilder = new UserBuilder();
        User john = userBuilder.surname("John").lastname("Smith").build();
        User adam = userBuilder.surname("Adam").lastname("Novak").build();

        System.out.println(john + " " + adam);
    }
}
