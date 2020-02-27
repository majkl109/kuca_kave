package com.example.kuca_kave;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    pubic static final Drink[] drinks = {
            new Drink("Kava s mlijekom", "Espresso sa toplim ili hladnim mlijekom", R.drawable.latte),
            new Drink("Cappucino", "Espresso sa pjenom od mlijeka", R.drawable.cappucino),
            new Drink("Espresso", "Kratka crna kava", R.drawable.espresso)
    };

    public Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
