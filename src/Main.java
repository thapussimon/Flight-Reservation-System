public class Main {
    public static void main(String[] args) {
        //This is for test purposes check for working
        Flight flight=new Flight(22,"Chennai Airlines",100,50);
        System.out.println(flight.flightDetails());
        System.out.println(flight.seatsAvailability());

        //Using The Concept Of Polymorphism
        Passenger passenger=new Passenger("Ted","789007891","ted@gmail.com","gandhinagar","Saravanampatti","Tamil Nadu");

        RegularTicket regularTicket=new RegularTicket(1456789,"Mumbai","Chennai",
                flight,"20/11/2020","12 pm","21/11/2020","12 am",passenger,32, 10000.0f,"confirmed",
                12.0f,false,"spa");
        TouristTicket touristTicket=new TouristTicket(1000089,"Mumbai","Chennai",
                flight,"20/11/2020","12 pm","21/11/2020","12 am",passenger,32, 10000.0f,"confirmed",
                12.0f,false,"vadodara road, Lal COmplex, CHennai","Tirunnelvenni");
        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);


    }

    public static void printTicketDetails(Ticket ticket){
        System.out.println("PNR Number is "+ticket.getPnrNumber());//Getting the pnr Number on the console

    }
}
