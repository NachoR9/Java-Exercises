package dev.nacho.months_and_days;

import java.util.List;

public class MonthCalculator {

    private List<Month> months = List.of(
        new Month("January", 31),
        new Month("February", 28),
        new Month("March", 31),
        new Month("April", 30),
        new Month("May", 31),
        new Month("June", 30),
        new Month("July", 31),
        new Month("August", 31),
        new Month("September", 30),
        new Month("October", 31),
        new Month("November", 30),
        new Month("December", 31)
    );

    public Month getMonth(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            throw new IllegalArgumentException("not a valid month number");
        } 
        return months.get(monthNumber - 1);
    }
}
