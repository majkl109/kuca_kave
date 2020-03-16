package com.example.kuca_kave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class TopLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

    AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            if (position == 0) {
                Intent intent = new Intent(TopLevelActivity.this, DrinkCategoryActivity.class);
                startActivity(intent);
            }else if(position == 0){
                Intent intent2 = new Intent(TopLevelActivity.this, FoodCategoryActivity.class);
                startActivity(intent2);

            }else{
                Intent intent2 = new Intent(TopLevelActivity.this, StoreCategoryActivity.class);
                startActivity(intent2);
            }
        }
    };
    ListView listView = findViewById(R.id.list_options);
    listView.setOnItemClickListener(itemClickListener);
  }
}
