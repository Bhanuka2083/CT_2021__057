package LW_05;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = scanner.nextInt();

        int mul = 1;

        while (mul < 11){
            System.out.println(num + " * " + mul + " = " + (num*mul));
            mul++;
        }

    }



}
