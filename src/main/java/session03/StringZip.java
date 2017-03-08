package session03;

/**
 * Created by ferna on 3/8/2017.
 *
 * Generar un String que comprime un String imprimiento el numero de veces que se repite cada caracter, luego va a
 * regresar la mas corta de las dos. Puras letras
 * e.g.
 * Perro -> P1e1r2o1: regresa Perro
 * Parangaricutirimicuaro -> P1a4r4n1g1i4c2u2t1m1o1: regresa Parangaricutirimicuaro
 * Disassemble -> D1i1s3a1e2m1b1l1
 * Aragna ->
 */
public class StringZip {


    public static String zip(String string) {
        int abcMap[] = new int[26];
        int ABCMap[] = new int[26];
        int abcOffset = 97; // In ASCII the lowercase abc starts at 97;
        int ABCOffset = 65;
        for (char c : string.toCharArray()) {
            if (c < abcOffset) ABCMap[c-ABCOffset]++;
            else abcMap[c-abcOffset]++;
        }
        StringBuilder sb = new StringBuilder(); // To store the new String.
        for (int i=0; i < ABCMap.length; i++) if (ABCMap[i] > 0) sb.append("" + (char)(i + ABCOffset) + ABCMap[i]);
        for (int i=0; i < abcMap.length; i++) if (abcMap[i] > 0) sb.append("" + (char)(i + abcOffset) + abcMap[i]);
        return sb.toString();
    }

    public static String shortestOf(String string) {
        String zipped = zip(string);
        if (zipped.length() < string.length()) return zipped;
        return string;
    }
}
