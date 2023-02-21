import java.util.Scanner;
public class double_to_int {
    public static void main(String[] args) {
        double d = Double.MAX_VALUE;
        int n = (int)d;
        System.out.printf("\nЗначение int - %d\n", n);
        System.out.printf("\nЗначение double - %.18f\n", d);
    }
}
