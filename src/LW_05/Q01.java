package LW_05;

public class Q01 {
    public static void main(String[] args) {
        int num = 10;
        int count = 0;

        while (num<= 49){
            System.out.print( num+ " " );
            count = count + 1;
            if(count == 10){
                System.out.println();
                count = 0;
            }
            num = num +1;
        }

    }
}
