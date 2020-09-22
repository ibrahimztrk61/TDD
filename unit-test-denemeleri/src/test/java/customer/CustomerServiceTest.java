package customer;


import customer.exception.MailServerUnavaibleException;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceTest {

    private CustomerService customerService;
    private CustomerRepositoryStub customerRepository = new CustomerRepositoryStub();
    private InfoService infoService = new InfoService();


    // instance'larımızı init içinde oluşturuyoruz.
    @BeforeEach
    public void setUp() throws Exception {
        customerService = new CustomerService(); // Customer servis nesnesi oluşturduk.
//        customerRepository = new CustomerRepository();
//        infoService = new InfoService();
        //   customerRepository = Mockito.mock(CustomerRepository.class); // bu sayede nesnemizi mockladık.
        //infoService = Mockito.mock(InfoService.class);
        customerService.setCustomerRepository(customerRepository);
        customerService.setInfoService(infoService);
    }

    @Test
    public void testCustomerSave() {
        Customer customer = new Customer(1234);


        customerService.saveCustomer(customer);
        // kontrol etmemiz gerekiyor

        //assertTrue(customerRepository.getCustomerList().containsValue(customer));
        assertEquals(customer, customerRepository.findCustomer(customer.getCustomerId()));

        //Mockito.verify(customerRepository).save(customer);
        Mockito.verify(infoService).newRecordMailSend(customer);

    }

    @Test
    public void testCustomerSaveWithStub() {
        Customer customer = new Customer(1234);


        customerService.saveCustomer(customer);
        // kontrol etmemiz gerekiyor

        assertEquals(customer, customerRepository.findCustomer(customer.getCustomerId()));


        //Mockito.verify(customerRepository).save(customer);
        // Mockito.verify(infoService).newRecordMailSend(customer);

    }

    @Test
    public void testCustomerDelete() {
        customerService.saveCustomer(new Customer(12341));
        customerService.deleteCustomer(12341);
        assertNull(customerRepository.findCustomer(12341));

    }

    @Test
    public void testMailServerWithTryCatchException() {
        try {
            infoService.mailServerException();
        } catch (Exception e) {
            assertTrue(e instanceof MailServerUnavaibleException);
            assertEquals("Mail server has a error.", e.getMessage());
        }
    }

    @Rule
    public ExpectedException myException = ExpectedException.none();

    @Test
    public void testMailServerWithRuleException() throws Exception {
        myException.expect(MailServerUnavaibleException.class);
        myException.expectMessage("Mail server has a error.");

        //assertEquals(myException.expectMessage("Mail server has a error."),infoService.mailServerException());

    }

    @Ignore
    //@Test(expected = MailServerUnavaibleException.class)
    public void testMailServerWithExpectedException() {
        infoService.mailServerException();

    }


}