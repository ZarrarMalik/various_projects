package parentchild;

public class Child extends ParentChild {
	public Child() {
		count++;
	}
	
public static void main (String [] args) {
	System.out.println("Count = " + getCount());
	Child obj = new Child();
	System.out.println("Count = " + getCount());
}

}
