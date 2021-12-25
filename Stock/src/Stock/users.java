package Stock;

import facade.GetUserName;
import facade.facade;
import factory.Ifactory;
import factory.factory;
import proxy.proxy;

public class users {
	public static void main(String[] args) {
		facade run = new facade();
		run.run();
		GetUserName u = new GetUserName();
		String username=u.userName;
		proxy p = new proxy(username);
		p.display();
		factory f = new factory();
		Ifactory x = f.getPizza();
		x.contain();
	}
}
