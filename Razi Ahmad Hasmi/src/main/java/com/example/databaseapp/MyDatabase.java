package com.example.databaseapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDatabase {
    public static final String DB_NAME = "tasker.db";
    public static final int DB_VER = 2;
    public static final String DB_TABLE = "Tasks";
    public static final String C_NAME = "TaskName";
    public static final String C_TASK = "TaskDetails";

    public static final String Q_CREATE = "CREATE TABLE " + DB_TABLE + "(" + C_NAME + " TEXT, " + C_TASK + " TEXT)";
    Context c;
    private DBHelper dbhelper;
    private SQLiteDatabase database;

    public MyDatabase(Context context){
        c = context;

    }

    public MyDatabase open() {
        dbhelper = new DBHelper(c);
        database = dbhelper.getWritableDatabase();
        return this;
    }

    public void save(String name, String task) {
        ContentValues cv = new ContentValues();
        cv.put(C_NAME, name);
        cv.put(C_TASK, task);
        database.insert(DB_TABLE, null, cv);

    }

    public void close() {
        database.close();

    }

    public String read() {
        String result = " ";

        String[] columns = {C_NAME, C_TASK};
        Cursor cursor = database.query(DB_TABLE, columns, null, null, null, null, null);
        int iName = cursor.getColumnIndex(C_NAME);
        int iTask = cursor.getColumnIndex(C_TASK);

        for(cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()){
            result = result + cursor.getString(iName) + " | " + cursor.getString(iTask) + "\n";

        }

        return result;
    }
    private class DBHelper extends SQLiteOpenHelper{

        public DBHelper(Context context) {
            super(context, DB_NAME, null, DB_VER);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(Q_CREATE);

        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        }
    }
}
