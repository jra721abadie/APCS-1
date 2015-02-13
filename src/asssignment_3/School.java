package asssignment_3;

import java.util.ArrayList;


public class School {

	private ArrayList<Student> students;
	private ArrayList<Teacher> teachers;
	
	public School(ArrayList<Student> students, ArrayList<Teacher> teachers) {
		
	}
	
	public String getGradeLevel(int level) {
		return null;
	}
	
	public String toString() {
		String r = "Faculty: \n";
		for (Teacher t: teachers)
		{
			r = r + t.toString() + "\n";
		}
		r = r + "\n Student Body: \n";
		for (Student s: students)
		{
			r = r + s.toString() + "\n";
		}
		return r;
	}
	
}
