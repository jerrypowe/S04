/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s04;

import java.util.Scanner;
import io.Mylib;

/**
 *
 * @author Tam Pham
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        boolean isOk = false;
        S04 obj = new S04();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1 - Calculating Fuel Economy");
            System.out.println("2 - Calculating Distance Traveled");
            System.out.println("3 - Revised Fuel Economy Calculation");

            int choice = Mylib.GetPositiveInteger("Enter your choice: ", "Please enter choice from 1 to 4!");
            switch (choice) {
                case 1: {
                    int time = Mylib.GetPositiveInteger("How many minutes did you drive?", "Please enter the positive integer!");
                    int speed = Mylib.GetPositiveInteger("What was the average speed of the car during that time?", "Please enter the positive integer!");
                    double Gas = Mylib.GetPositiveDouble("How many gallons of gas did your car use?", "Please enter the Positive number!");
                    double result = obj.CalFuelEconomy(time, speed, Gas);
                    System.out.printf("Your car averaged %.2f miles per gallon.", result);
                    System.out.println();
                    isOk = false;
                    break;
                }
                case 2: {
                    int radiusOfTires = Mylib.GetPositiveInteger("What is the radius of your tires, in inches?", "Please enter the positive integer!");
                    int revplutions = Mylib.GetPositiveInteger("How many revolutions did your car's tires make?", "Please enter the positive integer!");
                    double result = obj.travel(radiusOfTires, revplutions);
                    System.out.printf("Your car traveled %.2f miles.", result);
                    System.out.println();
                    isOk = false;
                    break;

                }
                case 3: {
                    int radiusOfTires = Mylib.GetPositiveInteger("What is the radius of your tires, in inches?", "Please enter the positive integer!");
                    int revplutions = Mylib.GetPositiveInteger("How many revolutions did your car's tires make?", "Please enter the positive integer!");
                    double Gas = Mylib.GetPositiveDouble("How many gallons of gas did your car use?", "Please enter the Positive number!");
                    double result = obj.revisedFuelEconomyCal(radiusOfTires, revplutions, Gas);
                    System.out.printf("Your car averaged %.2f miles per gallon.", result);
                    System.out.println();
                    isOk = false;
                    break;
                }
                case 4: {
                    System.out.println("-------Thanks-------");
                    System.exit(0);
                    break;
                }
            }

        } while (true);

    }

}
