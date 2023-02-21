import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        BigInteger k = BigInteger.valueOf(1);
        BigInteger d;
        for(int i = 1; i<=1000; i++){
            d = BigInteger.valueOf(i);
            k = k.multiply(d);
        }
        System.out.printf("\nЗначение факториал - %d\n", k);

    }
}
