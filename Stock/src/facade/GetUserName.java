package facade;

import java.util.Scanner;

public class GetUserName implements EnterUser {
	public static String userName;
	public GetUserName() {
		
	}
	@Override
	public void printMessage() {
		Scanner sc = new Scanner(System.in);
		System.out.println("User Name: ");
		userName = sc.nextLine();
		System.out.println("Password: ");
		String password = sc.nextLine();
		System.out.println();
		System.out.println("Hello "+userName + " (^.^)");
		System.out.println();
	}
}
