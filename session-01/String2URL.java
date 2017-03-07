class String2URL {

  public static void main(String[] args) {
    String testString = "Soyelmasfuerte";
    char testArray[] = testString.toCharArray();
    printLine("Initial format: \"" + testString + "\"");
    String result = charToString(convertToUrl(testArray));
    printLine("Result: \"" + result + "\"");
    System.exit(0);
  }

  private static char[] convertToUrl(char[] array) {
    int spaceCount = 0;
    for(char c : array) {
      if(c == ' ')
        spaceCount++;
    }
    if(spaceCount == 0)
      return array;

    int newLength = 2 * spaceCount + array.length;
    char newArray[] = new char[newLength];
    int j = 0;
    for(int i = 0; i < array.length; i++) {
      if (array[i] != ' ') {
        newArray[j++] = array[i];
      }
      else {
        newArray[j++] = '%';
        newArray[j++] = '2';
        newArray[j++] = '0';
      }
    }
    return newArray;
  }

  private static String charToString(char[] array) {
    StringBuilder sb = new StringBuilder();
    for(char c : array) {
      sb.append(c);
    }
    return sb.toString();
  }

  private static void printLine(String line) {
    System.out.println(line);
  }
}
