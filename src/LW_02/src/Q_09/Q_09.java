
package LW_02.src.Q_09;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Q_09 {
    public static void main(String[] args) {

        Scanner inv = new Scanner(System.in);

        double P;
        System.out.print("Enter invested amount : ");
        P = inv.nextDouble();

        double R;
        System.out.print("Enter interest rate : ");
        R = inv.nextDouble();

        int N;
        System.out.print("Enter number of years : ");
        N = inv.nextInt();

        double grow =P * pow((1+(R/100)),N);

        System.out.println(grow);


    }
}
