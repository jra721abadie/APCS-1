package assignment_6;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	/**
	* @param args
    */
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
        ArrayList <String> list = new ArrayList<String> ();
		String input = null;
		while (input.toLowerCase() != "stop")
		{
			System.out.println("Enter the next name:");
			input = scan.nextLine();
			input = titleCase(input);
			list.add(input);
		}
		list.remove(list.size()-1);
		System.out.println(list);
    }
	
	public static String titleCase(String s)
	{
		return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
	}
	
	public static ArrayList<String> sort(ArrayList<String> in)
	{
		ArrayList<String> out = new ArrayList<String>();
		int pointer = 0;
		
		return out;
	}
}