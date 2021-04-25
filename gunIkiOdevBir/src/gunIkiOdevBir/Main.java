package gunIkiOdevBir;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "Java + React", "Engin Demirog");
		Course course2 = new Course(2, "C# + Angular", "Engin Demirog");
		Course course3 = new Course(3, "Programlamaya Giriþ", "Engin Demirog");

		Course[] courses = { course1, course2, course3 };

		for (Course course : courses) {
			System.out.println(course.id + ". " + course.name);
		}

		System.out.println("- - - - - - - - - ");

		CourseManager courseManager = new CourseManager();
		courseManager.rollCall(course1);
		courseManager.chooseTeacher(course2);
	}

}
