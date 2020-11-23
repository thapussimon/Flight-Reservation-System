public class Flight {
    public int flightNo;
    public String airline;
    public int capacity;
    public int seatsBooked;

    public String flightDetails() {
        return airline;
    }

    public boolean seatsAvailability() {
        return false;
    }

    public void updateSeats(int seats) {
        seatsBooked += seats;
    }
}
