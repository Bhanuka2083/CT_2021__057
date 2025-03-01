package Q_03;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args){

        Scanner name1;
        name1 = new Scanner(System.in);
        String fName;
        System.out.print("Enter your first name : ");
        fName = name1.next();


        String sName;
        System.out.print("Enter your middle name : ");
        sName = name1.next();


        String lName;
        System.out.print("Enter your surname : ");
        lName = name1.next();


        System.out.println(fName + ' ' + (sName.charAt(0)) + '.' + lName);

    }
}