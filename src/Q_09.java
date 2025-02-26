
import java.util.*;

public class Q_09{
    public static void main(String[] args){


        Scanner str;
        str = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String str1 = str.nextLine();

        System.out.println(str1.length());

        System.out.println(str1.charAt(0));

        System.out.println(str1.charAt(str1.length() - 1));

    }
}
