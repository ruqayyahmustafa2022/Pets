package com.company;

public class Dog {
    private String petName;
    private int petAge;
    private String sizeCategory;   //small, medium, large size category

    public void setPetName(String petName) {this.petName = petName;}

    public void setPetAge(int petAge) {this.petAge = petAge;}

    public void setSizeCategory(String sizeCategory) {this.sizeCategory = sizeCategory;}

    public String getPetName()
    {
        return petName;
    }

    public int getPetAge()
    {
        return petAge;
    }

    public String getSizeCategory() {return sizeCategory;}

    /*
    public Dog() {
        petName = "Jimmy";
        petAge = 5;
        sizeCategory = "medium";}

     */

    public Dog() {
        petName = "Sam";
        petAge = 5;
        sizeCategory = "medium";

    }
}
