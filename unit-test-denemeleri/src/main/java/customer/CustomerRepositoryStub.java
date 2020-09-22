package customer;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryStub extends CustomerRepository {


    private Map<Integer, Customer> customerList = new HashMap<Integer, Customer>();

//    public Map<Integer, Customer> getCustomerList() {
//        return customerList;
//    }

    @Override
    public void save(Customer customer) {
        customerList.put(customer.getCustomerId(), customer);
    }

    @Override
    public void delete(Integer customerId) {
        customerList.remove(customerId);
    }


    @Override
    public Customer findCustomer(Integer customerId) {
        return customerList.get(customerId);
    }
}
