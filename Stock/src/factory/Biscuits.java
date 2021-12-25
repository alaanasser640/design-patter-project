package factory;

public class Biscuits implements Ifactory {
	@Override
	public void contain() {
		System.out.println();
		System.out.println("Biscuits Flavors");
		System.out.println("**************************************");
		System.out.println("1- Chocolate Biscuits");
		System.out.println("2- Vanilla Biscuits");
		System.out.println("3- Salt Biscuits");
	}
}
