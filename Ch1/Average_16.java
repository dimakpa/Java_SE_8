import java.util.Scanner;

public class Average_16 {
    public static void main(String[] args) {
        System.out.println("Введите целочисленное значение:");
        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
            System.out.println("Введите корректное значение!");
            in.next();
        }
        int number1 = in.nextInt();

        System.out.println(average((double) number1));



    }

    public static double average(double res, double... values){
        double sum = 0;
        sum+=res;
        for(double v : values)
            sum += v;
        return sum/(values.length+1);
    }
}
