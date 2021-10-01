package september27;

import java.util.Scanner;

public class CheckNumber {
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number ");
	int num = sc.nextInt();
	sc.close();
	isNumber(num);
	}
public static void isNumber(int num) {
	if(num<100) {
		System.out.println("Number is less than 100 ");
		if(num<=50) {
			System.out.println("Number is less than 50");
		}
		else {
			System.out.println("Number is greater 50");
		}
	}else {
		System.out.println("Number is greater than 100");
	}
		
	}
}
