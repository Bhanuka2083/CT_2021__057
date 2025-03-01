package Q_10;

import java.util.*;

public class Q_10{
    public static void main(String[] args){

        Scanner str;
        str = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String str1 = str.next();

        int num = (str1.length() / 2);

        System.out.println(str1.charAt(num));

    }
}
