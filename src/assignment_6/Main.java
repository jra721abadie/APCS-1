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
		String input = "null";
		while (!(input.equals("Stop")))
		{
			System.out.println("Enter the next name:");
			input = scan.nextLine();
			input = titleCase(input);
			list.add(input);
		}
		list.remove(list.size()-1);
		System.out.println(sort(list));
    }
	
	public static String titleCase(String s)
	{
		return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
	}
	
	public static ArrayList<String> sort(ArrayList<String> in)
	{
		for (int i = 0; i < in.size(); i ++)
        {
			String key = in.get(i);
			for (int j = i+1; j < in.size(); j ++)
			{
				if (key.compareTo(in.get(j)) > 0)
				{
					String temp = in.get(j);
					in.set(j,key);
					in.set(i,temp);
					key = temp;
				}
			}
        }
		return in;
	}
}