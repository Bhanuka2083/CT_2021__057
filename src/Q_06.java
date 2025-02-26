import javax.swing.*;
import java.util.*;

public class Q_06{
    public static void main(String[] args){

        Scanner width;
        width = new Scanner(System.in);
        int W;
        System.out.print("Enter width of frame : ");
        W = Integer.parseInt(width.next());

        Scanner height;
        height = new Scanner(System.in);
        int H;
        System.out.print("Enter height of frame : ");
        H = Integer.parseInt(height.next());

        //System.out.println("Width is "+W);
        //System.out.println("Height is "+H);

        Scanner Title;
        Title = new Scanner(System.in);
        String title;
        System.out.print("Enter title : ");
        title = Title.next();



        JFrame newWindow;
        newWindow = new JFrame();
        newWindow.setSize(W , H);
        newWindow.setTitle(title);
        newWindow.setVisible(true);



    }
}