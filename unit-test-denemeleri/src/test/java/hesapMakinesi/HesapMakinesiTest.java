package hesapMakinesi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


public class HesapMakinesiTest {

    @Test
    public void it_should_return_toplam() {
        //Arrange
        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        int a = 5;
        int b = 35;
        //Act

        int toplam = hesapMakinesi.topla(a, b);

        //Assert
        Assertions.assertEquals(toplam, 40);

    }


    @Test
    public void it_should_return_fark() {
        //Arrange
        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        int a = 43;
        int b = 3;

        //Act
        int fark = hesapMakinesi.cıkart(a, b);
        //Assert
        Assertions.assertEquals(fark, 40);
    }

    @Test
    public void ilkDegerIkinciDegerdenKucuk_ThrowIllegalArgumentException() {
        //Arrange
        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        int a = 3;
        int b = 43;

        //Act
        int fark = hesapMakinesi.cıkart(a, b);
        //Assert
        Assertions.assertEquals(fark, -40);
    }

    @ParameterizedTest
    @CsvSource({"2", "3","6"})
    public void carpma(int a, int b, int toplam) throws Exception {


    }


}
