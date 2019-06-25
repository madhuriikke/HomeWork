import java.util.Scanner;

public class merge {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first String");
		String s1 =sc.nextLine();
		System.out.println("Entet the secoand String");
		String s2 =sc.nextLine();
	    
		
		for(int i=0;i<s1.length();i++) {
			char ch = s1.charAt(i);
			if(i==s2.length()) {
				break;
			
			}

			System.out.print(ch);
			
			
			for(int j=i ;j<s2.length();j++) {
				char ch1 =s2.charAt(j);
				System.out.print(ch1);
				break;
			}
		}
		
		    if(s1.length()>s2.length()) {
			System.out.println(s1.substring(s2.length()));
		}
			else
			{ 
			System.out.println(s2.substring(s1.length()));
				
			}
		}
		
		
	}


