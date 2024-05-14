// Student Model

// define Student class
public class Student{
	// declare variables
	private String name;
	private String studNum;
	private double caMarks;
	private double theoryMarks;
	private double pracMarks;

	// getters
	// getters returns
	public String getName() { return name; }
	public String getStudNum() { return studNum; }
	public double getCaMarks() { return caMarks; }
	public double getTheoryMarks() { return theoryMarks; }
	public double getPracMarks() { return pracMarks; }

	// setters
	// setters are void and they take @params
	public void setName(String name) { 
		this.name = name; 
	}

	public void setStudNum(String studNum){
		this.studNum = studNum;
	}

	public void setCaMarks(double caMarks){
		this.caMarks = caMarks;
	}

	public void setTheoryMarks(double theoryMarks){
		this.theoryMarks = theoryMarks;
	}

	public void setPracMarks(double pracMarks){
		this.pracMarks = pracMarks;
	}

	// function to calculate mean/average
	public double finalMarks(){
		double average = (caMarks + pracMarks + theoryMarks) / 3;

		return average;
	}
}