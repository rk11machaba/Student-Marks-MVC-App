// main app
// define StudentMarks class
public class StudentMarks{
	public static void main(String[] args) {
		Student student = new Student();

		// enter details
		student.setName("Machaba Kaizer");
		student.setStudNum("123456789");
		student.setCaMarks(85.5);
		student.setPracMarks(97);
		student.setTheoryMarks(78.3);

		// view
		StudentView studentView = new StudentView();

		// controller
		StudentController studentController = new StudentController(student, studentView);

		// display student details
		studentController.displayDetails();
	}
}