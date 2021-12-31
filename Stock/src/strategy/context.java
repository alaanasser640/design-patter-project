package strategy;

public class context {
	 private offers strategy;

	   public context(int num){
		   if (num == 1 ) {
			   this.strategy = new winter();
		}else if (num ==2) {
			 this.strategy = new summer();
		}
		
	      
	   }

	   public void executeStrategy(){
	       strategy.offer();
	   }
}
