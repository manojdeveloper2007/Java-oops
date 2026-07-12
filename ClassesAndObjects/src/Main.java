import java.lang.*;

class Student {
    String name;
    int rollno;
    final int Total = 3;

    Student () {
        this("Manoj",18);
    }

    Student (String name,int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
}

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Student stu1 = new Student();
        Student stu2 = new Student("Sanjay",49);
        Student stu3 = new Student("Varsh",16);

        students[0] = stu1;
        students[1] = stu2;
        students[2] = stu3;

        for(int i=0;i<3;i++) {
            System.out.println("Name : "+students[i].name);
            System.out.println("Rollno : "+students[i].rollno);
            System.out.println();
        }

        Student another = stu1;
        System.out.println(another.name);
        System.out.println(another.rollno);
    }
}
