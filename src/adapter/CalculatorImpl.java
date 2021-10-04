package adapter;

import java.math.BigInteger;

public class CalculatorImpl implements Calculator {
    private OldCalculator calculator = new OldCalculator();
    @Override
    public int gcd(int a, int b) {
        return calculator.gcd(BigInteger.valueOf(a), BigInteger.valueOf(b)).intValue();
    }
}
