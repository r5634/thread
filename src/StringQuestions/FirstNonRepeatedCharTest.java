package StringQuestions;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstNonRepeatedCharTest {

	@Test
	public void testGetFirstNonRepeatedChar() {
        assertEquals('b', FirstNonRepeatedChar.firstNonRepeatedCharacter("abcdefghija"));
        assertEquals('h', FirstNonRepeatedChar.firstNonRepeatedCharacter("hello"));
        assertEquals('J', FirstNonRepeatedChar.firstNonRepeatedCharacter("Java"));
        assertEquals('i', FirstNonRepeatedChar.firstNonRepeatedCharacter("simplest"));
	}

	@Test
	public void testFirstNonRepeatingChar() {
        assertEquals('b', FirstNonRepeatedChar.firstNonRepeatingChar("abcdefghija"));
        assertEquals('h', FirstNonRepeatedChar.firstNonRepeatingChar("hello"));
        assertEquals('J', FirstNonRepeatedChar.firstNonRepeatingChar("Java"));
        assertEquals('i', FirstNonRepeatedChar.firstNonRepeatingChar("simplest"));
	}

	@Test
	public void testFirstNonRepeatedCharacter() {
        assertEquals('b', FirstNonRepeatedChar.getFirstNonRepeatedChar("abcdefghija"));
        assertEquals('h', FirstNonRepeatedChar.getFirstNonRepeatedChar("hello"));
        assertEquals('J', FirstNonRepeatedChar.getFirstNonRepeatedChar("Java"));
        assertEquals('i', FirstNonRepeatedChar.getFirstNonRepeatedChar("simplest"));
	}

}
