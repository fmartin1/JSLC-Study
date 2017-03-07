import java.lang.Math;
class ModDetector {

  public static void main(String[] args) {
    ModDetector test = new ModDetector();
    String original = args[0];
    String modified = args[1];
    System.out.println("Testing [" + original + "] and [" + modified + "]");
    boolean passedTest = test.onlyOneModificationBetween(original, modified);
    System.out.println((passedTest) ? "Passed.":"Failed.");
  }

  // Validate a couple of strings have only one modification between them.
  // Modifications can be: 1 addition, 1 substraction, or 1 replacement.
  // Complexity: O(n)
  public boolean onlyOneModificationBetween(String oriStr, String modStr) {
    // There can only be a difference of 1 in size between words (1 add or
    // 1 substract).
    int sizeDiff = Math.abs(modStr.length() - oriStr.length());
    if ( sizeDiff > 1 ) {
      return false;
    }

    // Map strings into character maps that store insidences of each character.
    int[] oriCharMap = getCharMap(oriStr);
    int[] modCharMap = getCharMap(modStr);
    // changesFound tops at 2.
    // 1 addiontion   = 1 change
    // 1 substraction = 1 change
    // 1 replacemente = 1 addition + 1 substraction
    int changesFound = 0;
    for ( int i = 0; i < 128; i++ ) {
      // Measure how different is one character count vs the other.
      int changeDiff = Math.abs(oriCharMap[i] - modCharMap[i]);
      if ( changeDiff > 1 || (changesFound >= 2 && changeDiff == 1) )
        return false;
      else if ( changeDiff == 1 )
        changesFound++;
      else
        continue;
    }
    return true;
  }

  private int[] getCharMap(String string) {
    int charMap[] = new int[128];
    for ( char c : string.toCharArray() ) {
      charMap[c]++;
    }
    return charMap;
  }

}
