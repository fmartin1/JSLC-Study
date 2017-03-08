package session02;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ferna on 3/7/2017.
 */
public class ModDetectorTest {

    @Test
    public void onlyOneModificationBetween() throws Exception {
        // ASSERT TRUE
        assertTrue(ModDetector.onlyOneModificationBetween("this","thus"));
        assertTrue(ModDetector.onlyOneModificationBetween("hello","helloo"));
        assertTrue(ModDetector.onlyOneModificationBetween("yellow","yello"));

        // ASSERT FALSE
        assertFalse(ModDetector.onlyOneModificationBetween("this","thee"));
        assertFalse(ModDetector.onlyOneModificationBetween("hello","heelloo"));
        assertFalse(ModDetector.onlyOneModificationBetween("yellow","yell"));
        assertFalse(ModDetector.onlyOneModificationBetween("yellow","yallo"));
        assertFalse(ModDetector.onlyOneModificationBetween("yellow","yalloww"));
        assertFalse(ModDetector.onlyOneModificationBetween("yellow","elloww"));

    }

}