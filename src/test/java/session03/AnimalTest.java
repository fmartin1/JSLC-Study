package session03;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

/**
 * Created by ferna on 3/7/2017.
 */
public class AnimalTest {

    @Test
    public void test() {
        Animal fido = new Animal("Perro","Fido",1);
        Animal olderFido = new Animal("Perro", "Fido", 2);

        assertFalse(fido == olderFido);
        assertEquals(fido, olderFido);

        HashSet<Animal> mySet = new HashSet<Animal>();
        mySet.add(fido);
        assertTrue(mySet.add(olderFido));

        Animal bigotes = new Animal("Gato", "Bigotes", 1);
        Animal notBigotes = new Animal("Raton", "Bigotes", 1);
        assertNotEquals(bigotes, notBigotes);
        mySet.add(bigotes);
        assertTrue(mySet.add(notBigotes));
    }
}