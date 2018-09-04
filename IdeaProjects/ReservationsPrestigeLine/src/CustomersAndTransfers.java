import java.util.ArrayList;

public class CustomersAndTransfers {

    private ArrayList<Voucher> vouchers;
    private ArrayList<Customer> customers;
    private ArrayList<Capacity> capacity;
    private ArrayList<Transfer> transfers;

    public CustomersAndTransfers() {

        vouchers = new ArrayList<Voucher>();
        customers = new ArrayList<Customer>();
        capacity = new ArrayList<Capacity>();
        transfers = new ArrayList<Transfer>();

    }

    public ArrayList<Voucher> getVouchers() {
        return vouchers;
    }


    public ArrayList<Customer> getCustomers() {
        return customers;
    }


    public ArrayList<Capacity> getCapacitiy() {
        return capacity;
    }


    public ArrayList<Transfer> getTransfers() {
        return transfers;
    }

    public void addCapacity(String capacityPlace) {
        capacity.add(new Capacity(capacityPlace));
    }

    public void addTransfer( int transferNumber, String startPoint, String endPoint  ){

        transfers.add(new Transfer(transferNumber));
    }



}
