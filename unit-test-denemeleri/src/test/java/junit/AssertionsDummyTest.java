package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsDummyTest {

    @Test
    public void assertionsDummyTestWithAssertEquals() {
        //Arrange
        // Buna instance oluşturma denir.
        AssertionsDummy assertionsDummy1 = new AssertionsDummy(2);
        AssertionsDummy assertionsDummy2 = new AssertionsDummy(2);

        //Act

        //Assert
        Assertions.assertEquals(assertionsDummy1, assertionsDummy2);

    }

    @Test
    public void assertionsDummyTestWithAssertSame() {
        //Arrange
        AssertionsDummy assertionsDummy1 = new AssertionsDummy(2);
        AssertionsDummy assertionsDummy2 = assertionsDummy1;

        //Act

        //Assert
        Assertions.assertSame(assertionsDummy1, assertionsDummy2, "Two objects refer to same object.");

    }

    @Test
    public void assertionsDummyTestWithNull() {
        //Arrange
        AssertionsDummy assertionsDummy1 = null;

        //Act

        //Assert
        assertNull(assertionsDummy1, "Object must be null");

    }

    @Test
    public void assertionsDummyTestWithNotNull() {
        //Arrange
        AssertionsDummy assertionsDummy = new AssertionsDummy(2);

        //Act

        //Assert
        assertNotNull(assertionsDummy);

    }

    @Test
    public void assertionsDummyTestWithAssertFalse() {
        //Arrange
        AssertionsDummy assertionsDummy = new AssertionsDummy(2);

        //Act

        //Assert
        assertFalse(assertionsDummy.getId() == 3, "Conditions must be false");

    }

    @Test
    public void assertionsDummyTestWithAssertTrue() {
        //Arrange
        AssertionsDummy assertionsDummy = new AssertionsDummy(2);

        //Act

        //Assert
        assertTrue(assertionsDummy.getId() == 2, "Conditions must be true");

    }

    @Test
    public void assertionsDummyTestWithArrayEquals() {
        //Arrange
        String [] array1 = new String[] {"3","3"};
        String [] array2 = new String[] {"3","3"};


        //Act

        //Assert
       assertArrayEquals(array1,array2);

    }


}
