package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        int yearsLeft = 100 - age;
        if (yearsLeft > 0) {
            System.out.println("you have " + yearsLeft + " years until you are 100 years old.");
        } else if (yearsLeft == 0) {
            System.out.println("Congratulations! you are 100 years old this year.");
        } else {
            System.out.println("You turned to 100" + Math.abs(yearsLeft) + "years ago!");
        }

        scanner.close();
    }
}