package Ravikumar.Sujatha.Polymorphism;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by sujatharavikumar on 9/26/16.
 */
public class PetApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hello....How many pets do you have?");
        int numberOfPets = input.nextInt();
        List<Pet> petList = new ArrayList<Pet>();

        System.out.println("What kind of pets are those? Separate each pet with a comma");
        input.nextLine();
        String petType = input.nextLine();
        String[] petTypes = petType.split(",");
        for (String singlePet: petTypes) {

            switch(singlePet){
                case "dog":
                    petList.add(new Dog());
                    break;
                case "cat":
                    petList.add(new Cat());
                    break;
                case "fish":
                    petList.add(new Fish());
                    break;
                default:
                    System.out.println("We do not support this pet in our pet shop");

            }
        }

        System.out.println("What are their names? Separate each name with a comma");
        String petNames = input.nextLine();
        String[] petNamesArray = petNames.split(",");
        for (int i=0; i<petList.size(); i++){
            petList.get(i).setName(petNamesArray[i]);
        }

        for (int j=0; j<petList.size(); j++){
            System.out.println();
            System.out.print(petList.get(j).getName()+ " says ");
            petList.get(j).speak();
        }


    }


}
