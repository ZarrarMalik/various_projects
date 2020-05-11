package StringBuilder;

public class StringBuilderExercise {
	public String hello(String name) {
		StringBuilder stre = new StringBuilder();
		String greetings = "Hello";
		StringBuilder friendName = stre.append(greetings).append(",").append(" ").append(name).append("!");
		String greetingMessage = friendName.toString();
		return greetingMessage;

	}

	public static void main(String[] args) {
		StringBuilderExercise str = new StringBuilderExercise();
		str.hello("John");
		System.out.println(str.hello("John"));

	}

}
