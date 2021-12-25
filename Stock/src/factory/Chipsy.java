package factory;

public class Chipsy implements Ifactory {
	@Override
	public void contain() {
		System.out.println();
		System.out.println("Chipsy Flavors");
		System.out.println("**************************************");
		System.out.println("1- Cheese Chipsy");
		System.out.println("2- Tomato Chipsy");
		System.out.println("3- Salt Chipsy");
	}
}
