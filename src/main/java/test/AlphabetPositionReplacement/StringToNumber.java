package test.AlphabetPositionReplacement;

import java.util.List;
import java.util.stream.Collectors;

public class StringToNumber {

	public static String stringToLower(String in) {
		return in.toLowerCase();
	}
	
	public static List<Integer> stringToASCIIvalues(String in){
		return in.toLowerCase().chars().mapToObj(c -> (int) c).collect(Collectors.toList());
	}
}
