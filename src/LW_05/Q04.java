package LW_05;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        num = scanner.nextInt();


        for(int i = 0; i <= num; i++){

            for (int s = num - i; s > 0; s--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}

