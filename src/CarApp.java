/**
 * Created by D.Cisero on 7/21/17.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Car> carList = new ArrayList<Car>();

        carList.add(new Car("Chevorlet", "Cruze", 2017, 23444.55));
        carList.add(new Car("Chevorlet", "Impala", 2017, 27500.85));
        carList.add(new Car("Dodge", "Dart", 2017, 24395.95));
        carList.add(new UsedCar("Dodge", "Charger", 2012, 25637.65, "used", 45345.55));
        carList.add(new UsedCar("Ford", "Fusion", 2014, 16765.75, "used", 37167.69));
        carList.add(new UsedCar("Ford", "Fiesta", 2015, 14923.44, "used", 26789.87));

        int userInput;
        String answer = "Y";

        System.out.println("Welcome to Grand Circus Auto inventory!");
        System.out.println();

        //out print car list 3 new 3 used, total 6, hard code list
        //add (used) to used and the miles
        for (int i = 1; i < carList.size(); i++) {
            if (carList.get(i) instanceof UsedCar) {
                UsedCar u = (UsedCar) (carList.get(i));
            }

            for (Car carIn : carList) {

                System.out.println(i + ": " + carIn);
                i++;
            }
            System.out.println();

            //ask user which car did they like
            System.out.print("Which car would you like? ");
            userInput = scan.nextInt();
            System.out.println();
            userInput--; //converts user # to ArrayList index

            System.out.println(carList.get(userInput));
            System.out.println();


            //ask the user would they like to buy the car
            System.out.println("Would you like to buy this car? (y/n) ");
            answer = scan.next();

            if (answer.equalsIgnoreCase("y")) {
                System.out.println("Excellent! Our finance department will be in touch shortly.");
                System.out.println();
                }
            if (answer.equalsIgnoreCase("n")) {
                System.out.println("Thank you, have a great day!");
                break;
            }

            //delete the chosen car out off the ArrayList after user answers yes
            carList.remove(userInput);
            for (i = 1; i < carList.size(); i++) {
                if (carList.get(i) instanceof UsedCar) {
                    UsedCar u = (UsedCar) (carList.get(i));
                }

                for (Car carIn : carList) {

                    System.out.println(i + ": " + carIn);
                    i++;
                }
                System.out.println();
                System.out.println("Have a great day!");

            }
        }
    }
}


