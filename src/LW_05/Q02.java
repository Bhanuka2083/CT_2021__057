package LW_05;


import java.util.Scanner;

public class Q02 {

    public static int countDig(int num){

        int count = 0;


            while (num > 0){
                num= num / 10;
                count = count + 1;
            }
        return count;

    }



    public static void main(String[] args) {

        //System.out.println(countDig(145632));


        int number = 0;

        while (number > -1 ){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Num : ");
            number = scanner.nextInt();
            System.out.println(countDig(number));

        }


    }


}
