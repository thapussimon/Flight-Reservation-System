public class Flight {
    //Encapsulated attributes with the methods

    private int flightNo;
    private String airline;
    private int capacity;
    private int seatsBooked;

    public String flightDetails() {
        return Integer.toString(flightNo) + ", " + airline + ", " + capacity + ", " + Integer.toString(seatsBooked);

    }

    public boolean seatsAvailability() {
        return false;
    }

    public void updateSeats(int seats) {
        seatsBooked += seats;
    }
}
