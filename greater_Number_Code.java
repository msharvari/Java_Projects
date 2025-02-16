package Harry;

import java.util.Scanner;

public class greater_Number_Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int b = sc.nextInt();
		if(b>a)
			System.out.println("Entered Number is greater");
		else if(b<a)
			System.out.println("Entered number is smaller");
		else
			System.out.println("Entered number is equal");
	}

}
