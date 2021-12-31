package proxy;

import java.util.Scanner;

import facade.GetUserName;
import iterator.Iiterator;
import iterator.container;

public class realAccess implements Iauthorize {
	
		private String userName;
		
		public static int productNo;
		public static int selectedproduct;
		public realAccess() {}
		
		
		public realAccess(String userName2) {
			this.userName = userName2;
		}

		GetUserName s1 = new GetUserName();

		public void display()
		{
			
		    userName = s1.userName;
		    System.out.println("Hello "+userName + " (^.^)");
			System.out.println();
			System.out.println("Welcome In The Market");
			System.out.println("**************************************");
			container namesRepository1 = new container();
			int number1 =1;
		      for(Iiterator iter = namesRepository1.getIterator(); iter.hasNext();){
		         
		         System.out.println(number1+"- " + iter.next());
		         number1++;
		         
		      } 	
			System.out.println();
			System.out.print("Enter number of selected option: ");
			Scanner sr = new Scanner(System.in);
			productNo = sr.nextInt();
			System.out.println();
			if(productNo == 1) {
				
				System.out.println("Market Stock");
				System.out.println("**************************************");
				container namesRepository2 = new container();
				int number2=1;
				for(Iiterator iter = namesRepository2.getproducts(); iter.hasNext();){
			         
			         System.out.println(number2+"- " + iter.next());
			         number2++;
			         
			      } 
				System.out.println();
				System.out.print("Enter number of selected Product: ");
				Scanner s = new Scanner(System.in);
				selectedproduct = s.nextInt();
			}
			else {
				System.out.println("Market Strategies");
				System.out.println("**************************************");
				container namesRepository3 = new container();
				int number3=1;
				for(Iiterator iter = namesRepository3.getstrategy(); iter.hasNext();){
			         
			         System.out.println(number3+"- " + iter.next());
			         number3++;
			         
			      } 
				
				System.out.println();
				System.out.print("Enter the number of strategy to apply it : ");
				Scanner s = new Scanner(System.in);
				selectedproduct = s.nextInt();
			    System.out.println();
			}
				
		}
	
}
