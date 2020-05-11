package statickeyword;

public class StaticKeyword {
	static int total = 10;
	public void call() {
		int total = 5;
		System.out.println(this.total);
	}
	
	public static void main(String [] args) {
		StaticKeyword a = new StaticKeyword();
		a.call();
	}

}
