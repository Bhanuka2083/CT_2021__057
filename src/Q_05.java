import java.text.SimpleDateFormat;
import java.util.Date;

public class Q_05{
    public static void main(String[] args){


        Date today;
        SimpleDateFormat sdf;
        today = new Date( );
        sdf = new SimpleDateFormat("EEEEEEEEE, MMMMMMM d yyyy");
        System.out.println(sdf.format(today));
    }
}



