package BasicCoreProgram;

import java.util.Scanner;

public class SwappingTwoNumber {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			int a,b,temp;
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter first value");
			a=s.nextInt();
			System.out.println("Enter second");
			b=s.nextInt();
			System.out.println("Before swapping a is " + a + " and b is " + b);
			temp=a;
			a=b;
			b=temp;
			
			System.out.println("after swapping a is "+ a + " and b is " + b);
		
	}

}
