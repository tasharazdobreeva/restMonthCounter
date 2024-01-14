package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServicesTest {

    @Test
    public void test() {
        VacationServices services = new VacationServices();

        int expected = 3;
        int actual = services.calculate(10000, 3000, 20000);
        Assertions.assertEquals(expected, actual);
    }
}
