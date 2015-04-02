public class Lesson_15_Activity {

	/**
	* @param args
    */
	
	public static void main(String str[])
	 {
	   String [] list = { "against" , "forms" , "belief" , "government" , "democratic" , "movement" , "understanding"};
	   sortAndPrint(list);
	 }
	 public static void sortAndPrint(String [] list)
	 {
	  for(int n = 0; n < list.length-1; n++)
	  {
	    String temp = "z";
	    int loc = 0;
	    for(int i = n; i<list.length; i++)
	    {
	      if(temp.compareTo(list[i]) > 0)
	      {
	        temp = list[i];
	        loc = i;
	      }    
	    }
	    
	    String temp2 = list[n];
	    list[n] = temp;
	    list[loc] = temp2;
	  }
	  for(int i = 0; i <list.length; i++)
	    System.out.print(list[i] + " ");
	  
	  
	 }
	}