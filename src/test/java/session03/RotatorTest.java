package session03;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ferna on 3/8/2017.
 * and it's awesome.
 */
public class RotatorTest {

    @Test
    public void rotateTest() {
        // a b c d        m i e a
        // e f g h   ->   n j f b
        // i j k l        o k g c
        // m n o p        p l h d
        char[][] test = new char[][]{"abcd".toCharArray(), "efgh".toCharArray(), "ijkl".toCharArray(), "mnop".toCharArray()};
        char[][] expe = new char[][]{"miea".toCharArray(), "njfb".toCharArray(), "okgc".toCharArray(), "plhd".toCharArray()};
        assertArrayEquals(expe, Rotator.rotate(test));

        /*
        1 2 3 4 5       1 6 1 6 1
        6 7 8 9 0       2 7 2 7 2
        1 2 3 4 5   ->  3 8 3 8 3
        6 7 8 9 0       4 9 4 9 4
        1 2 3 4 5       5 0 5 0 5
         */
        test = new char[][]{"12345".toCharArray(), "67890".toCharArray(), "12345".toCharArray(), "67890".toCharArray(), "12345".toCharArray()};
        expe = new char[][]{"16161".toCharArray(), "27272".toCharArray(), "38383".toCharArray(), "49494".toCharArray(), "50505".toCharArray()};
        assertArrayEquals(expe, Rotator.rotate(test));

        /*
        1 2 3 4     9 5 1
        5 6 7 8 ->  0 6 2
        9 0 1 2     1 7 3
                    2 8 4
         */
        test = new char[][]{"1234".toCharArray(), "5678".toCharArray(), "9012".toCharArray()};
        expe = new char[][]{"951".toCharArray(), "062".toCharArray(), "173".toCharArray(), "284".toCharArray()};
        assertArrayEquals(expe, Rotator.rotate(test));
    }
}