package String_prgm;

public class String3 {

	public static void main(String[] args) {
		
		String str ="w3resource.com";
		System.out.println("orignal Strin:"+str);
		System.out.println(str.hashCode());
		
		int val=str.codePointBefore(1);
		int val1=str.codePointBefore(10);
				
				System.out.println("String:" +val);
		System.out.println("String:" +val1);

		

	}

}
