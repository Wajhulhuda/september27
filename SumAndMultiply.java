package september27;

import java.util.Scanner;

public class SumAndMultiply {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers..");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		int addition = add(num1,num2);
		System.out.println("The addition of two numbers is : "+addition);
		
		
		int multiply = multiply(num1, num2);
		System.out.println("The multiplication of two number is : "+multiply);
	}
	
	public static int add(int num1, int num2) {
		return num1+num2;
	}
	public static int multiply(int num1, int num2) {
		return num1*num2;
	}

}
