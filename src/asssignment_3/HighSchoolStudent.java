package asssignment_3;

public class HighSchoolStudent extends Student{

	private double gpa;
	
	public HighSchoolStudent(String fName, String lName, int gLevel, double GPA) {
		super(fName, lName, gLevel);
		if (GPA >= 0 && GPA <= 5)
			gpa = GPA;
		else
			gpa = 0;
	}
	
	public String toString() {
		return "";
	}
	

}
