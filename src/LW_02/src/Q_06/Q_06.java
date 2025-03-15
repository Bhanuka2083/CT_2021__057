
package LW_02.src.Q_06;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {

        Scanner year = new Scanner(System.in);
        int byear;
        System.out.print("Enter your birth year : ");
        byear = year.nextInt();


        Date today;
        SimpleDateFormat sdf;
        today = new Date( );
        sdf = new SimpleDateFormat("yyyy");

        int cyear = Integer.parseInt(sdf.format(today));
        System.out.println("You were born in " + byear + " and will be (are) " + (cyear - byear) + " this year.");



    }
}
