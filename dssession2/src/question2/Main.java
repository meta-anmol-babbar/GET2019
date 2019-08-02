package question2;

public class Main {

	public static void main(String[] args) {
		CircularQueue c=new CircularQueue(5);
		System.out.println(c.addItem(5));
		System.out.println(c.addItem(1));
		System.out.println(c.addItem(2));
		System.out.println(c.addItem(3));
		System.out.println(c.addItem(5));
		//System.out.println(c.deleteItem());
		//System.out.println(c.deleteItem());
		//System.out.println(c.deleteItem());
		//System.out.println(c.deleteItem());
		//System.out.println(c.deleteItem());
		//System.out.println(c.deleteItem());
		System.out.println(c.addItem(11));
		//System.out.println(c.deleteItem());
		System.out.println(c.checkEmptyOrFull());
		c.print();
	}

}
