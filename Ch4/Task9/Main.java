package Task9;

import Task7.Color;

public class Main {

    public static void main(String[] args) {
        String[] children = new String[3];
        children[0] = "Dima";
        children[1] = "Makar";
        children[2] = "Sava";
        Employee employee = new Employee(21, 1, "Maks" ,children );
        String fieldName = "obj";

        System.out.println(employee.toString(employee.getClass()));
        //System.out.println(Class.getField(fieldName));



    }
}
