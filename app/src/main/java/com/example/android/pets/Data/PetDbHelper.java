package com.example.android.pets.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.pets.Data.PetContract.PetEntry;

/**
 * Created by shubham arora on 26-03-2017.
 */

public class PetDbHelper extends SQLiteOpenHelper{

    private static final String DATABASE_NAME="shelter.db";
    private static  final int DATABASE_VERSION=1;

    public PetDbHelper(Context context)
    {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }


    @Override//called when db is created for first time
    public void onCreate(SQLiteDatabase db) {

        String SQL_CREATE_PETS_TABLE="CREATE TABLE "+ PetEntry.TABLE_NAME+"("
                +PetEntry._ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"
                +PetEntry.COLUMN_PET_NAME+" TEXT NOT NULL,"
                +PetEntry.COLUMN_PET_BREED+" TEXT NOT NULL,"
                +PetEntry.COLUMN_PET_GENDER+" INTEGER NOT NULL,"
                +PetEntry.COLUMN_PET_WEIGHT+" TEXT NOT NULL DEFAULT 0);";
        db.execSQL(SQL_CREATE_PETS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
