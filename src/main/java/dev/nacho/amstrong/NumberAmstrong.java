package dev.nacho.amstrong;

public class NumberAmstrong {
    private int number;

    public NumberAmstrong(int number) {
        this.number = number;
    }

    public boolean numberisAmstrong() {
        int digits;
        int lastDigit;
        int add = 0;
        int numb = number;
        digits = (int) Math.floor(Math.log10(number)) + 1;
        while (numb > 0) {
            lastDigit = numb % 10;
            add = add + (int) Math.pow(lastDigit, digits);
            numb = numb / 10;
        }

        return number == add;

    }

}
