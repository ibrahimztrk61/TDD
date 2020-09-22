package mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AnnotationsTest {

    //@InjectMocks kullanılabilir.
    @Mock
    private DummyCustomerServiceImpl dummyCustomerService;

    @Test
    public void testAnnotation() throws Exception{

    dummyCustomerService.addCustomer("ankara");

    }
}
