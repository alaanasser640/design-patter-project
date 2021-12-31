
package Stock;

import facade.GetUserName;
import facade.facade;
import factory.Ifactory;
import factory.factory;
import proxy.proxy;
import proxy.realAccess;
import strategy.context;

public class users {
	public static void main(String[] args) {
		facade run = new facade();
		run.run();
		proxy p = new proxy(GetUserName.userName,GetUserName.password);
		p.display();
		realAccess r = new realAccess();
		int num = r.productNo;
		if(num == 1 ) {
			factory f = new factory();
			Ifactory x = f.getcategory();
			x.contain();
		}
		else {
		realAccess product = new realAccess();
		int pronumber = product.selectedproduct;
		
			context c = new context(pronumber);
			c.executeStrategy();
		
		}
		
		
	}
}
