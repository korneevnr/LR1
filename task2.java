import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int day, month;

        System.out.println("The day: ");
        day = in.nextInt();
        System.out.println("The month: ");
        month = in.nextInt();

        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        }
        else if (month > 2 && month < 6){
            System.out.println("Spring");
        }

        else if (month > 5 && month < 9){
            System.out.println("Summer");
        }
        else {
            System.out.println("Autumn");
        }

    }
}
