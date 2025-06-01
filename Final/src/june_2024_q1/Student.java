package june_2024_q1;

public class Student {

	private int studentID;
	private String name;
	private int age;
	private String major;
	private double GPA;

	
	public Student() {
		super();
	}


	public Student(int studentID, String name, int age, String major, double gPA) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.age = age;
		this.major = major;
		GPA = gPA;
	}
	
	
	
	
	public void setGPA(double gPA) {
		GPA = gPA;
	}


	public int getStudentID() {
		return studentID;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public String getMajor() {
		return major;
	}


	public double getGPA() {
		return GPA;
	}


	public void updateGPA(double newGPA) {
		this.GPA = newGPA;
	}
	
	
	public void StudentDetails() {
		System.out.println("Student ID "+getStudentID());
		System.out.println("Student Name "+ getName() );
		System.out.println("Student age "+getAge());
		System.out.println("Student major "+ getMajor());
		System.out.println("Student GPA "+ getGPA());
		System.out.println(" ");
		
	}
	
	
	
}
