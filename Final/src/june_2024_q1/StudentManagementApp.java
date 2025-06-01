package june_2024_q1;

public class StudentManagementApp {

    public static void main(String[] args) { // This is the main method where execution begins
        StudentManager manager = new StudentManager();

        // Now you can add students inside the main method
        manager.addStudent(new Student(101, "Alice Smith", 20, "Computer Science", 3.75));
        manager.addStudent(new Student(102, "Bob Johnson", 22, "Electrical Eng.", 3.20));
        manager.addStudent(new Student(103, "Charlie Davis", 19, "Biology", 3.90));

        // You can now call other manager methods here, for example:
        manager.displayAllStudent();
        manager.updateStudentGPA(101, 3.8);   
        manager.searchStudent(102);
    }
}