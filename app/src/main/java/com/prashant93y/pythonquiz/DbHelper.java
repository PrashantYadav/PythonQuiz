package com.prashant93y.pythonquiz;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.prashant93y.pythonquiz.FeedReaderContract.FeedEntry;

/**
 * Created by Prashant Yadav on 3/5/2016.
 */
public class DbHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "PythonQuestions.db";

    private static final String TEXT_TYPE = "TEXT";
        private static final String COMMA_SEP = ", ";


    private static final String SQL_CREATE_ENTERIES =
            "CREATE TABLE "+ FeedEntry .TABLE_NAME +"(" +
                    FeedEntry._ID + " INTEGER PRIMARY KEY" + COMMA_SEP +
                    FeedEntry.COL_QUESTION + TEXT_TYPE + COMMA_SEP +
                    FeedEntry.COL_ANS1 + TEXT_TYPE + COMMA_SEP +
                    FeedEntry.COL_ANS2 + TEXT_TYPE + COMMA_SEP +
                    FeedEntry.COL_ANS3 + TEXT_TYPE + COMMA_SEP +
                    FeedEntry.COL_ANS4 + TEXT_TYPE + COMMA_SEP +
                    FeedEntry.COL_RIGHT_ANS + TEXT_TYPE + COMMA_SEP +
                    FeedEntry.COL_SOLUTION + TEXT_TYPE + COMMA_SEP +
                    FeedEntry.COL_LEVEL + TEXT_TYPE +
                    " )";


    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + FeedEntry.TABLE_NAME;

    public DbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        insertData();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTERIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if(oldVersion != newVersion){
            db.execSQL(SQL_DELETE_ENTRIES);
            onCreate(db);
        }
    }

    public void insertData(){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(FeedEntry.COL_QUESTION,"What type of language python is?");
        contentValues.put(FeedEntry.COL_ANS1,"Interpreted");
        contentValues.put(FeedEntry.COL_ANS2,"Compiled");
        contentValues.put(FeedEntry.COL_ANS3,"Both of the above");
        contentValues.put(FeedEntry.COL_ANS4,"None of the above");
        contentValues.put(FeedEntry.COL_RIGHT_ANS,"1");
        contentValues.put(FeedEntry.COL_SOLUTION, "Python is an interpreted language");
        contentValues.put(FeedEntry.COL_LEVEL, "1");

        long result = db.insert(FeedEntry.TABLE_NAME, null, contentValues);

    }


}
