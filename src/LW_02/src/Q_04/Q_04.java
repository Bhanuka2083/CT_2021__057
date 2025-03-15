
package LW_02.src.Q_04;

import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {

        Scanner weight = new Scanner(System.in);
        double w;
        System.out.print("Enter Weight in pound : ");
        w = weight.nextDouble();

        System.out.println("You need " + (w * 19) +" calories per day");

    }
}
