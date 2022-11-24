package com.example.introductiontodatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Mydatabase {
    //Constants
    public static final String DB_NAME = "tasker.db";
    public static final int DB_VER = 2;
    public static final String DB_TABLE = "tasks";
    public static final String C_NAME = "Taskaman";
    public static final String F_Task ="TaskDetails";

    //Queries
    public static final String Q_CREATE = "CREATE TABLE "+ DB_TABLE + "(" + C_NAME + " TEXT, " + F_Task + " TEXT)";

    Context c;
    private DBHelper dbhelper;
    private SQLiteDatabase database;

    //All database operation will be here
    public Mydatabase(Context context) {
        c = context;
    }

    public Mydatabase open() {
        dbhelper = new DBHelper(c);
        database = dbhelper.getWritableDatabase();
        return this;
    }

    public void save(String name, String task) {
        ContentValues cv = new ContentValues();
        cv.put(C_NAME,name);
        cv.put(F_Task,task);
        database.insert(DB_TABLE,null,cv);
    }

    public void close() {
        database.close();
    }

    public String read() {
        String result = "";
        String[] columns = {C_NAME,F_Task};
        Cursor cursor = database.query (DB_TABLE,columns,null,null,null,null,null);
        int iname = cursor.getColumnIndex(C_NAME);
        int itask = cursor.getColumnIndex(F_Task);

        for(cursor.moveToFirst();!cursor.isAfterLast();cursor.moveToNext()){
            result = result + cursor.getString(iname) + "| " + cursor.getString(itask) + "\n";

        }
        return result;
    }
    private class DBHelper extends SQLiteOpenHelper{

        public DBHelper(@Nullable Context context) {
            super(context, DB_NAME, null, DB_VER);
        }

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            sqLiteDatabase.execSQL(Q_CREATE);

        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        }
    }
}
