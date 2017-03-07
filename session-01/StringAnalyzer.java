import java.util.HashSet;
import java.util.HashMap;
public class StringAnalyzer {

  public static void main(String[] args) {
    if(args.length > 0) {
      if(args[0].equals("1")) {
        checkUnique();
      }
      else{
        checkPermutation();
      }
    }
    System.exit(0);
  }

  private static void checkUnique() {
    System.out.println("Enter word to analyze:");
    String testString = System.console().readLine();
    if(onlyUniqueCharactersIn(testString)){
      System.out.println("\"" + testString + "\" has no repeated characters.");
    }
    else {
      System.out.println("\"" + testString + "\" has repeated characters.");
    }
  }

  private static boolean onlyUniqueCharactersIn(String string) {
    HashSet<Character> characterSet = new HashSet<Character>();
    for(char c : string.toCharArray()) {
      if(characterSet.add(c)) {
        continue;
      }
      else {
        return false;
      }
    }
    return true;
  }

  private static void checkPermutation(){
    System.out.println("Enter first word to analyze:");
    String word1 = System.console().readLine();
    System.out.println("Enter second word to analyze:");
    String word2 = System.console().readLine();
    if(permutationIn(word1,word2)){
      System.out.println("Words are permutation of each other.");
    }
    else {
      System.out.println("Words are NOT permutation of each other.");
    }
  }

  private static boolean permutationIn(String str1, String str2) {
    HashMap<Character, Integer> str1Map = getMapFromString(str1);
    HashMap<Character, Integer> str2Map = getMapFromString(str2);

    if( !str1Map.keySet().equals(str2Map.keySet()) ) {
      return false;
    }

    for(char key : str1Map.keySet()) {
      int v1 = str1Map.get(key);
      int v2 = str2Map.get(key);
      if(v1 != v2) {
        return false;
      }
    }

    return true;
  }

  private static HashMap<Character, Integer> getMapFromString(String string) {
    HashMap<Character, Integer> stringMap = new HashMap<Character, Integer>();
    for(char c : string.toCharArray()) {
      if(stringMap.containsKey(c)){
        stringMap.put(c, stringMap.get(c) + 1);
      }
      else{
        stringMap.put(c, 1);
      }
    }
    return stringMap;
  }
}
