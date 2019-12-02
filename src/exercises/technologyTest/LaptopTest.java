package exercises.technologyTest;

import exercises.technology.Laptop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LaptopTest {

    Laptop test_laptop;

    @Before
    public void createTestLaptop() {
        test_laptop = new Laptop("Test Laptop", 40, 12, 120);
    }

    @Test
    public void emptyTest() {}

    @Test
    public void testInitialLaptop() {
        assertEquals("Test Laptop", test_laptop.getBrand());
        assertEquals(40, test_laptop.getMemory());
        assertEquals(12, test_laptop.getWeight(), .001);
        assertEquals(120, test_laptop.getBatteryTime(), .001);
        assertEquals(false, test_laptop.hasGames);
    }

    @Test
    public void testBatteryUsed() {
        assertEquals(90, test_laptop.useLappy(30), .001);
        assertEquals(60, test_laptop.useLappy(30), .001);
        assertEquals(30, test_laptop.useLappy(30), .001);
        assertEquals(15, test_laptop.useLappy(15), .001);
        assertEquals(0, test_laptop.useLappy(15), .001);
    }

}
