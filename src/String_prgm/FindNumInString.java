package String_prgm;

public class FindNumInString {

	static void FindNumInString(String str) {
		int a = 0;
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				a++;
				// System.out.println(ch);
			}
		}
		System.out.println("No of Digit is:" + a);

	}

	public static void main(String[] args) {
		FindNumInString("Madhuri12344567");

	}

}
//charAt=sepret out character into string  
