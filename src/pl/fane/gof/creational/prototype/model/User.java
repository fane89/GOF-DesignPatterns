package pl.fane.gof.creational.prototype.model;

public class User {

    private String surname;
    private String lastname;
    private String email;
    private Integer age;
    private Integer height;

    public User(User sourceUser) {
        setAge(sourceUser.getAge());
        setEmail(sourceUser.getEmail());
        setHeight(sourceUser.getHeight());
        setLastname(sourceUser.getLastname());
        setSurname(sourceUser.getSurname());
    }

    public User() {
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "User{" +
                "surname='" + surname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", [reference]=" + super.toString() +
                '}';
    }
}
