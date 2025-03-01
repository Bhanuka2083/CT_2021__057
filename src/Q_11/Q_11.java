
package Q_11;

import java.util.*;

public class Q_11 {
    public static void main(String[] args) {



        Scanner name = new Scanner(System.in);
        System.out.print("Enter your full name (first middle last) : ");
        String fullName = name.nextLine();

        String[] fname = fullName.split(" ");

        String firstName = fname[0];
        String middleName = fname[1];
        String lastName = fname[2];


        System.out.println(lastName + ',' + firstName + ' ' + middleName.charAt(0) + '.');

    }
}
