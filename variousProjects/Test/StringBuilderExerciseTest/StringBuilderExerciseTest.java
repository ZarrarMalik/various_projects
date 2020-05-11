package StringBuilderExerciseTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import StringBuilder.StringBuilderExercise;
import junit.framework.Assert;

class StringBuilderExerciseTest {

	@Test
	public void testForStringBuilder() {
		StringBuilderExercise strng= new StringBuilderExercise();
		Assert.assertEquals("Hello, John!", strng.hello("John"));
	}

}
