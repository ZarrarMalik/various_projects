package complexprocessing;

public class ComplexProcessing {
	public void testExecute(int timeoutValue) {
		
	}

	public static void main(String [] args) {
		ComplexProcessing testObject = new ComplexProcessing();
		new ComplexProcessing().testExecute(10);
		
		
		int c = 0;
		System.out.println((0 == c++)? "true": "false");
		String e = "1";
		System.out.println(("1" != e) ? "true": "false");
		boolean b = false;
		System.out.println((b = true) ? "true": "false");
		Double d = null;
		System.out.println((d instanceof Double)? "true":"false");
		int a =0;
		System.out.println((a !=0)? "true":"false");

	}
	
}
