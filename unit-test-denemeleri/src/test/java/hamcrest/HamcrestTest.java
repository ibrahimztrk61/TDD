package hamcrest;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;

public class HamcrestTest {

    @Test
    public void testHamcrest_withAssertEqual() {
        //Given
        String name = "ibrahim";
        String surname = "ibrahim";
        //When
        //Then
         Assert.assertEquals(name, surname);

    }
    @Test
    public void testHamcrest_withAssertThat() {
        //Given
        String name = "ibrahim";
        String surname = "ibrahim";
        //When
        //Then
        Assert.assertThat(name,is(equalTo("ibrahim")));
    }
    @Test
    public void testHamcrest_withAssertThatNotNullValue() {
        //Given
        String name = "ibrahim";
        String surname = "ibrahim";
        //When
        //Then
        Assert.assertThat(name, is(notNullValue()));
        Assert.assertThat(name, is(containsString("ib")));
    }
    @Test
    public void testHamcrest_withAssertThatAnyOf() {
        //Given
        String name = "ibrahim";
        String surname = "ibrahim";
        //When
        //Then
        Assert.assertThat(name, is(notNullValue()));
        // Bu değerlerden herhangi birini aldığında test geçer.
        Assert.assertThat(name, anyOf(containsString("ib"),containsString("xxx")));
    }
}
