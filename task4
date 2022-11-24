import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double result;
        int x, n;
        boolean k;

        System.out.println("Enter x: ");
        x = in.nextInt();

        System.out.println("Enter n: ");
        n = in.nextInt();
        result = 1;
        if (n<0) {
            k = false;
            n = -n;
        }
        else if (n>0){
            k = true;
        }
        else {
            System.out.println("1");
            return;
        }

        /*for (int i = n; i > 0; i--) {
            if (k) result *= x;
            else result /= x;
        }*/

        while(n>0){
            if (k) result *= x;
            else result /= x;
            n--;
        }

        System.out.println(result);

    }
}
