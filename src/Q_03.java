import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args){

        Scanner name1;
        name1 = new Scanner(System.in);
        String fName;
        System.out.print("Enter your first name : ");
        fName = name1.next();

        Scanner name2;
        name2 = new Scanner(System.in);
        String sName;
        System.out.print("Enter your middle name : ");
        sName = name2.next();

        Scanner name3;
        name3 = new Scanner(System.in);
        String lName;
        System.out.print("Enter your surname : ");
        lName = name3.next();


        System.out.println("Full name is " + fName + ' ' + (sName.charAt(0)) + '.' + lName);

    }
}