import java.util.Scanner;

public class New_string_11 {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner in = new Scanner(System.in);
        while (!in.hasNextLine()) {
            System.out.println("Введите корректное значение!");
            in.next();
        }
        String str = in.nextLine();

        for(int i=0; i<str.length(); i++){
            int index = str.codePointAt(i);
            if(index > 127){
                System.out.println("Символ: " + str.charAt(i) + " ASCI код: " + str.codePointAt(i));
            }
        }
    }
}
