import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private PlaneType plane;
    private int flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(PlaneType plane,
                  int flightNumber,
                  String destination,
                  String departureAirport,
                  String departureTime){
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }


}