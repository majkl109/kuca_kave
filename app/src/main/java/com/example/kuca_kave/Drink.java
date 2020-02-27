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

}
