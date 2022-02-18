package com.company;

public class Cat {
    private String petName;
    private int petAge;
    private String sizeCategory;   //small, medium, large size category


    public void setPetName(String petName) {this.petName = petName;}

    public void setPetAge(int petAge) {this.petAge = petAge;}

    public void setSizeCategory(String sizeCategory) {this.sizeCategory =  sizeCategory;}

    public String getPetName() {return petName;}

    public int getPetAge() {return petAge;}

    public String getSizeCategory() {return sizeCategory;}

    public Cat() {
        petName = "Charlie";
        petAge = 3;
        sizeCategory = "small";

    }
}
