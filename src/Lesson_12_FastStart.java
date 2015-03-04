import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
public class Lesson_12_FastStart {

	/**
	* @param args
    */
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("oh");
		list.add("man");
		list.add("oh");
		list.add("man");
		list.add("oh");
		list.add("man");
		list.add("oh");
		list.add("man");
		list.add("oh");
		list.add("man");
		int r1 = (int) (Math.random()*9);
		int r2 = (int) (Math.random()*9);
		System.out.println(list.get(r1));
		System.out.println(list.get(r2));

    }
}