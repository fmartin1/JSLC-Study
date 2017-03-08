package session03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ferna on 3/8/2017.
 */
public class StringZipTest {

    @Test
    public void zipWords() {
        assertEquals("e1o1p1r2", StringZip.zip("perro"));
        assertEquals("a1h4l2o3", StringZip.zip("holaholhoh"));

        assertEquals("P1e1o1r2", StringZip.zip("Perro"));
        assertEquals("A1H1l1o1", StringZip.zip("HolA"));
        assertEquals("A4C7K3P2h4i2l1u2", StringZip.zip("AAAAPPCCCCCCChhhhuiuiKKKl"));
    }

    @Test
    public void getShortestVersion() {
        assertEquals("perro", StringZip.shortestOf("perro"));
        assertEquals("a1h4l2o3", StringZip.shortestOf("holaholhoh"));
        assertEquals("A4C7K3P2h4i2l1u2", StringZip.shortestOf("AAAAPPCCCCCCChhhhuiuiKKKl"));
        assertEquals("HolA", StringZip.shortestOf("HolA"));
    }

}