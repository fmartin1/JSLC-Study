package session01;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fernando on 3/7/2017.
 */
public class StringAnalyzerTest {

    @Test
    public void onlyUniqueCharactersIn() throws Exception {
        char holaString[] = "Hola".toCharArray();
        assertTrue(StringAnalyzer.onlyUniqueCharactersIn(holaString));

        char perroString[] = "perro".toCharArray();
        assertFalse(StringAnalyzer.onlyUniqueCharactersIn(perroString));
    }

    @Test
    public void permutationIn() throws Exception {
        String str1 = "hola";
        String str2 = "halo";
        assertTrue(StringAnalyzer.permutationIn(str1, str2));

        String perroString = "perro";
        String parroString = "parro";
        assertFalse(StringAnalyzer.permutationIn(perroString, parroString));

        String str3 = "hhhhhhooooolllaa";
        String str4 = "holaholaholhohoh";
        assertTrue(StringAnalyzer.permutationIn(str3, str4));
    }

    @Test
    public void convertToUrl() throws Exception {
        char inputArray[] = "Hello World, have a nice day.".toCharArray();
        char expectedArray[] = "Hello%20World,%20have%20a%20nice%20day.".toCharArray();
        assertArrayEquals(expectedArray, StringAnalyzer.convertToUrl(inputArray));
    }
}