//Write a Java program to test if a given string contains the specified sequence of char values.

public class Assing7 {

	public static void main(String[] args) {
         String str ="PHP Exercises and Python Exercises" ;
         String str0="PHP";
         
         System.out.println("Orignal string: "+str);
         System.out.println("Specified sequence of char values: " + str0);
         System.out.println(str.contains(str0));
	}

}
