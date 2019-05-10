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
	
	public void testStringToASCIIvalues() {
		int[] arr = {116, 104, 105, 115, 32, 110, 101, 116, 98, 117, 105, 108, 100, 101, 114, 32, 97, 115, 115, 101, 115, 115, 109, 101, 110, 116, 32, 105, 115, 32, 119, 97, 121, 32, 116, 111, 111, 32, 101, 97, 115, 121, 46};
		List<Integer> exp = new ArrayList<>(arr.length);
		for(int i : arr) {
			exp.add(Integer.valueOf(i));
		}
		List<Integer> test = StringToNumber.stringToASCIIvalues("This NETbuilder assessment is way too easy.");
		assertEquals(exp, test);
	}
	
}
