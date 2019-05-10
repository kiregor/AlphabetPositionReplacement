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
	
	public String testStringToLower() {
		String test = StringToNumber.stringToLower("test");
		String expected = "TEST";
		assertEquals(expected, test);
	}
	
}
