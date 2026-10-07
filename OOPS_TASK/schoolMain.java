package OOPS_TASK;

public class schoolMain {
    public static void main(String[] args) {
        school student2 = new student(111, "mah", "01/01/2000"); // upcasting

        if (student2 instanceof student_1) {
            student st = (student_1) student2; // downcasting
            System.out.println("yes");
        } else {
            System.out.println(false);
        }

        student2.getSchoolName();

        // student2.setMarks();

        // student2.calculateTotal();

        // st.setGrade(12);

        student2.getGrade();

    }
}
