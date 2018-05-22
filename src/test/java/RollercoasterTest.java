import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster(5, 14, 70.5);
    }

    @Test
    public void canGetPrice(){
        assertEquals(5, rollercoaster.getPrice());
    }

    @Test
    public void canGetMinimumAge(){
        assertEquals(14, rollercoaster.getMinimumAge());
    }

    @Test
    public void canGetMinimumHeight(){
        assertEquals(70.5, rollercoaster.getMinimumHeight(), 0.01);
    }

    @Test
    public void getRideWarningNotice(){
        assertEquals("All customers please check that you qualify to enter this ride and are 14 years of age.", rollercoaster.getRideWarningNotice());
    }
}
