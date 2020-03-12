package com.example.kuca_kave;

public class Food {

    private String name;
    private String description;
    private int  imageResourceID;

    private static final Food[] foods = {

            new Food("Sandwich", "Sandwich sa jajetom, avokadom i tofuom", R.drawable.sandwich),
            new Food("Torta", "Torta sa crnom mousse kremom", R.drawable.chocolate_cake),
            new Food("Sladoled", "Sladoledi raznih okusa ", R.drawable.ice_cream)
    };


    public Food(String name, String description, int imageResourceID) {
        this.name = name;
        this.description = description;
        this.imageResourceID = imageResourceID;
    }

    public String getName() { return name; }

    public String getDescription() { return description; }

    public int getImageResourceID() { return imageResourceID; }

    @Override
    public String toString() { return this.name; }
}
