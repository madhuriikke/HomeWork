package String_prgm;
//Write a Java program to get the character (Unicode code point) at the given 
//index within the String.
public class String2 {

	public static void main(String[] args) {
		String str = "w3resource.com";
		System.out.println("Orignal String: " + str);
		System.out.println(str.hashCode());

		int val1 = str.codePointAt(1);

		int val2 = str.codePointAt(9);
		System.out.println("Character(unicode)=" + val1);
		System.out.println("Character(unicode)=" + val2);

	}

}
