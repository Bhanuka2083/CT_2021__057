package LW_03.Q1_02;

import java.util.Scanner;

public class Main_toFahrenheits {
    public static void main(String[] args) {



        Temperature temp;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");

        double celsius = scanner.nextDouble();

        temp = new Temperature(celsius);

        //System.out.println(celsius);

        double fahrenheit = temp.toFahrenheit(celsius);



        System.out.println("Temperature in Fahrenheit: " + fahrenheit);



    }



}
