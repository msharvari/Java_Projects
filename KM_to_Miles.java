package Harry;

import java.util.Scanner;

public class KM_to_Miles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your value in KM");
		Scanner sc = new Scanner(System.in);
		float km = sc.nextFloat();
		float miles = (float) (km*0.6214);
		System.out.println(miles);
	
	}

}
