public class NaturalNumbers implements Number{
    private int value;
    public NaturalNumbers(int value){
        this.value = value;
    }
    @Override
    public void add(NaturalNumbers number) {
    }

    @Override
    public void add(Number otherNumber) {
        value = value + otherNumber.intValue();
    }

    @Override
    public void subtract(Number otherNumber) {
        value = value - otherNumber.intValue();
    }

    @Override
    public void multiply(Number otherNumber) {
        value = value * otherNumber.intValue();
    }

    @Override
    public void divide(Number otherNumber) {
        value = value / otherNumber.intValue();
    }

    @Override
    public void power(Number exponent) {
        value = (int) Math.pow(value, exponent.intValue());
    }

    @Override
    public boolean isPrime() {
        if (value == 1) {
            return false;
        }
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isOdd() {
        return value % 2 != 0;
    }

    @Override
    public boolean isEven() {
        return value % 2 == 0;
    }

    @Override
    public boolean greaterThan(Number otherNumber) {
        return value > otherNumber.intValue();
    }

    @Override
    public boolean lessThan(Number otherNumber) {
        return value < otherNumber.intValue();
    }

    @Override
    public boolean equals(Number otherNumber) {
        return value == otherNumber.intValue();
    }

    @Override
    public NaturalNumbers toPinguNumber() {
        return new PinguNumbers(value);
    }


    @Override
    public int intValue() {
        return value;
    }
}
