package String_prgm;

import java.util.Scanner;

public class StringReverseWordByWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input String");
		String input = sc.nextLine();

		String output = " ";
		
		String split[] = input.split(" ");
		
		for (int i=split.length-1; i>=0; i--) {
			output =output + split[i] + " ";
			System.out.println(split[i]);
		}
		System.out.println("Reverse word by word:" + output);
	}

}
//split=remove the space and stored into array
