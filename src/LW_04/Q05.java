package LW_04;

import java.util.HashMap;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {


        HashMap<String,Double> EntreeList = new HashMap<>();
        EntreeList.put("01.Tofu Burger", 3.49);
        EntreeList.put("02.Cajun Chicken", 4.59);
        EntreeList.put("03.Buffalo Wings", 3.99);
        EntreeList.put("04.Rainbow Fillet", 2.99);

        HashMap<String,Double> SideDishList = new HashMap<>();
        SideDishList.put("01.Rice Cracker", 0.79);
        SideDishList.put("02.No-Salt Fries", 0.69);
        SideDishList.put("03.Zucchini", 1.09);
        SideDishList.put("04.Brown Rice", 0.59);

        HashMap<String,Double> DrinkList =new HashMap<>();
        DrinkList.put("01.Cafe Mocha", 1.99);
        DrinkList.put("02.Cafe Latte", 1.90);
        DrinkList.put("03.Espresso", 2.49);
        DrinkList.put("04.Oolong Tea", 0.99);






        System.out.println("01.Entree");
        System.out.println("02.Side Dish");
        System.out.println("03.Drink");

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter Categories number: ");
        int Categories = scanner.nextInt();


        switch (Categories){
            case 01:
                System.out.println("01.Tofu Burger");
                System.out.println("02.Cajun Chicken");
                System.out.println("03.Buffalo Wings");
                System.out.println("04.Rainbow Fillet");

                System.out.println();
                System.out.print("Enter Entree number: ");
                int entree = scanner.nextInt();

                switch (entree){
                    case 01:
                        System.out.println("Tofu Burger's price is "+EntreeList.get("01.Tofu Burger"));
                        break;

                    case 02:
                        System.out.println("Cajun Chicken's price is "+EntreeList.get("02.Cajun Chicken"));
                        break;

                    case 03:
                        System.out.println("03.Buffalo Wing's price is "+EntreeList.get("03.Buffalo Wings"));
                        break;

                    case 04:
                        System.out.println("Rainbow Fillet's price is "+EntreeList.get("04.Rainbow Fillet"));
                        break;

                    default:
                        System.out.println("Invalid number");
                        break;
                }

                break;

            case 02:
                System.out.println("01.Rice Cracker");
                System.out.println("02.No-Salt Fries");
                System.out.println("03.Zucchini");
                System.out.println("04.Brown Rice");

                System.out.println();
                System.out.print("Enter Side Dish number: ");
                int sideDish = scanner.nextInt();

                switch (sideDish){
                    case 01:
                        System.out.println("Rice Cracker's price is "+SideDishList.get("01.Rice Cracker"));
                        break;

                    case 02:
                        System.out.println("No-Salt Fries's price is "+SideDishList.get("02.No-Salt Fries"));
                        break;

                    case 03:
                        System.out.println("Zucchini's price is "+SideDishList.get("03.Zucchini"));
                        break;

                    case 04:
                        System.out.println("Brown Rice's price is "+SideDishList.get("04.Brown Rice"));
                        break;

                    default:
                        System.out.println("Invalid number");
                        break;
                }

                break;




            case 03:
                System.out.println("01.Cafe Mocha");
                System.out.println("02.Cafe Latte");
                System.out.println("03.Espresso");
                System.out.println("04.Oolong Tea");

                System.out.println();
                System.out.print("Enter Drink number: ");
                int drink = scanner.nextInt();

                switch (drink){
                    case 01:
                        System.out.println("Cafe Mocha's price is "+DrinkList.get("01.Cafe Mocha"));
                        break;

                    case 02:
                        System.out.println("Cafe Latte's price is "+DrinkList.get("02.Cafe Latte"));
                        break;

                    case 03:
                        System.out.println("Espresso's price is "+DrinkList.get("03.Espresso"));
                        break;

                    case 04:
                        System.out.println("Oolong Tea's price is "+DrinkList.get("04.Oolong Tea"));
                        break;

                    default:
                        System.out.println("Invalid number");
                        break;
                }


                break;


            default:
                System.out.println("Invalid number");
                break;

        }
    }
}
