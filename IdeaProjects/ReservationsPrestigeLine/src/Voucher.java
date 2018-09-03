public class Voucher {

    private Customer customer;
    private Transfer transfer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Transfer getTransfer() {
        return transfer;
    }

    public void setTransfer(Transfer transfer) {
        this.transfer = transfer;
    }

    public Voucher(Customer customer, Transfer transfer) {

        this.customer = customer;
        this.transfer = transfer;

        // how to add date and time


    }

}
