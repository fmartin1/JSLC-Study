package session03;

/*
  -What is Equals?
  -What is HashCode?
  -What are they used for?
  -Why is it necessary to implement both if you make any changes to any of them?
  -Animal.java was used to explain the effects of modifying both methods.
  1. Implement an algorithm to rotate character pictures 90 degrees. These will be squared:
  e.g.
  [a b]  ->  [c a]
  [c d]      [d b]
  -Tip: for bigger arrangements, rotate the smaller ones first, then the bigger ones.
*/
class Rotator {

    static char[][] rotate(char[][] charArray) {
        int rowSize = charArray[0].length;
        int colSize = charArray.length;
        char[][] rotatedArray = new char[rowSize][colSize];
        for (int row=0; row < rowSize; row++) {
            for (int col=0; col < colSize; col++) {
                rotatedArray[row][col] = charArray[colSize-(col+1)][row];
            }
        }
        return rotatedArray;
    }
}
