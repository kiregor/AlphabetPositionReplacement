package test.AlphabetPositionReplacement;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	
	public void testStringToLower() {
		String test = StringToNumber.stringToLower("TEST");
		String expected = "test";
		assertEquals(expected, test);
	}
	
}
