public class Random_string_10 {
    public static void main(String[] args) {

        long random = (long) (Math.random() * Long.MAX_VALUE);
        System.out.println(random);
        System.out.println(Long.toString(random, 36));
    }
}

