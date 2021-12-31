package singleton;

import java.util.ArrayList;
import java.util.List;

import facade.GetUserName;

public class authentication {
	private static authentication instance;
	private List<String> users;
	private List<String> passwords;
	String userName;
	String password;
	
	
	public synchronized static  authentication getInstance(String user,String password) {
		if(instance == null) {
			instance = new authentication(user,password);
		}
		return instance;
	}
	
	
	private authentication(String user,String password)
	{
		
		this.userName = user;
		this.password = password;
		this.users = new ArrayList<String>();
		this.passwords = new ArrayList<String>();
		users.add("alaa");
		passwords.add("1234");
		users.add("mariam");
		passwords.add("12345");
		users.add("nada");
		passwords.add("123456");
		users.add("mohamed");
		passwords.add("1234567");
		authenticate();
	}
	
	
	private void authenticate()
	{ 
		
		if (users.contains(this.userName))
		{
			int userIndex = users.indexOf(this.userName);
			if(!this.passwords.get(userIndex).equals(this.password) ){
				System.out.println("password is wrong please try again");
				System.exit(0);
			}else {
				this.success();
			}
		}else {
			System.out.println("we can't find any user with this name");
			System.exit(0);
		}
	}
	private void success() {
		System.out.println();
		System.out.println("You are allowed to access successfully! ");
		System.out.println("**************************************");
	}
}
