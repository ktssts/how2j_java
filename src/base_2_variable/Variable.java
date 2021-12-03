package base_2_variable;

import java.util.Scanner;

public class Variable {

    double a = 3.14;
    double b = 2.769343;
    int c = 365;
    char d = '吃';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a + b;
        System.out.println(c);

    }

}
