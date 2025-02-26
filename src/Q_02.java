
import javax.swing.*;
import java.util.*;

        public class Q_02{
            public static void main(String[] args) {

                Scanner Name1;
                Name1 = new Scanner(System.in);
                String firstName;
                System.out.print("Enter your first name : ");
                firstName = Name1.next();

                Scanner Name2;
                Name2 = new Scanner(System.in);
                String secondName;
                System.out.print("Enter your second name : ");
                secondName = Name2.next();


                //System.out.println("Full name is "+ firstName + secondName);

                JFrame newWindow;
                newWindow = new JFrame();
                newWindow.setSize(800 , 600);
                newWindow.setTitle(firstName + ' ' + secondName);
                newWindow.setVisible(true);


            }
        }


