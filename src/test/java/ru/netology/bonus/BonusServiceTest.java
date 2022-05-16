package ru.netology.bonus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")


    public void testCsv(int amount, boolean registered, int expected) {
        BonusService service = new BonusService();


        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }
}