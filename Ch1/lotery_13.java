import java.util.ArrayList;
import java.util.Scanner;

public class lotery_13 {
    public static void main(String[] args) {

        ArrayList<String> loter = new ArrayList<>(49);
        for(int i=1; i<50; i++){
            loter.add(Integer.toString(i));
        }


        for(int i=0; i<6; i++) {
            System.out.println("Введите индекс:");
            Scanner in = new Scanner(System.in);
            while (!in.hasNextInt()) {
                System.out.println("Введите корректное значение!");
                in.next();
            }
            int index = in.nextInt();
            loter.remove(index);
        }
        while(!loter.isEmpty()){
            System.out.println(loter.get(0) + " ");
            loter.remove(0);
        }


    }
}
