package model;

public class Number extends ModelNumber {


    public Number(Double number) {
        super(number);
    }

    @Override
    public String toString() {
        return "Number{" +
                "number=" + number +
                '}';
    }

    public double getNumber() {
        return number;
    }
}


