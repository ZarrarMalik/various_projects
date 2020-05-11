package parentchild;

public class ParentChild {
	
	protected static int count =0;
	public ParentChild() {
		count++;
	}
	static int getCount() {
		return count;
	}

}

