package proxy;

import java.util.ArrayList;
import java.util.List;

import Stock.users;
import facade.GetUserName;

public class proxy extends GetUserName implements Iauthorize{
	realAccess access;
	String userName;
	
	GetUserName user1;
	private List<String> users;
	public proxy(String user)
	{
		
		this.userName = user;
		this.user1 = new GetUserName();
		this.users = new ArrayList<String>();
		
		users.add("alaa");
		users.add("mariam");
		
	}
	
	public void display()
	{ boolean b = false;
		for(String s : users) {
			
		
		if (users.contains(user1.userName))
		{
			b=true;
		}
		
		
		
	}
		if (b==true) {
			access = new realAccess(userName);
			access.display();	
		}
		else {
			System.out.println("Error");
		}
	}
}
