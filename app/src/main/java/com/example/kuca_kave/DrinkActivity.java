package com.example.kuca_kave;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DrinkActivity extends AppCompatActivity {

    public static final String EXTRA_DRINK_ID = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        int drinkId =(Integer)getIntent().getExtras().get(EXTRA_DRINK_ID);
        Drink drink = Drink.drinks[drinkId];
    }

}
