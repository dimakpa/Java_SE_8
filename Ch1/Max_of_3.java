import java.util.Scanner;

public class Max_of_3 {
    public static void main(String[] args) {
        System.out.println("Введите целочисленное значение:");
        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
            System.out.println("Введите корректное значение!");
            in.next();
        }
        int number1 = in.nextInt();

        while (!in.hasNextInt()) {
            System.out.println("Введите корректное значение!");
            in.next();
        }
        int number2 = in.nextInt();

        while (!in.hasNextInt()) {
            System.out.println("Введите корректное значение!");
            in.next();
        }
        int number3 = in.nextInt();
        System.out.printf("\nИспользование процента - %d - \n", Math.max(number1, Math.max(number2, number3)));


    }
}
