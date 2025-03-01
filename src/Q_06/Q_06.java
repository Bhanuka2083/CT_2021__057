package Q_06;


import javax.swing.*;
import java.util.*;

public class Q_06{
    public static void main(String[] args){

        Scanner data;
        data = new Scanner(System.in);
        int W;
        System.out.print("Enter width of frame : ");
        W = Integer.parseInt(data.next());


        int H;
        System.out.print("Enter height of frame : ");
        H = Integer.parseInt(data.next());


        String title;
        System.out.print("Enter title : ");
        title = data.next();



        JFrame newWindow;
        newWindow = new JFrame();
        newWindow.setSize(W , H);
        newWindow.setTitle(title);
        newWindow.setVisible(true);



    }
}