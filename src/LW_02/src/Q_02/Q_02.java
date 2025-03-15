
package LW_02.src.Q_02;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {

        Scanner l = new Scanner(System.in);
        double cm;
        System.out.print("Enter long in Centimeters : ");
        cm = l.nextDouble();

        //Inches convert

        System.out.println(cm * (1/2.54)+ " Inches");


        System.out.println((cm * (1/2.54)) / 12 + " feet");

    }
}
