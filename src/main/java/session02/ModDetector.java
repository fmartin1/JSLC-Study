package session02;

class ModDetector {

    // Validate a couple of strings have only one modification between them.
    // Modifications can be: 1 addition, 1 subtraction, or 1 replacement.
    // Complexity: O(n)
    public static boolean onlyOneModificationBetween(String oriStr, String modStr) {
        // There can only be a difference of 1 in size between words (1 add or
        // 1 subtract).
        int sizeDiff = modStr.length() - oriStr.length();

        if (Math.abs(sizeDiff) > 1) return false;

        char original[] = oriStr.toCharArray();
        char modified[] = modStr.toCharArray();

        if (sizeDiff < 0) {
            boolean useOffset = false;
            for (int i = 0; i < modified.length; i++) {
                if (useOffset && modified[i] != original[i+1]) return false;
                if (modified[i] != original[i]) {
                    useOffset = true;
                    i--;
                }
            }
        } else if (sizeDiff == 0) {
            boolean modDetected = false;
            for (int i=0; i < original.length; i++) {
                if (original[i] != modified[i]) {
                    if (modDetected) return false;
                    modDetected = true;
                }
            }
        } else if (sizeDiff > 0) {
            boolean useOffset = false;
            for (int i = 0; i < original.length; i++) {
                if (useOffset && modified[i+1] != original[i]) return false;
                if (modified[i] != original[i]) {
                    useOffset = true;
                    i--;
                }
            }
        }
        return true;
    }

    private static int[] getCharMap(String string) {
        int charMap[] = new int[128];
        for ( char c : string.toCharArray() ) {
            charMap[c]++;
        }
        return charMap;
    }

}
