import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;
import static java.lang.Math.*;
public class Restaurant {

    public static void main(String[] args) {
        System.out.println("If you have got a coupon write it below: ");
        Check check = new Check();
        Scanner discount = new Scanner(System.in);

dfgfh 
поааввоао
роплорлр
аопопловп
лплгпвлнглнв
        //Убрать кейсы, вместо них вставить словарь, либо класс
        //Подтянуть теорию с первого курса листы, обстрактные классы, типы данных и тд


        int yourDiscount = discount.nextInt();
        switch (yourDiscount){
            case 102050:
                System.out.println("You will have a discount 15%!");
                check.setX(0.85);
                break;
            case 102030:
                System.out.println("You will have a discount 20%!");
                check.setX(0.80);
                break;
            default:
                System.out.println("You will not have a discount :( ");
                check.setX(1);
        }
        System.out.println("To order drink write 'drink', if u don't wanna order drink write anything else");
        Scanner scanner = new Scanner(System.in);
        String drink = scanner.nextLine();
        switch(drink){
            case "drink":
            System.out.println("Choose your drink please");
            System.out.println("lemonade 1$ (1) or tea 1$ (2) or milk 1.5$ (3)");
            int parsedDrink = scanner.nextInt();
            if (parsedDrink == 1){
                System.out.println("lemonade");
                System.out.println();
                check.setDrink("lemonade");
                check.setPriceDrink("1$");
                check.setSum(1);
            }
            else if (parsedDrink == 2){
                System.out.println("tea");
                check.setDrink("tea");
                System.out.println();
                check.setPriceDrink("1$");
                check.setSum(1);
            }
            else if (parsedDrink == 3){
                System.out.println("milk");
                check.setDrink("milk");
                System.out.println();
                check.setPriceDrink("1.5$");
                check.setSum(1.5);
            }
            break;
            default:
                System.out.println("You don't wanna drink today");

        }
        int m;
        System.out.println("To order main dish write 'meat' if u want meat or 'vegan' if u want vegan dish, if u don't wanna order main dish write anything else");
        Scanner scannerForMeat = new Scanner(System.in);
        String meat = scannerForMeat.nextLine();
        switch(meat) {
            case "meat":
            System.out.println("Burger+potato 5$ (1) or beef+eggs 7$ (2)");
                int parsedFood = scanner.nextInt();
                if (parsedFood == 1){
                    System.out.println("Burger and potato");
                    System.out.println();
                    check.setMainDish("Burger and potato");
                    check.setPriceMainDish("5$");
                    check.setSum(5);
                }
                else if (parsedFood == 2){
                    System.out.println("beef and eggs");
                    System.out.println();
                    check.setMainDish("beef and eggs");
                    check.setPriceMainDish("7$");
                    check.setSum(7);
                }
                break;

                    case "vegan":
                        System.out.println("potato 3$ (1) or salad 4$ (2)");
                        int parsedVegan = scanner.nextInt();
                        if (parsedVegan == 1){
                        System.out.println("potato");
                        System.out.println();
                        check.setMainDish("potato");
                        check.setPriceMainDish("3$");
                        check.setSum(3);

                        }
                        else if (parsedVegan == 2){
                        System.out.println("salad");
                        System.out.println();
                        check.setMainDish("salad");
                        check.setPriceMainDish("4$");
                        check.setSum(4);
                        }
                break;
                default:
                System.out.println("U'r don't wanna eat main dish");

        }
        int k;
        System.out.println("To order desert write 'desert', if u don't wanna order desert write anything else");
        Scanner scannerForDesert = new Scanner(System.in);
        String desert = scannerForDesert.nextLine();
        switch (desert) {
            case "desert":
                System.out.println("chocolate cake 2$ (1) or pie 2$ (2) or iceCream 2$ (3) or chewingGum 1$ (4)");
                int parsedDesert = scanner.nextInt();
                if (parsedDesert == 1) {
                    System.out.println("chocolate cake");
                    System.out.println();
                    check.setDesert("chocolate cake");
                    check.setPriceDesert("2$");
                    check.setSum(2);

                }
                else if (parsedDesert == 3) {
                    System.out.println("iceCream");
                    System.out.println();
                    check.setDesert("iceCream");
                    check.setPriceDesert("2$");
                    check.setSum(2);
                }
                else if (parsedDesert == 2) {
                    System.out.println("Pie");
                    System.out.println();
                    check.setDesert("pie");
                    check.setPriceDesert("2$");
                    check.setSum(2);
                }
                else if (parsedDesert == 4) {
                    System.out.println("chewingGum");
                    System.out.println();
                    check.setDesert("chewingGum");
                    check.setPriceDesert("1$");
                    check.setSum(1);
                }
                break;
            default:
                System.out.println("You don't wanna eat desert:(");

        }
        System.out.println(check.toString());
        System.out.println("If you liked how you were served you can leave some tips :) ");
        System.out.println("Have a great day!!! :) ");
    }
}
