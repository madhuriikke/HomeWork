package String_prgm;

public class WithoutFun_revs {

	public static void main(String[] args) {
		String name="Madhuri Ikke";//char.lenth-1=11
		//System.out.println(name.length());
		char chr[]=name.toCharArray();// converted to character array and printed in reverse order
		for(int i=chr.length-1;i>=0;i--) {//11>=0 true upto 1
			System.out.println(chr[i]);
		}

	}

}
//ToCharArray()=convrt string into chararry