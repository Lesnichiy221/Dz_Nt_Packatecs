package org.example.Dz_Nt_Packets.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class VacationCulcServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/VacationCulc.csv")
    void incomeBiggerThanExpense(int expected, int income, int expense, int treshHold){
        VacationCulcService service = new VacationCulcService();

        //int income = 10_000;
        //int expense = 3_000;
        //int treshHold = 20_000;

        //int expected = 3;
        int actual = service.calcVacation(income,expense, treshHold);

        Assertions.assertEquals(expected, actual);

    }
}
