package gunIkiOdevBir;

public class CourseManager {

	public void rollCall(Course course) {
		System.out.println(course.name + " Dersine Kat�ld�n�z.");
	}

	public void chooseTeacher(Course course) {
		System.out.println(course.name + " dersi i�in, " + course.teacher + "'u tercih ettiniz.");
	}

}
