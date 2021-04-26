import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Customer> customers;
    private int numberOfCustomers;
    private String bankName;

    public Bank(String bName) {
        this.bankName = bName;
        numberOfCustomers = 0;

        customers = new ArrayList<>();
    }

    public void addCustomer(String f, String l) {
        this.customers.add(new Customer(f, l));
        numberOfCustomers++;
    }

    public int getNumberOfCustomers() {
        return this.numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        return this.customers.get(index);
    }

}
