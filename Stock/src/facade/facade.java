package facade;

public class facade {
	public facade() {
		m1 = new WelcomeMsg();
		m2 = new GetUserName();
		
	}
	WelcomeMsg m1;
	GetUserName m2;
	public void run() {
		m1.printMessage();
		m2.printMessage();
	}
}
