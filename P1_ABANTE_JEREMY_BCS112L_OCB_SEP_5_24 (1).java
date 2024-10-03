/*
JEREMY G. ABANTE JR.
SEPTEMBER 5, 2024
BSIT, BCS112L-OCB
*/


import java.util.Scanner;
public class P1_ABANTE_JEREMY_BCS112L_OCB_SEP_5_24
{
	public static void main(String[] args) {

		double input1;
		double input2;
		double input3;
		double input4;
		double answer;
		boolean choice = true;

		//input

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the length of the yard: ");
		input1 = scanner.nextDouble();

		System.out.println("Enter the width of the yard: ");
		input2 = scanner.nextDouble();

		System.out.println("Enter the length of the house: ");
		input3 = scanner.nextDouble();

		System.out.println("Enter the width of the house: ");
		input4 = scanner.nextDouble();

		//Process

		answer = ((input1*input2)-(input3*input4))/2;

		//Output

		System.out.println("The time required to cut the grass is: " + answer + " seconds");


	}
}