package september27;

import java.util.Scanner;

public class VotingEligible {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int age = sc.nextInt();
		sc.close();
		isEligible(age);
	}
	public static void isEligible(int age) {
		if(age>=18) {
			System.out.println("You are eligible for voting");
		}else {
			System.out.println("You are not eligible for voting");
		}
	}

}
