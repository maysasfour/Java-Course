package Javac;

public class Student {

    private String stuId;
    private String fName;
    private String lName;
    private int age;
    private String gender;

    public Student(String stuId, String fName, String lName, int age, String gender) {
        this.stuId = stuId;
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.gender = gender;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
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

    @Override
    public String toString() {
        return "Javac.Student{" +
                "stuId='" + getStuId() + '\'' +
                ", fName='" + getfName() + '\'' +
                ", lName='" + getlName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                '}';
    }
}
