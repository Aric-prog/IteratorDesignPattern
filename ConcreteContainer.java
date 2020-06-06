
public class ConcreteContainer implements Container{
	String[] arr = {"Spring 2019","Fall 2019","Winter 2019"};
	public Iterator getIterator() {
		return new ConcreteIterator();
	}
	private class ConcreteIterator implements Iterator{
		int index = 0;
		
		@Override
		public boolean hasNext() {
			if(index < arr.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if(hasNext()) {
				return arr[index++];	
			}
			return null;
		}
		
	}
}
