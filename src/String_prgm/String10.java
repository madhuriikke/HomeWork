package String_prgm;

public class String10 {

	public static void main(String[] args) {
		//Character array with data.
		char[] arr_num  = new char[] {'1', '2', '3', '4'};

		// Create a String containing the contents of arr_num
		// starting at index 1 for index 2.
		String str = String.copyValueOf(arr_num,0,3);

		//Display the result of the new stringds.

		System.out.println(str);

	}

}
