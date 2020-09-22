package list;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList {

    @Test
    public void testList(){
        List<String> cities = new ArrayList<String>(Arrays.asList("istanbul","ankara","trabzon"));

      Assert.assertThat(cities,hasItem("istanbul"));
    }

    @Test
    public void testList_withManyItems(){
        List<String> cities = new ArrayList<String>(Arrays.asList("istanbul","ankara","trabzon"));

      Assert.assertThat(cities,hasItems("istanbul","ankara"));
    }

    @Test
    public void testList_withAnyOf(){
        List<String> cities = new ArrayList<String>(Arrays.asList("istanbul","ankara","trabzon"));

      Assert.assertThat(cities,anyOf(hasItems("istanbul","ankara"),not(hasItem("trabzon"))));
    }
    @Test
    public void testList_withEitherOr(){
        List<String> cities = new ArrayList<String>(Arrays.asList("istanbul","ankara","trabzon"));

      Assert.assertThat(cities,either(hasItems("istanbul","ankara")).or(hasItem("trabzon")));
    }



}
