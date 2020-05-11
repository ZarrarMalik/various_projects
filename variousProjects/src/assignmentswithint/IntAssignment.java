package assignmentswithint;

import java.util.ArrayList;
import java.util.List;

public class IntAssignment {

	public static void main(String [] args) {
		
		List<Integer> myList = new ArrayList<Integer>();
		
		
		
		Integer n = new Integer(500);
		int myInt = n;
		System.out.println(n);
		
		
		
		long myLong = 500L;
		int myInt1 = (int) myLong;
		System.out.println(myInt1);
		int myInt2 = 500;
		System.out.println(myInt2);
		
		long myLong1 = 500L;
		short myShort = (short) myLong1;
		int myInt3 = myShort;
		System.out.println(myInt3);
		
		String d = "500";
		int myInt4 = Integer.parseUnsignedInt(d);
		System.out.println(myInt4);

		

		
	}
	
	
	
	
}
