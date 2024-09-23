import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class LaskinTest {

    @Test
    public void testSumma() {
        Laskin laskin = new Laskin();
        assertEquals(5, laskin.addme(2, 3));
    }
    @Test
    public void testErotus() {
        Laskin laskin = new Laskin();
        assertEquals(2, laskin.subme(5, 3));
    }
    @Test
    public void testTulo() {
        Laskin laskin = new Laskin();
        assertEquals(6, laskin.mulme(2, 3));
    }
    @Test
    public void testOsamaara() {
        Laskin laskin = new Laskin();
        assertEquals(2, laskin.divme(6, 3));
    }

}