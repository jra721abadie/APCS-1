package asssignment_3;

public class Student extends Person {

	private int studentId;
	private static int count = 0;
	private int level;
	
	public Student(String fName, String lName, int gLevel) {
		super(fName, lName);
		if (gLevel >= 0 && gLevel <= 12)
			level = gLevel;
		else
			level = 0;
		count++;
		studentId = count;
	}
	
	public int getLevel() {
		return level;
	}
	
	public String toString() {
		String s = super.toString() + "\n \t Grade Level: " + level + "\n \t ID #: " + studentId; 
		return s;
	}

}
