import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int day, month, year;
        int tDay = 24, tMonth = 11, tYear = 2022;

        System.out.println("The day of the birth: ");
        day = in.nextInt();
        System.out.println("The month of the birth: ");
        month = in.nextInt();
        System.out.println("The year of the birth: ");
        year = in.nextInt();

        if (tDay < day) {
            tDay = tDay + 31 - day;
            tMonth --;
        }
        else {
            tDay = tDay - day;
        }

        if (tMonth < month) {
            tMonth = tMonth + 12 - month;
            tYear --;
        }
        else {
            tMonth = tMonth - month;
        }
        tYear = tYear - year;

        System.out.println(tYear + " years, " + tMonth + " months and " + tDay + " days");
    }
}