package com.company;

import java.util.Scanner;

public class PetShop {

    public static void main(String[] args) {
	/*
	Pet Shop
    Create a new project in InteliJ named Pets
    --Rename your Main file to PetShop(right-click -> Refactor -> Rename…)
    --Create 2 new classes
        --One class should be called Dog
        --One class should be called Cat
    --Each class should have at 3 properties
        --name
        --age
        --1 more of your choosing
    --Each class should have accessor methods for each property
    --In Petshop create two instances of each animal type
    --Set values for each property
    --Print a statement to the console saying “We have the following animals available: ” followed by property values
    (name, age, etc)of each instance of Dog and Cat.
    Bonus: Ask the user to pick the name of the animal that they want to purchase and check if that is one of the 4
    animal’s names. Tell the user whether the name is not a valid choice.
	 */
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        cat1.setPetName("Ralph");
        cat1.setPetAge(3);
        cat1.setSizeCategory("small");

        cat2.setPetName("Garfield");
        cat2.setPetAge(4);
        cat2.setSizeCategory("medium");

        dog1.setPetName("Pinky");
        dog1.setPetAge(5);
        dog1.setSizeCategory("large");

        dog2.setPetName("Willow");
        dog2.setPetAge(6);
        dog2.setSizeCategory("small");

        System.out.println("We have the following animals available: " + cat1.getPetName() + ", " + cat2.getPetName()
                        + ", " + dog1.getPetName() + ", " + dog2.getPetName() + ".");

        System.out.println();

        System.out.println("Name: " + cat1.getPetName() + "\n" + "Size: " + cat1.getSizeCategory() + "\n" +
                "Age: " + cat1.getPetAge());

        System.out.println();

        System.out.println("Name: " + cat2.getPetName() + "\n" + "Size: " + cat2.getSizeCategory() + "\n" +
                "Age: " + cat2.getPetAge());

        System.out.println();

        System.out.println("Name: " + dog1.getPetName() + "\n" + "Size: " + dog1.getSizeCategory() + "\n" +
                "Age: " + dog1.getPetAge());

        System.out.println();

        System.out.println("Name: " + dog2.getPetName() + "\n" + "Size: " + dog2.getSizeCategory() + "\n" +
                "Age: " + dog2.getPetAge());

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the name of the animal that you would like: ");
        String animalName = userInput.next();
        if  (animalName.equals(cat1.getPetName()))
            System.out.println(animalName + " is available");
        else if (animalName.equals(cat2.getPetName()))
            System.out.println(animalName + " is available");
        else if (animalName.equals(dog1.getPetName()))
        System.out.println(animalName + " is available");
        else if (animalName.equals(dog2.getPetName()))
            System.out.println(animalName + " is available");
        else
            System.out.println("Pet is not available.");


    } //end main
} //end Main
