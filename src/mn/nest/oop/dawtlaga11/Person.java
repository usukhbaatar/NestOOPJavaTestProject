package mn.nest.oop.dawtlaga11;

import java.util.Date;

public class Person {
    String name;
    String bio;
    Date dob;

    public Person(String name, String bio, Date dob) {
        this.name = name;
        this.bio = bio;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
