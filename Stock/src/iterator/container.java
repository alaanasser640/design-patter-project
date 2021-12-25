package iterator;

public class container implements Icontainer, Istockiterate {
	String arr[] = {"Market Stock" ,"Add Product","Remove Product"};
	String stock[] = {"Chipsy" ,"Biscuts","Gum"};
	@Override
	public Iiterator getIterator() {
		return new iterator();
	}
	@Override 
	public Iiterator getproducts() {
		return new stockiterator();
	};
	
	private class iterator implements Iiterator {
		int index;
		@Override
		public boolean hasNext() {
			if(index<arr.length) {
				return true;
			}
			return false;
		}
		@Override 
		public Object next() {
			if(this.hasNext()) {
				
				return arr[index++];
				
			}
			return null;
		}
		
	}
	private class stockiterator implements Iiterator {
		int index;
		@Override
		public boolean hasNext() {
			if(index<arr.length) {
				return true;
			}
			return false;
		}
		@Override 
		public Object next() {
			if(this.hasNext()) {
				
				return stock[index++];
				
			}
			return null;
		}
		
	}
}
