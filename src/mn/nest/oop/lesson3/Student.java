package mn.nest.oop.lesson3;

public class Student extends Person {
    // name, age, gender
    private String id;
    private String schoolName;

    public Student() {
    }

    public Student(String name, int age, String gender, String id, String schoolName) {
        super(name, age, gender);
        this.id = id;
        this.schoolName = schoolName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
