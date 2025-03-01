
package Q_08;

import java.util.*;


public class Q_08{
    public static void main(String[] args){

        Scanner line;
        line = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String line1 = line.nextLine();

        String[] lineArray = line1.split("!");

        for (String st : lineArray) {
            System.out.println(st);
        }


    }
}
