import org.junit.Test;

import static org.junit.Assert.*;

public class PlateBreakdownTest {
    @Test
    public void testToString() throws Exception {
        PlateBreakdown myTest = new PlateBreakdown(0);
        assertEquals(myTest.toString(), "0:\n" +
                                        "0 x 45\n" +
                                        "0 x 35\n" +
                                        "0 x 25\n" +
                                        "0 x 10\n" +
                                        "0 x 5\n" +
                                        "0 x 2_5\n");

        PlateBreakdown myTest2 = new PlateBreakdown(135);
        assertEquals(myTest2.toString(), "135:\n" +
                                        "1 x 45\n" +
                                        "0 x 35\n" +
                                        "0 x 25\n" +
                                        "0 x 10\n" +
                                        "0 x 5\n" +
                                        "0 x 2_5\n");

        PlateBreakdown myTest3 = new PlateBreakdown(170);
        assertEquals(myTest3.toString(), "170:\n" +
                                        "1 x 45\n" +
                                        "0 x 35\n" +
                                        "0 x 25\n" +
                                        "1 x 10\n" +
                                        "1 x 5\n" +
                                        "1 x 2_5\n");
    }

}