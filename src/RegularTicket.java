public class RegularTicket extends Ticket {
    //Used the principle of Inheritance to extend The Ticket Class
    //Encapsulated the attributes with the methods

   private String specialServices;

    public String checkSpecialServices(){
        return specialServices;
    }

    public void updateSpecialServices(String specialServiceDetail){
        specialServices+=specialServiceDetail;
    }

}
