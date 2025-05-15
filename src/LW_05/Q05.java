package LW_05;

import java.util.Scanner;

public class Q05 {
    public static boolean palindrome(String word){
        word = word.replaceAll("[^a-zA-Z09]","").toLowerCase();

        int left = 0;
        int right = word.length() - 1;

        while (left<right){
            if(word.charAt(left) != word.charAt(right)){
                return false;
            }
            left++;
            right--;

        }
        return true;
    }

    public static void main(String[] args) {

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter word : ");
            String word = scanner.nextLine();

            System.out.println(word);

            if (palindrome(word)) {
                System.out.println(word + " is a Palindrome");
            } else {
                System.out.println(word + " is not a Palindrome");
            }
        }while (true);
    }




}
