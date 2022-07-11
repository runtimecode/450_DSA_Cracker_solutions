package Coursera.Week3.codes;

import java.util.Date;
import java.util.Objects;

public class Student implements Comparable{

    int id;
    String name;
    String section;
    Date dob;

    public Student(int id, String name, String section, Date dob){
        this.id= id;
        this.name = name;
        this.section = section;
        this.dob= dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student is id: "+id+" name: "+name+" section: "+section+" dob: "+dob.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name) && Objects.equals(section, student.section) && Objects.equals(dob, student.dob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, section, dob);
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        if(dob.before(student.getDob())){
            return -1;
        }else if(dob.equals(student.getDob())){
            if(id<student.getId()){
                return -1;
            }
            return 0;
        }
        return 0;
    }
}
