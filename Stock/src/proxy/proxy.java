package proxy;

import java.util.ArrayList;
import java.util.List;

import Stock.users;
import facade.GetUserName;
import singleton.authentication;

public class proxy extends GetUserName implements Iauthorize{
	realAccess access;
	private authentication authan ;
	String userName;
	String password;
	GetUserName user1;
	
	public proxy(String user,String password)
	{
		this.userName = user;
		this.password = password;
		this.authenticate();
	}
	public void authenticate() {
		authan =authentication.getInstance(this.userName,this.password);
		
	}
	public void display()
	{ 
		access = new realAccess(userName);
		access.display();	
	}
}
