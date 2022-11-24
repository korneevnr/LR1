import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double r, x,y;
        int k,n;

        System.out.println("The number of points: ");
        n = in.nextInt();

        System.out.println("The radius: ");
        r = in.nextDouble();
        k = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("X " + i + " of point: ");
            x = in.nextDouble();
            System.out.println("Y: " + i + " of point: ");
            y = in.nextDouble();
            if (sqrt(x*x + y*y) <= r) {
                k++;
            }
        }
        System.out.println(k + " points are in the circle");

    }
}
