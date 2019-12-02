package exercises.technologyTest;

import exercises.technology.SmartPhone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmartPhoneTest {

    SmartPhone test_smartphone;

    @Before
    public void createTestSmartphone() {
        test_smartphone = new SmartPhone("Test Phone", 30, 5);
    }

    @Test
    public void testInitialSmartphone() {
        assertEquals("Test Phone", test_smartphone.getBrand());
        assertEquals(30, test_smartphone.getMemory());
        assertEquals(5, test_smartphone.getScreenSize());
        assertEquals(false, test_smartphone.hasGames);
        assertEquals(false, test_smartphone.isScreenCracked());
    }

    @Test
    public void testDroppedIt() {
        test_smartphone.droppedIt();
        assertEquals(true, test_smartphone.isScreenCracked());
    }
}
