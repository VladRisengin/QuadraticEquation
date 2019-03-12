import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Enter is a");
        a = sc.nextDouble();
        System.out.println("Enter is b");
        b = sc.nextDouble();
        System.out.println("Enter is c");
        c = sc.nextDouble();

        if (b == 0 && c == 0) {
            System.out.println("x=0");
        }

        if (b == 0 & c != 0) {
            if (-c / a > 0) {
                System.out.println("x1 = " + Math.sqrt(-c / a));

                System.out.println("x2 = " + "-" + Math.sqrt(-c / a));
            }

            if (-c / a < 0) {
                System.out.println("No roots");
            }
        }

        if (b != 0 & c == 0) {
            System.out.println("x1 = 0");
            System.out.println("x2 = " + (-b / a));
        }

        if (a != 0 & b != 0 & c != 0) {
            double d = b * b - 4 * a * c;
            if (d < 0) {
                System.out.println("D = " + d);
                System.out.println("No roots");
            }

            if (d == 0) {
                System.out.println("D = " + d);
                System.out.println("x1 = x2");
                System.out.println("x = " + -b / (2 * a));
            }

            if (d > 0) {
                System.out.println("D = " + d);
                System.out.println("x1 = " + (-b + Math.sqrt(d)) / (2 * a));
                System.out.println("x2 = " + (-b - Math.sqrt(d)) / (2 * a));

            }
        }
    }
}
