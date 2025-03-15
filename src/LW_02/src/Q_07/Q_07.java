
package LW_02.src.Q_07;

import java.util.Scanner;
import static java.lang.Math.pow;

public class Q_07 {
    public static void main(String[] args) {

        Scanner bmi = new Scanner(System.in);
        double w;
        System.out.print("Enter your weight in Kg : ");
        w = bmi.nextDouble();

        double h;
        System.out.print("Enter your height in cm : ");
        h = bmi.nextDouble();

        double BMI = w / pow((h/100), 2);

        System.out.println("Your BMI value is " + BMI);
    }
}
