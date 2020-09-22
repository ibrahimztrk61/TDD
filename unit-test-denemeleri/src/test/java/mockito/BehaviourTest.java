package mockito;

import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class BehaviourTest {

    @Test
    public void testBehaviour() throws Exception {
        // dummyCustomerService bir mock nesnesidir.
        DummyCustomerService dummyCustomerService = Mockito.mock(DummyCustomerService.class);

        dummyCustomerService.addCustomer("istanbul");
        dummyCustomerService.addCustomer("ankara");

        verify(dummyCustomerService).addCustomer("istanbul");
        verify(dummyCustomerService).addCustomer("ankara");

    }

    @Test
    public void testBehaviour_CountOfCall() throws Exception {
        DummyCustomerService dummyCustomerService = Mockito.mock(DummyCustomerService.class);

        dummyCustomerService.addCustomer("istanbul");
        dummyCustomerService.addCustomer("istanbul");
        dummyCustomerService.addCustomer("ankara");
        dummyCustomerService.addCustomer("ankara");

        verify(dummyCustomerService, times(2)).addCustomer("istanbul");//times(1) default
        // remove customer methodu hiç çağrılmadı burada verilen parametre farketmez.
        verify(dummyCustomerService, never()).removeCustomer(anyString());

        // En az iki defa çagrıldı.
        verify(dummyCustomerService, atLeast(2)).addCustomer("ankara");
    }

    @Test
    public void testBehaviour_inOrder() throws Exception {

        DummyCustomerService dummyCustomerService = Mockito.mock(DummyCustomerService.class);

        dummyCustomerService.addCustomer("ankara");
        dummyCustomerService.addCustomer("istanbul");

        InOrder inOrder = inOrder(dummyCustomerService);
        inOrder.verify(dummyCustomerService).addCustomer("ankara");
        inOrder.verify(dummyCustomerService).addCustomer("istanbul");

    }
    @Test
    public void testBehaviour_NoMoreInteractions() throws Exception {

        DummyCustomerService dummyCustomerService = Mockito.mock(DummyCustomerService.class);

        dummyCustomerService.addCustomer("ankara");
        dummyCustomerService.addCustomer("istanbul");
       // dummyCustomerService.updateCustomer("ankara");


       Mockito.verify(dummyCustomerService).addCustomer("ankara");
       Mockito.verify(dummyCustomerService).addCustomer("istanbul");

       Mockito.verifyNoMoreInteractions(dummyCustomerService);

    }
}
