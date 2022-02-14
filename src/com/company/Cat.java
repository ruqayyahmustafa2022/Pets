package com.company;

public class Cat {
    private String petName;
    private int petAge;
    private String sizeCategory;   //small, medium, large size category

    public void setPetName(String name)
    {
        petName = name;
    }

    public void setPetAge(int age)
    {
        petAge = age;
    }

    public void setSizeCategory(String size)
    {
        sizeCategory = size;
    }

    public String getPetName()
    {
        return petName;
    }

    public int getPetAge()
    {
        return petAge;
    }

    public String getSizeCategory()
    {
        return sizeCategory;
    }
}
