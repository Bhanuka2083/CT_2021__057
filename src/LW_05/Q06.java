package LW_05;

import java.util.Random;
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(100)+1;

        Scanner scanner = new Scanner(System.in);
        int guess = -1;

        //System.out.println(randomNum);

        while (guess != randomNum){
            System.out.print("Enter your number : ");
            guess = scanner.nextInt();


            if(guess<randomNum){
                System.out.println("Too low! Try again");
            } else if (guess > randomNum) {
                System.out.println("Too high! Try again");
            }else {
                System.out.println("Nice work! You guessed the number "+ randomNum);
            }
        }
    }
}
