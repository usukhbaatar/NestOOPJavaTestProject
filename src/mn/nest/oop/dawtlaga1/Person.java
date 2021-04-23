package mn.nest.oop.dawtlaga1;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person() {
        name = "Temujin";
        age = 3;
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

/*
c++
class Person {
private:
    string name;
    int age;
public:
    Person() {
        name = "Temujin";
        age = 3;
    }
    string getName() {
        return name;
    }
    void setName(string n) {
        name = n;
    }
};
 */
