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

    public int getTransferNumber() {
        return transferNumber;
    }

    public void setTransferNumber() {
        this.transferNumber = transferNumber;
    }

    public String getStartPoint() {
       return startPoint;
    }

    public String setStartPoint() {
        this.startPoint = startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    @Override
    public String toString() {
        return "Transfer: " + transferNumber + ". FROM:" + startPoint + ", TO:" + endPoint;
    }

}
