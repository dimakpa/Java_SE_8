import java.util.Scanner;
import java.lang.Math;

public class Rectangle {

    public static void main(String[] args) {
        System.out.println("Введите целочисленное значение:");
        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
            System.out.println("Введите корректное значение!");
            in.next();
        }
        int number = in.nextInt();
        int rectangle = number%360;
        System.out.printf("\nИспользование процента - %d - \n", rectangle);

        System.out.printf("Использование floorMod - %d - \n", Math.floorMod(number, 360));

    }

}
