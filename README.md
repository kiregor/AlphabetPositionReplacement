# AlphabetPositionReplacement

This is a simple class that contains a few methods that perform actions on strings. The main function is to take in a string and give out a string of numbers that meet the requirement A=1, B=2, C=3 etc.

This method is statically declared in the class StringToNumber and as such can be called directly from the class providing it the string you wish to have converted.

Example:
String input = "This NETbuilder assessment is way too easy.";
String output = StringToNumber.stringToNumStringNoPunc(input);

The value of output here is - ["20 8 9 19 14 5 20 2 21 9 12 4 5 18 1 19 19 5 19 19 13 5 14 20 9 19 23 1 25 20 15 15 5 1 19 25"]
