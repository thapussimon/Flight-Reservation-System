public abstract class Ticket {
    //Encapsulated all the attributes to the methods
    //Provided an aggregation relationship with the Passenger Class
    private int pnrNumber;
    private String departureLoc;
    private String destinationLoc;
    private Flight flight;
    private String departureDate;
    private String departureTime;
    private String arrivalDate;
    private String arrivalTime;

    public Ticket(int pnrNumber, String departureLoc, String destinationLoc, Flight flight,
                  String departureDate, String departureTime, String arrivalDate, String arrivalTime,
                  Passenger passenger, int seatNo, float price, String status,
                  float duration, boolean cancellation) {
        this.pnrNumber = pnrNumber;
        this.departureLoc = departureLoc;
        this.destinationLoc = destinationLoc;
        this.flight = flight;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.passenger = passenger;
        this.seatNo = seatNo;
        this.price = price;
        this.status = status;
        this.duration = duration;
        this.cancellation = cancellation;
    }

    private Passenger passenger; //aggregation provided
    private int seatNo;
    private float price;
    private String status;
    private float duration;
    private boolean cancellation;


    public String checkStatus() {
        return status;
    }

    public float getDuration() {
        return duration;
    }

    public void setCancellation(boolean cancelDetail) {
        cancellation = cancelDetail;
    }


}
