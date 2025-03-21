
package LW_02.src.Q_07;

import java.util.Scanner;
import static java.lang.Math.pow;

public class Q_07 {
    public static void main(String[] args) {

        Scanner bmi = new Scanner(System.in);
        int w;
        System.out.print("Enter your weight in Kg : ");
        w = bmi.nextInt();

        int h;
        System.out.print("Enter your height in cm : ");
        h = bmi.nextInt();

        double BMI = w / (pow(((double) h /100),2));

        System.out.println("Your BMI value is " + BMI);
    }
}
