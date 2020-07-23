package com.example.kuca_kave;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FoodActivity extends Fragment {

    private FragmentListener listener;
    private TextView textName;
    private TextView textDescription;
    private ImageView imagePhoto;


    public interface FragmentListener{
        void onInputASent(CharSequence input);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.activity_food, container,false);

        textName = v.findViewById(R.id.name);
        textDescription = v.findViewById(R.id.description);
        imagePhoto = v.findViewById(R.id.photo);

        return v;
    }


    public static final String EXTRA_FOOD_ID = "foodId";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        int foodId =(Integer)getIntent().getExtras().get(EXTRA_FOOD_ID);
        Food food = Food.foods[foodId];

        TextView name = findViewById(R.id.name);
        name.setText(food.getName());

        TextView description = findViewById(R.id.description);
        description.setText(food.getDescription());

        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(food.getImageResourceID());
        photo.setContentDescription(food.getName());
    }


}
