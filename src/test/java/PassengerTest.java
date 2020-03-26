import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void setUp(){
        passenger = new Passenger("Luke Melvin", 2);
    }

    @Test
    public void canGetName(){
        assertEquals("Luke Melvin", passenger.getName());
    }

    @Test
    public void canGetNumOfBags(){
        assertEquals(2, passenger.getNumOfBags());
    }

}
