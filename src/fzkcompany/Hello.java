package fzkcompany;
import java.util.jar.JarOutputStream;
public class Hello {


        public static void main(String[] args) {
            System.out.println("Hello World");

            boolean isAlien = false;
            if (isAlien == false) {
                System.out.println("It is not an alien!");
                System.out.println("And I am scared of aliens");


            }
            int topScore = 100;
            if (topScore <= 100) {
                System.out.println("You got the high school");
            }
            int secondTopScore = 60;
            if (topScore > secondTopScore && topScore < 100) {
                System.out.println("Greater than second top score and less than 100");
            }
            if ((topScore > 90) || (secondTopScore <= 100)) {
                System.out.println("Either or both of the condition are true");
            }
            int newValue = 50;
            if (newValue == 50) {
                System.out.println("This is an error");


            }
            boolean isCar = false;
            if (isCar = true) {
                System.out.println("This is not supposed to happen");
            }
            String makeOfCar = "Volkswagen";
            boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
            if (isDomestic) {
                System.out.println("This car is domestic to our country");
            }
            String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
            System.out.println(s);
            double  myFirstValue = 20.00d;
            double mySecondValue = 80.00d;
            double myValueTotal =myFirstValue + secondTopScore *100.00d;
            System.out.println("MyValuesTotal = " + myValueTotal);
            double theRemainder = myValueTotal % 40.00d;
            System.out.println("theReemainder = + theRemainder");
            boolean isNoRemainder = (theRemainder==0) ? true : false;
            System.out.println("isNoRemainder = " + isNoRemainder);
            if (!isNoRemainder) {
                System.out.println("Got some remainder");
            }
        }

    }


