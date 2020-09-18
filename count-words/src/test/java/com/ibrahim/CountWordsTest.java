package com.ibrahim;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CountWordsTest {


    @ParameterizedTest
    @CsvFileSource(resources = "/WordsData.csv", delimiter = ';')
    public void countWords_whenStringIncludeLetter_shouldReturnUniqueWordCount(String str, int expectedResult) {
        //Arrange
        CountWords countWords = new CountWords();
        //Act
        int count = countWords.counter(str);
        //Assert
        Assertions.assertEquals(count, expectedResult);

    }
}
