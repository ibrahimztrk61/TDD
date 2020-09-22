package mockito;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.doNothing;

public class SpyTest {
    @Test
    public void spyTest_withFakeObject() {
        DummyCustomerService dummyCustomerService = Mockito.spy(new DummyCustomerServiceImpl());

        dummyCustomerService.addCustomer("ankara");
    }

    @Test
    public void spyTest_withRealObject() throws Exception{
        DummyCustomerService dummyCustomerService = Mockito.spy(new DummyCustomerServiceImpl());

        doNothing().when(dummyCustomerService).addCustomer("ankara");

       dummyCustomerService.addCustomer("ankara");
    }
}
