
package LW_02.src.Q_05;

import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {

        Scanner temp = new Scanner(System.in);
        double F;
        System.out.print("Enter temperature in Fahrenheit : ");
        F = temp.nextDouble();


        double c = (F - 32) * 5 / 9;
        System.out.println(c + " c");

    }

}
