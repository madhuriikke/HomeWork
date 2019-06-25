package String_prgm;

public class String9 {

	public static void main(String[] args) {

		String str1 ="Hi Madhui Ikke";
		String str2 ="hi madhuri ikke";
		 StringBuffer sb =new StringBuffer(str1);
		 
		 System.out.println("Comparing  "+str1+" and "+ str1+": " + str1.compareToIgnoreCase(str2));
		 System.out.println("Comparing  "+str2+" and "+ str2+": " + str2.compareToIgnoreCase(str1));
	}

}
