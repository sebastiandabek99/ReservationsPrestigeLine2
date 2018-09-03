public class Transfer {

    private int transferNumber;
    private String startPoint;
    private String endPoint;

    public Transfer(int transferNumber){
        this.transferNumber = transferNumber;
    }

    public Transfer(int transferNumber, String startPoint, String endPoint) {
        this.transferNumber = transferNumber;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }



}
