import java.util.Scanner;

public class String_equals_9 {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner in = new Scanner(System.in);
        while (!in.hasNextLine()) {
            System.out.println("Введите корректное значение!");
            in.next();
        }
        String str1 = in.nextLine();

        while (!in.hasNextLine()) {
            System.out.println("Введите корректное значение!");
            in.next();
        }
        String str2 = in.nextLine();
        int f=0;
        if(str1.length() == str2.length()){
            for (int i=0; i<str1.length(); i++){
                int index1 = str1.codePointAt(i);
                int index2 = str2.codePointAt(i);
                if(index2 - index1 != 0){
                    f=1;
                    break;
                }
            }
        }else {
            f=1;
        }
        if(f==1){
            System.out.println("Строки неравны!");
        }else {
            System.out.println("Строки равны!");
        }
    }
}
