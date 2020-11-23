public class Ticket {
    public int pnrNumber;
    public String departureLoc;
    public String destinationLoc;
    public Flight flight;
    public String departureDate;
    public String departureTime;
    public String arrivalDate;
    public String arrivalTime;
    public Passenger passenger;
    public int seatNo;
    public float price;
    public String status;
    public float duration;
    public boolean cancellation;


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
