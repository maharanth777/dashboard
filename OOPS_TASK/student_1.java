package OOPS_TASK;

import java.util.Scanner;

class school {
    private final static String schoolName = "ABC school";
    final static int Student_streangth = 10;
    final static int subjects_count = 5;
    protected int grade = 1;

    void getSchoolName() {
        System.out.println(schoolName);
    }

    void getGrade() {
        System.out.println(this.grade);
    }

    void getGrade(int a) {
        System.out.println(this.grade);
    }

    void getGrade(int a, double b) {
        System.out.println(this.grade);
    }

    void getGrade(double a, int b) {
        System.out.println(this.grade);
    }

}

class student extends school {
    final int st_id;
    String st_name;
    final String DOB;
    int marks[] = new int[subjects_count];

    student(int st_id, String st_name, String DOB) {
        this.DOB = DOB;
        this.st_id = st_id;
        this.st_name = st_name;
    }

    void setGrade(int newGrade) {
        this.grade = newGrade;
    }

    @Override
    void getGrade(int a) {
        System.out.println("Current Grade is " + this.grade);
    }

}

public class student_1 extends student {
    student_1(int st_id, String st_name, String DOB) {
        super(st_id, st_name, DOB);
    }

    void setMarks() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("enter mark " + (i + 1));
            this.marks[i] = sc.nextInt();
        }
    }

    void calculateTotal() {
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        System.out.println("Total Mark : " + total);
    }

    void setSt_name(String st_name) {
        this.st_name = st_name;
    }

    void getSt_id() {
        System.out.println(this.st_id);
    }

    void getSt_name() {
        System.out.println(this.st_name);
    }

    void getSt_DOB() {
        System.out.println(this.DOB);
    }
}
