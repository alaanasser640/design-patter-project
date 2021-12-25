package facade;

public class WelcomeMsg implements EnterUser {
	public WelcomeMsg() {
		
	}
	
	@Override
	public void printMessage() {
		System.out.println("Welcome to Our Market");
		System.out.println("*********************");
	}
}
