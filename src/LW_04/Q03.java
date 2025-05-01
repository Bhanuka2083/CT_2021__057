package LW_04;

import java.util.HashMap;
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        HashMap<Integer,String> PowerTen = new HashMap<>();
        PowerTen.put(6, "Million");
        PowerTen.put(9, "Billion");
        PowerTen.put(12, "Trillion");
        PowerTen.put(15, "Quadrillion");
        PowerTen.put(18, "Quintillion");
        PowerTen.put(21, "Sextillion");
        PowerTen.put(30, "Nonillion");
        PowerTen.put(100, "Googol");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the power of 10: ");
        int power = scanner.nextInt();


        switch (power){

            case 6:
                System.out.println("Power is "+PowerTen.get(6));
                break;

            case 9:
                System.out.println("Power is "+PowerTen.get(9));
                break;

            case 12:
                System.out.println("Power is "+PowerTen.get(12));
                break;

            case 15:
                System.out.println("Power is "+PowerTen.get(15));
                break;

            case 18:
                System.out.println("Power is "+PowerTen.get(18));
                break;

            case 21:
                System.out.println("Power is "+PowerTen.get(21));
                break;

            case 30:
                System.out.println("Power is "+PowerTen.get(30));
                break;

            case 100:
                System.out.println("Power is "+PowerTen.get(100));
                break;

            default:
                System.out.println("Unrecognized power!!");
                break;
        }
    }
}
