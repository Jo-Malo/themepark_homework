import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems(3, 12, 60.5);
    }

    @Test
    public void canGetPrice(){
        assertEquals(3, dodgems.getPrice());
    }

    @Test
    public void canGetMinimumAge(){
        assertEquals(12, dodgems.getMinimumAge());
    }

    @Test
    public void canGetMinimumHeight(){
        assertEquals(60.5, dodgems.getMinimumHeight(), 0.01);
    }

    @Test
    public void getRideWarningNotice(){
        assertEquals("All customers please check that you qualify to enter this ride and are 12 years of age.", dodgems.getRideWarningNotice());
    }
}
