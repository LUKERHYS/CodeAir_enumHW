import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Passenger passenger;
    Plane plane;
    Flight flight;

    @Before
    public void setUp() {
        passenger = new Passenger("Lyndsey Fraser", 2);
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(PlaneType.BOEING747, 200292,
                "Cancun, Mexico", "Edinburgh", "1200");
    }

    @Test
    public void planeShouldStartEmpty() {
        assertEquals(416, plane.freeSpace());
    }

    @Test
    public void canAddPassengertoPassengers(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.passengerCount());
    }

    @Test
    public void canBookPassenger(){

    }

}
