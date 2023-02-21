import java.math.BigInteger;
import java.util.Scanner;

public class Operations_with_short {
    public static void main(String[] args) {
        System.out.println("Введите целочисленное значение от 0 до " + Short.MAX_VALUE+1 +":");
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        while (number1<0 || number1>Short.MAX_VALUE+1) {
            System.out.println("Введите корректное значение!");
            number1 = in.nextInt();
        }


        int number2 = in.nextInt();
        while (number2<0 || number2>(Short.MAX_VALUE+1-number1)) {
            System.out.println("Введите корректное значение!");
            number2 = in.nextInt();
        }


        short sum = (short) (number1+number2);
        System.out.println("Сумма: " + sum);

        short multip = (short) (number1*number2);
        System.out.println("Произведение: " + multip);

        short del = (short) (number1/number2);
        System.out.println("Деление: " + del);

        short ost = (short) (number1 % number2);
        System.out.println("Остаток: " + ost);
    }
}
