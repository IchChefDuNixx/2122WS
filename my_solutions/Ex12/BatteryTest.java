import org.junit.*;
import static org.junit.Assert.*;

public class BatteryTest {

    Battery test1 = new Battery();
    Battery test2 = new Battery(5000);
    Battery LiPo = new Battery(1000, "Lithium-Polymer");
    Battery NiMh = new Battery(2000, "Nickel-metal hydride");
    Battery NiCd = new Battery(500, "Nickel-Cadmium");
    Battery Pb = new Battery(200, "Lead");
    Battery LiIo = new Battery(3000, "Lithium-Ion");

    Battery[] BatteryPack = { test1, test2, LiPo, NiMh, NiCd, Pb, LiIo };

    /*
     * @BeforeClass
     * static void testBeforeAll() {
     * System.out.println("Before All");
     * }
     * 
     * @Before
     * void testBeforeEach() {
     * System.out.println("Before Each");
     * }
     * 
     * @Test
     * void test() {
     * assertEquals(1, 1);
     * System.out.println("Test");
     * }
     * 
     * @After
     * void testAfterEach() {
     * System.out.println("After Each");
     * }
     * 
     * @AfterClass
     * static void testAfterAll() {
     * System.out.println("After All");
     * }
     */

    @Test
    void test() {
        assertEquals(1, 1);
    }
}
