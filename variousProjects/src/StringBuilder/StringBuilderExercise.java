package StringBuilder;

public class StringBuilderExercise {
    public String hello(String name) throws nameNotFoundException {
        String greetingMessage = "";
        StringBuilder stre = new StringBuilder();
        if (name.equalsIgnoreCase("John")) {
            String greetings = "Hello";
            StringBuilder friendName = stre.append(greetings).append(",").append(" ").append(name)
                    .append("!");
            greetingMessage = friendName.toString();

        } else {
            throw new nameNotFoundException("Entered name is not John, please enter John");
        }
        return greetingMessage;
    }

	public static void main(String[] args) throws nameNotFoundException {
		StringBuilderExercise str = new StringBuilderExercise();
		str.hello("John");
		System.out.println(str.hello("Johnyy"));
	}
}