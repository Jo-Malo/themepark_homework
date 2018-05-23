import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CustomerTest {
    Customer customer;
    Rollercoaster rollercoaster;

    @Before
    public void before(){
        customer = new Customer(9, 10, 50.00);
        rollercoaster = new Rollercoaster(5,14, 70.5);
    }

    @Test
    public void canGetAge(){
        assertEquals(9, customer.getAge());
    }

    @Test
    public void canGetWallet(){
        assertEquals(10, customer.getWallet());
    }

    @Test
    public void canPayForRide(){
        customer.payment(3);
        assertEquals(7, customer.getWallet());
    }

    @Test
    public void canGetHeight(){
        assertEquals(50.00, customer.getHeight(), 0.01);
    }

    @Test
    public void canCheckTooTallForRide(){
        customer.getHeight();
        rollercoaster.getMinimumHeight();
        customer.payment(5);
        assertEquals(5, customer.wallet);
    }
}
