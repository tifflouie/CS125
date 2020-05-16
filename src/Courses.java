
public class Courses {

	String name;
	int roomNumber;
	String teacher;
	int numStudents;
	
	
	Courses(String name, int roomNumber, String teacher, int numStudents) {
		
		this.name = name;
		this.roomNumber = roomNumber;
		this.teacher = teacher;
		this.numStudents = numStudents;
		
	}
	
	
	Courses(String name, int roomNumber, String teacher) {
		
		this.name = name;
		this.roomNumber = roomNumber;
		this.teacher = teacher;
		this.numStudents = 44;
		
	}
	
	
	Courses(String name, int roomNumber) {
		
		this(name, roomNumber, "Teacher Sushi", 22);
		
	}
	
	public void printCourses(){
		System.out.println(this.name + " " + this.roomNumber + " " + this.teacher + " " + this.numStudents); 
	}
	
}


