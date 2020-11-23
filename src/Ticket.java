public class Ticket {
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

    private Passenger passenger; //aggregation provided
    private int seatNo;
    private float price;
    private String status;
    private float duration;
    private boolean cancellation;


    public String checkStatus(){
        return status;
    }

    public float getDuration(){
        return duration;
    }
    public void setCancellation(boolean cancelDetail){
        cancellation=cancelDetail;
    }


}
