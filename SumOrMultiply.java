package september27;

import java.util.Scanner;

public class SumOrMultiply {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number..");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second number..");
		int num2 = sc.nextInt();
		
		System.out.println("What you want do to. write sum or multiply..");
		String operator = sc.next();
		
		String ad="sum";
		String mul = "multiply";
		
		int addition = add(num1,num2);
		int multiply = multiply(num1,num2);
		
		if(operator.equals(ad)) {
			
			System.out.println("The addition is "+addition);
			
		}else if(operator.equals(mul)){
			
			System.out.println("The multiplication is "+multiply);
		}else {
			System.out.println("Please select a right operation");
		}
	}
	
	public static int add(int num1, int num2) {
		return num1+num2;
	}
	
	public static int multiply(int num1, int num2) {
		return num1*num2;
	}
	

}
