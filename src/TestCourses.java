
public class TestCourses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Courses course1 = new Courses("math", 56);
		Courses course2 = new Courses("science", 99, "Teacher Daddy", 81);
		Courses course3 = new Courses("bio", 21, "Teacher SH SH");
		
		course1.printCourses();
		course2.printCourses();
		course3.printCourses();
	}

}
