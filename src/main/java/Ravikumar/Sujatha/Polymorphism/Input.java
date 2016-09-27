package Ravikumar.Sujatha.Polymorphism;

import java.util.Scanner;

/**
 * Created by sujatharavikumar on 9/26/16.
 */
public class Input {

    Scanner input = new Scanner(System.in);

    public void getNumberOfPets(){
        System.out.println("Hello....How many pets do you have?");
        int numberOfPets = input.nextInt();
    }

    public String getTypeOfPets(){
        input.nextLine();
        System.out.println("What kind of pets are those? Separate each pet with a comma");
        return input.nextLine();
    }

    public String getPetNames(){
        System.out.println("What are their names? Separate each name with a comma");
        return input.nextLine();
    }

}
