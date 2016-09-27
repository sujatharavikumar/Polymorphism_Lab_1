package Ravikumar.Sujatha.Polymorphism;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sujatharavikumar on 9/26/16.
 */
public class PetShopTest {

    @Test
    public void createPetsTest(){
        PetShop petShop = new PetShop();
        petShop.createPets("dog,cat,fish");
        Pet actualOutput1 = petShop.petList.get(0);
        Pet actualOutput2 = petShop.petList.get(1);
        Pet actualOutput3 = petShop.petList.get(2);
        boolean isDog = actualOutput1 instanceof Dog;
        boolean isCat = actualOutput2 instanceof Cat;
        boolean isFish = actualOutput3 instanceof Fish;
        Assert.assertTrue(isDog);
        Assert.assertTrue(isCat);
        Assert.assertTrue(isFish);
    }

    @Test
    public void assignNamesTest(){
        PetShop petShop = new PetShop();
        petShop.createPets("dog,cat,fish");
        petShop.assignNames("Rusty,Mitty,Goldie");
        String actualOutput1 = petShop.petList.get(0).getName();
        String expectedOutput1 = "Rusty";
        String actualOutput2 = petShop.petList.get(1).getName();
        String expectedOutput2 = "Mitty";
        String actualOutput3 = petShop.petList.get(2).getName();
        String expectedOutput3 = "Goldie";
        Assert.assertEquals("The name should be Rusty", expectedOutput1, actualOutput1);
        Assert.assertEquals("The name should be Mitty", expectedOutput2, actualOutput2);
        Assert.assertEquals("The name should be Goldie", expectedOutput3, actualOutput3);

    }



}
