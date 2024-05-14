// StudentController (Controller component)
public class StudentController{
	// declare model and a view
	private Student model; // model
	private StudentView view; // view

	// constructor
	public StudentController(Student model, StudentView view){
		this.model = model;
		this.view = view;
	}

	// update student details
	public void updateDetails(String name, String studNum, double caMarks, double pracMarks, double theoryMarks){
		model.setName(name);
		model.setStudNum(studNum);
		model.setCaMarks(caMarks);
		model.setPracMarks(pracMarks);
		model.setTheoryMarks(theoryMarks);
	}

	// display student details
	public void displayDetails(){
		view.displayStudent(model);
	}
}