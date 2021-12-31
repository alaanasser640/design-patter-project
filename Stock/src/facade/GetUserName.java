package facade;

import java.util.Scanner;

public class GetUserName implements EnterUser {
	public static String userName;
	public static String password;
	public GetUserName() {
		
	}
	@Override
	public void printMessage() {
		Scanner sc = new Scanner(System.in);
		System.out.println("User Name: ");
		userName = sc.nextLine();
		System.out.println("Password: ");
		password = sc.nextLine();
		
	}
}
