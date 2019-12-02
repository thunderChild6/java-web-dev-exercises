package exercises.technologyTest;

import exercises.technology.Computer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerTest {

    Computer test_computer;

    @Before
    public void createComputerObject() {
        test_computer = new Computer("Test Computer", 50);
    }

    @Test
    public void emptyTest() {    }

    @Test
    public void testInitialComputer() {
        assertEquals("Test Computer", test_computer.getBrand());
        assertEquals(50, test_computer.getMemory());
        assertEquals(false, test_computer.hasGames);
        assertEquals(false, test_computer.somethingPrinted);
    }

    @Test
    public void testInstallGames() {
        test_computer.installGames();
        assertEquals(true, test_computer.hasGames);
    }

    @Test
    public void testPrintThePaper() {
        test_computer.printThePaper();
        assertEquals(true, test_computer.somethingPrinted);
    }

}
