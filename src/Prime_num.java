import java.util.Scanner;

public class Prime_num {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		System.out.println("Enter the number");
		
		  int temp =0; 
		  for(int i=2;i<=num;i++) 
		  { if(num%i==0) 
		  { temp=temp+1; 
		  } 
		  }
		  if(temp==0) 
		  { System.out.println(num+"  is prime"); } 
		  else 
		  {
		  System.out.println(num +"  is not prime"); }
		 
	}
	

}
