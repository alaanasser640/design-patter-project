package iterator;

public class container implements Icontainer, Istockiterate , getstategy{
	String arr[] = {"Market Stock" ,"Use Strategies"};
	String stock[] = {"Chipsy" ,"Biscuts","Gum"};
	String strategy[] = {"Winter Strategy","Summer Strategy"};
	@Override
	public Iiterator getIterator() {
		return new iterator();
	}
	@Override 
	public Iiterator getproducts() {
		return new stockiterator();
	};
	@Override 
	public Iiterator getstrategy() {
		return new strategies();
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
			if(index<stock.length) {
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
	private class strategies implements Iiterator {
		int index;
		@Override
		public boolean hasNext() {
			if(index<strategy.length) {
				return true;
			}
			return false;
		}
		@Override 
		public Object next() {
			if(this.hasNext()) {
				
				return strategy[index++];
				
			}
			return null;
		}
		
	}
}
