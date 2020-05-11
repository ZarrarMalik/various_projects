package optionalTest;

import java.util.Optional;

public class OptionalTesting {

	public static void main(String[] args) {
		String a = null;
		Optional<String> b = Optional.empty();
		try {
			System.out.println(a.length());
			System.out.println(b.orElse("").length());
		}
		catch (Exception ex) {
			System.out.println(a);
		}
		finally {
			a = "String";
			System.out.println(a.length());
			b = Optional.ofNullable("");
			System.out.println(b.get().length());
		}
	}

}
