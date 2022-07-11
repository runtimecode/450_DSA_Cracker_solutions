package Coursera.Week3;

import Coursera.Week3.codes.Student;

import java.util.*;

public class TestDriver {

    public static void main(String[] args) throws InterruptedException {

        Random random = new Random();

        int noOfStudent = 10;
        Student[] students = new Student[noOfStudent];

        while(noOfStudent>0){
            students[noOfStudent-1] = new Student(random.nextInt(20),"test "+noOfStudent,"a",new Date());
            Thread.sleep(2000);
            noOfStudent--;
        }

        Arrays.stream(students).sequential().forEach(student -> {
            System.out.println(student.toString());
        });

        Arrays.sort(students, new Comparator<Student>(){
            public int compare(Student s1, Student s2) {
                if(s1.getId()<s2.getId()){
                    return -1;
                }else if(s1.getId()==s2.getId()){
                    if(s1.getDob().before(s2.getDob())){
                        return -1;
                    }
                    return 0;
                }
                return 1;
            }
        });

        System.out.println("After Sorting");

        Arrays.stream(students).sequential().forEach(student -> {
            System.out.println(student.toString());
        });


    }
}
