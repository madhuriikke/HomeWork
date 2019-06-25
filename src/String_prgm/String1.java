package String_prgm;
// Write a Java program to get the character at the given index within the String.

public class String1 {

	public static void main(String[] args) {
		
		String str ="Java Exercise!";
		String str2 ="Java Exercise!";
		
		System.out.println("Orignal String "+str);
         
		int index = str.charAt(0);
		int index1 = str.charAt(10);
		System.out.println("The Character as 0 is "+(char)index);
		System.out.println("The Character at postisions is " +(char)index1);
		
	}

}
