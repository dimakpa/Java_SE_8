import java.util.Scanner;

public class Max_and_Min_of_double {
    public static void main(String[] args) {
        System.out.println("Введите значение:");
        System.out.printf("\nНаименьшее число double больше 0 - %.16f\n", Math.nextUp(0.0));
        double infinity = Double.POSITIVE_INFINITY;
        System.out.printf("\nНаибольшее число double - %f\n", Math.nextUp(infinity));
    }
}

