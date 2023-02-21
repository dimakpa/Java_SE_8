import java.util.Random;
import java.util.Scanner;

public class Random_string_10 {
    public static void main(String[] args) {

        String str = "";
        for(int i=0; i<10; i++) {
            long generatedLong = new Random().nextLong();
            int asc = (int) (generatedLong / 36);
            str = str + Character.toString( (char) asc);
        }
        System.out.println(str);

    }
}
