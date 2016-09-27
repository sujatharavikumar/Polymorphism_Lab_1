package Ravikumar.Sujatha.Polymorphism;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by sujatharavikumar on 9/26/16.
 */
public class PetApp {

    public static void main(String[] args) {

        Input input = new Input();
        PetShop shop = new PetShop();

        input.getNumberOfPets();

        String petType = input.getTypeOfPets();
        shop.createPets(petType);

        String petNames = input.getPetNames();
        shop.assignNames(petNames);

    }

}
