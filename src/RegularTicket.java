public class RegularTicket {
   public String specialServices;

    public String checkSpecialServices(){
        return specialServices;
    }

    public void updateSpecialServices(String specialServiceDetail){
        specialServices+=specialServiceDetail;
    }

}
