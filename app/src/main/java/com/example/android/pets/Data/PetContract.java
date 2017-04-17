package com.example.android.pets.Data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by shubham arora on 26-03-2017.
 */

public final class PetContract {

    private PetContract(){}

    public static final String CONTENT_AUTHORITY = "com.example.android.pets";//bahar ki apps ko authority nahi hai..kval isi app ka content provider interact kar sakta hai
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public static final String PATH_PETS = "pets";//what can the provider access
    public static final class PetEntry implements BaseColumns{


        public static final String TABLE_NAME="pets";
        public static final String _ID=BaseColumns._ID;
        public static final String COLUMN_PET_NAME="name";
        public static final String COLUMN_PET_BREED="breed";
        public static final String COLUMN_PET_GENDER="gender";
        public static final String COLUMN_PET_WEIGHT="weight";

        public static final int GENDER_MALE=1;
        public static final int GENDER_FEMALE=2;
        public static final int GENDER_UNKNOWN=0;

        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PETS);

        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PETS;

        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PETS;

        public static final Boolean  isValidGender(int gender)
        {
            if(gender==0||gender==1||gender==2)
                return true;
            else
                return false;
        }
    }

}
