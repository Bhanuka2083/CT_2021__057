package LW_03.Q3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Circle R;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Outer circle radius: ");
        double ro = scanner.nextDouble();

        R = new Circle(ro);

        //System.out.println(ri);

        double OuterArea = R.computeArea(ro);
        double outerCircumference = R.computeCircumference(ro);

        System.out.print("Enter Inner circle radius: ");
        double ri = scanner.nextDouble();

        R = new Circle(ri);

        double InnerArea = R.computeArea(ri);
        double InnerCircumference = R.computeCircumference(ri);

        //System.out.println("Out"+OuterArea);
        //System.out.println("In"+InnerArea);

        System.out.print("Shaded Area: "+(OuterArea-InnerArea));
        System.out.println();
        System.out.print("Shaded Circumference: "+(outerCircumference-InnerCircumference));


    }
}
