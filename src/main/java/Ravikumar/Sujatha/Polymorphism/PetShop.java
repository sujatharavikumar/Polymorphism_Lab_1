package Ravikumar.Sujatha.Polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sujatharavikumar on 9/26/16.
 */
public class PetShop {

    public List<Pet> petList = new ArrayList<Pet>();

    public void createPets(String petType){
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
                    System.out.println("We do not support a pet " +singlePet+ " in our pet shop");

            }
        }

    }


    public void assignNames(String petNames){
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
