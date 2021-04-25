package gunIkiOdevBir;

public class CourseManager {

	public void rollCall(Course course) {
		System.out.println(course.name + " Dersine Katýldýnýz.");
	}

	public void chooseTeacher(Course course) {
		System.out.println(course.name + " dersi için, " + course.teacher + "'u tercih ettiniz.");
	}

}
