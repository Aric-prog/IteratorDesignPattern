
public class Driver {
	public static void main(String args[]) {
		ConcreteContainer obj = new ConcreteContainer();
		for(Iterator itr = obj.getIterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}
	}
}
