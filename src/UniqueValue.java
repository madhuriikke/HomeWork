import java.util.Scanner;

public class UniqueValue {

		
		   public static void main (String[]args){
		   Scanner kb = new Scanner (System.in); 
		     String word = " ";

		     System.out.println("Enter a word: ");
		     word = kb.nextLine();

		     UniqueValue(word); 
		}

		    public static  void UniqueValue(String test){
		      String temp = " ";
		         for (int i = 0; i < test.length(); i++){
		            if (temp.indexOf(test.charAt(i)) == - 1){
		               temp = temp + test.charAt(i);
		         }
		      }

		    System.out.println(temp + " ");

	}

}
