import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class CustomerTest {
   List<String> list = new ArrayList<String>(Arrays.asList("istanbul","ankara","trabzon","izmir"));
    @Test
    public void testString() throws Exception {
        String text1 = "deneme";
        assertThat(text1).isEqualTo("deneme")
                .startsWith("dene")
                .endsWith("me")
                .contains("ne")
                .isNotEmpty()
                .isNotNull()
                .doesNotContain("ibrahim")
                .containsOnlyOnce("den");

    }

    @Test
    public void testStringWithError() throws Exception {
        String text1 = "deneme";
        assertThat(text1).isEqualTo("deneme")
                .describedAs("This is an error message")
                .startsWith("dene")
                .endsWith("me")
                .contains("ankara")
                .isNotEmpty()
                .isNotNull()
                .doesNotContain("ibrahim")
                .containsOnlyOnce("den");

    }

    @Test
    public void testStringWithContainsExactly() throws Exception {

        assertThat(list).contains("istanbul")
                .containsExactly("istanbul","ankara","trabzon","izmir")
                .doesNotHaveDuplicates()
                .contains("istanbul")
                .doesNotContain("bursa");


    }
}
