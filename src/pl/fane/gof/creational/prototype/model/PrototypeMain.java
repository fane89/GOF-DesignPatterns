package pl.fane.gof.creational.prototype.model;

public class PrototypeMain {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setSurname("John");
        user1.setLastname("Novak");

        User user2 = new User(user1);
        user2.setAge(12);

        System.out.println(user1 + " " + user2);
    }
}
