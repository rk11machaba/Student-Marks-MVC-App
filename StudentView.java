// StudentView (View Component)

public class StudentView{
	// function to display student details
	public void displayStudent(Student student){
		System.out.println("Student Name\tStudent Number\tCaMarks\tPracMarks\tTheory\tFinal Marks");
		System.out.println(student.getName() + "\t" + student.getStudNum() + "\t" + 
			student.getCaMarks() + "\t" + student.getPracMarks() + "\t" + 
			student.getTheoryMarks() + student.finalMarks());
	}
}