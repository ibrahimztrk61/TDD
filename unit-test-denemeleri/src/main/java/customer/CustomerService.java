package customer;

public class CustomerService {

    private CustomerRepository customerRepository;
    private InfoService infoService;

    public void saveCustomer(Customer customer){
        customerRepository.save(customer);
        infoService.newRecordMailSend(customer);


    }
    public void deleteCustomer(Integer customerId){
        customerRepository.delete(customerId);
        infoService.deleteMailSend(customerId);

    }

    // bunlar private yapısından dolayı oluşturulan setter yapısıdır.
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public void setInfoService(InfoService infoService) {
        this.infoService = infoService;
    }
}
