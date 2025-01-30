package org.example.CliFunctions;

import java.util.Scanner;

public class CliFunction {
    private final Scanner input = new Scanner(System.in);
    private int random;

    public CliFunction(){
        while (true){
            apointedMode(selectLevel());
        }
    }

    public int selectLevel(){

        random = (int) (Math.random() * 101);

        System.out.println("""
                Welcome to the Number Guessing Game!
                I'm thinking of a number between 1 and 100.
                You have 5 chances to guess the correct number.
                """);

        System.out.println("""
                Please select the difficulty level:
                 1. Easy (10 chances)
                 2. Medium (5 chances)
                 3. Hard (3 chances)
                 4. Exit
                """);

        System.out.print("Enter your choice: ");
        return input.nextInt();
    }
    public boolean game(int enter){
        if(random != enter){
            if(random > enter){
                System.out.println("Incorrect! The number is greater than " + enter + ".");
            }else{
                System.out.println("Incorrect! The number is less than " + enter + ".");
            }
            return false;
        }
        return true;
    }

    public void apointedMode(int level){
        switch (level){
            case 1 -> mode(10);
            case 2 -> mode(5);
            case 3 -> mode(3);
            case 4 -> Exit();
            default -> System.out.println("Incorrect enter mode!!!!");
        }
    }

    public void mode(int chances){

        for (int i = 0; i < chances ; i++) {
            System.out.print("Enter your guess: ");
            if(game(input.nextInt())){
                System.out.println("Congratulations! You guessed the correct number in "+i+" attempts.\n");
                return;
            }
        }
        System.out.println("Sorry!! do you no have success.\n");
    }
    public void Exit(){
        System.out.println("Thanks!!!");
        System.exit(0);
    }



}
