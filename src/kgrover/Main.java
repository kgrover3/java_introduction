package kgrover;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your age?");
        int age = scanner.nextInt();
        System.out.println("Put true or false, are you from Europe?");
        boolean isEuropean = scanner.nextBoolean();

        int euDrinkingAge = 18;
        int usDrinkingAge = 21;

        boolean canDrink = isEuropean && age >= euDrinkingAge || !isEuropean && age >= usDrinkingAge;
        System.out.println("Can you drink? " + canDrink);

    }
}