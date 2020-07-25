package com.example.kuca_kave;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "kuca_kave";
    private static final int DB_VERSION = 1;

    DatabaseHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);

    }
    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE DRINK (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "NAME TEXT,"
                + "DESCRIPTION TEXT, "
                + "IMAGE_RESOURCE_ID INTEGER);");
        insertDRINK(db, "Latte", "Espresso i vruce mlijeko", R.drawable.latte);
        insertDRINK(db, "Cappuccino", "Espresso,vruce mlijeko i mlijecna pjena", R.drawable.cappucino);
        insertDRINK(db, "Espresso", "Espresso kava", R.drawable.espresso);

    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }

}
