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
	
	public static String stringToNumString(String in) {
		return String.join(" ", in.toLowerCase().chars().mapToObj(c -> (int) c - 96).map(n -> String.valueOf(n)).collect(Collectors.toList()));
	}
	
	public static String stringToNumStringNoPunc(String in) {
		return String.join(" ", in.toLowerCase().chars().mapToObj(c -> (int) c - 96).filter(n -> n>0).map(n -> String.valueOf(n)).collect(Collectors.toList()));
	}
}
