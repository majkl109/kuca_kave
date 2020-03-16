package com.example.kuca_kave;

public class Store {

    private String coffeeName;
    private String description;
    private int  imageResourceID;

    public static final Coffee[] coffees = {

            new Coffee("Brazil", "Brazilska kava", R.drawable.brasilian_coffee),
            new Coffee("Columbia", "Kolumbjska kava", R.drawable.colombian_coffee),
            new Coffee("Africa", "Afrička kava iz više država", R.drawable.african_coffee)
    };

    public Store(String coffeeName, String description, int imageResourceID) {
        this.coffeeName = coffeeName;
        this.description = description;
        this.imageResourceID = imageResourceID;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    @Override
    public String toString() {
        return this.coffeeName;
    }
}
