package StringBuilderExerciseTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import StringBuilder.StringBuilderExercise;
import StringBuilder.nameNotFoundException;

class StringBuilderExerciseTest {

    @Test
    public void testForStringBuilder() throws nameNotFoundException {
        StringBuilderExercise strng = new StringBuilderExercise();
        assertEquals("Hello, John!", strng.hello("John"));
    }
}