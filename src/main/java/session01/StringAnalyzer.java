package session01;

import java.util.HashSet;
import java.util.HashMap;

/*
	-4 OOP concepts.
	-What does high cohesion means?
	-S.O.L.I.D.
	1.Implement an algorithm that verifies a string has only unique characters. Optional: Use a single data structure.
	2.Implement a method that determines if a string is permutation of another.
	3.Convert a string into URL format (i.e. "hello world" -> "hello%20world"), don't use Collections.
 */
public class StringAnalyzer {

    public static boolean onlyUniqueCharactersIn(char[] charArray) {
        int ascii[] = new int[128];
        for (char c : charArray) if (++ascii[c] > 1) return false;
        return true;
    }

    public static boolean permutationIn(String str1, String str2) {
        if (str1.length() == str2.length()) {
            int oriMap[] = new int[128];
            int modMap[] = new int[128];
            for (char c : str1.toCharArray()) oriMap[c]++;
            for (char c : str2.toCharArray()) modMap[c]++;
            for (int i = 0; i < oriMap.length; i++) if (oriMap[i] - modMap[i] != 0) return false;
            return true;
        } else {
            return false;
        }
    }

    public static char[] convertToUrl(char[] inputArray) {
        int spaceCount = 0;
        for (char c : inputArray) if (c == ' ') spaceCount++;
        if (spaceCount > 0) {
            int newLength = 2 * spaceCount + inputArray.length; // For each space add 2 spaces (for '2' and '0').
            char newArray[] = new char[newLength];
            int offsetIndex = 0; // Offset each time a space is encountered in the original array.
            for (int i = 0; i < inputArray.length; i++) {
                if (inputArray[i] == ' ') {
                    newArray[offsetIndex++] = '%'; // Replace ' ' with '%' and move offsetIndex forward by 1.
                    newArray[offsetIndex++] = '2';
                    newArray[offsetIndex++] = '0';
                } else {
                    newArray[offsetIndex++] = inputArray[i];
                }
            }
            return newArray;
        } else {
            return inputArray;
        }
    }
}