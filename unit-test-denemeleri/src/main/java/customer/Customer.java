package customer;

public class Customer {


    private int customerId;

    public Customer(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void save(Customer customer){

        System.out.println("Customer is saved:");
    }
}
