package june_2024_q1;

import java.util.ArrayList;

public class StudentManager {

	
	ArrayList<Student> studentList =new ArrayList<>();

	public StudentManager() {
		super();
	}
	
	public void  addStudent(Student student) {
		studentList.add(student);
	}
	
	public void  searchStudent(int studentID) {
		
		for(Student s1 : studentList) {
			if(studentID == s1.getStudentID()) {
				s1.StudentDetails();
			}		
		}
	}
	
	public void  updateStudentGPA(int studentID, double newGPA) {
		for(Student s1 : studentList) {
			
			if(studentID == s1.getStudentID()) {
				
				s1.setGPA(newGPA);
				s1.StudentDetails();
			}
//			if(studentList.contains(studentID)) {
//				studentList.set(newGPA);
//			}
		}
	}

	public void  displayAllStudent() {
		for(Student s1 : studentList) {
			
			s1.StudentDetails();
		}
	}
	
}
