package Harry;

import java.util.Scanner;

public class percentageToCGPA_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter marks of all 5 subjects");
		Scanner sc = new Scanner(System.in);
		float a1 = sc.nextFloat();
		float a2 = sc.nextFloat();
		float a3 = sc.nextFloat();
		float a4 = sc.nextFloat();
		float a5 = sc.nextFloat();
		float a = a1 + a2 + a3 + a4 + a5;
		float b = (a/500)*100;
		System.out.println("Percentage = "+b);
		float c  = (float) (b / 9.5);
		System.out.println("CGPA = " +c);
			
	}
	

}
