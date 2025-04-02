package LW_03.Q1_02;

import java.util.Scanner;

public class Main_toCelsius {
    public static void main(String[] args) {

        Temperature temp2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");

        double fahrenheit = scanner.nextDouble();

        temp2 = new Temperature(fahrenheit);

        double celsius = temp2.toCelsius(fahrenheit);

        System.out.print("Temperature in Celsius: "+ celsius);
    }
}
