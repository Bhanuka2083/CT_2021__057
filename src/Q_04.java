import java.text.SimpleDateFormat;
import java.util.Date;

public class Q_04{
    public static void main(String[] args){


        Date today;
        SimpleDateFormat sdf;
        today = new Date( );
        sdf = new SimpleDateFormat("d MMMMMMM yyyy");
        System.out.println(sdf.format(today));
    }
}



