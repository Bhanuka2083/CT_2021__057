package LW_04;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter Third Number: ");
        int num3 = scanner.nextInt();

        if(num1 == num2 && num1 == num3 && num2 == num3){
            System.out.println("Numbers are equal");

        }
        else if (num1 < num2){
            if(num1 < num3){
                System.out.println("The smallest number is "+num1);
            }
            else {
                System.out.println("The smallest number is "+num3);
            }

        }
        else {
            System.out.println("The smallest number is "+num2);
        }
    }
}
