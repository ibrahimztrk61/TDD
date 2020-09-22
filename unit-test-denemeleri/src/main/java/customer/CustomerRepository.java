package customer;

public class CustomerRepository {

    public void save(Customer customer) {

        System.out.println("Oracle DB is saved:");
    }

    public void delete(Integer customerId) {

        System.out.println("Oracle DB is deleted:");
    }

    public Customer findCustomer(Integer customerId) {
        System.out.println("Oracle DB is found");
        return null;

    }
}
