package BasicCoreProgram;

import java.util.Scanner;

public class LargestOfThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a,b,c;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three number");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		 
		if(a>b && a>c)
			System.out.println(a + " is greater");
		else if(b>c && b>a)
			System.out.println(b + " is greater");
		else
			System.out.println(c + " is greater");
	}

}
