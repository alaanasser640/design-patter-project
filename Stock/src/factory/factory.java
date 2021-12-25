package factory;

import proxy.realAccess;

public class factory {
	int num ;
	
	public factory() {
		realAccess no = new realAccess();
		this.num = no.selectedproduct;
	}
	public Ifactory getPizza(){
	      	
	      if(num ==1){
	         return new Chipsy();
	         
	      }else if(num ==2){
		         return new Biscuits();
		         
		  }else if(num ==3){
		         return new Gum();
		         
		  }
	      
	      return null;
	}
}
