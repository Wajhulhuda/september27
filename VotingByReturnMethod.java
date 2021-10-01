package september27;

import java.util.Scanner;

public class VotingByReturnMethod {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of the person");
		int age = sc.nextInt();
		sc.close();
		boolean flag = (Validate(age));
		
		if(flag == true) {
			System.out.println("Person can vote");
		}
		else {
			System.out.println("Person can't vote");
		}
	}
	public static boolean Validate(int age) {
		
		if(age<=18) {
			return false;
		}else {
			return true;
		}
		
	}

}
