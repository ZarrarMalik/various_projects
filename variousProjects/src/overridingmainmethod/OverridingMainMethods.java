package overridingmainmethod;

public class OverridingMainMethods {
 
	
	public static void main(String [] args) {
		System.out.println("main 1");
		
		int x =5;
		System.out.println(x);
	}
	
	public static void main() {
		System.out.println("main 2");
	}
}
