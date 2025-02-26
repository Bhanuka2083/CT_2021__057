
import java.time.LocalTime;
import javax.swing.*;
import java.time.format.DateTimeFormatter;


public class Q_07{
    public static void main(String[] args){



        LocalTime now = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String formated = now.format(dtf);

        JFrame window;
        window = new JFrame();
        window.setSize(600 , 400);
        window.setTitle(formated);
        window.setVisible(true);


        //System.out.println(formated);

    }
}