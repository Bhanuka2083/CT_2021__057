
package LW_02.src.Q_03;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {

        Scanner temp = new Scanner(System.in);
        double cel;
        System.out.print("Enter temperature in Celsius : ");
        cel = temp.nextDouble();

        System.out.println((1.8 * cel) + 32 +" F");

    }
}
