package ru.netology.services;

public class VacationServices {

    public int calculate(int income, int expenses, int threshold) {
        int months = 0;
        int cash = 0;
        for (int i = 0; i < 12; i++) {
            if (cash >= threshold) {
                months++;
                cash -= expenses;
                cash /= 3;
            } else {
                cash += income;
                cash -= expenses;
            }
        }
        return months;
    }
}
