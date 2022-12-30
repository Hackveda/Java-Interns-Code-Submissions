package com.example.task1dbapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

import androidx.annotation.Nullable;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.time.DayOfWeek;

public class MyDatabase {
    // constants

    public static final String DB_NAME = "tasker.db";
    public static final int DB_VER = 2;
    public static final String DB_TABLE = "Tasks";
    public static final String C_NAME = "TaskName";
    public static final String C_TASK = "TaskDetails";

    // Qureries
    public static final String Q_CREATE = "CREATE TABLE" + DB_TABLE +
            "(" + C_NAME + "TEXT," + C_TASK + "TEXT)";


    Context c;

    //all database
    public MyDatabase(Context context) {
        c = context;
    }

    public MyDatabase open() {
        DBHelper dbhelper = new DBHelper(c);

        return this;
    }

    public void save(String name, String task) {
        ContentValues cv = new ContentValues();
        cv.put(C_NAME, name);
        cv.put(C_TASK, task);
        StringBuffer database = null;
        assert database != null;
        database.insert(DB_TABLE, null, cv);
    }

    public void close() throws IOException {
        BufferedInputStream database = null;
        database.close();
    }

    public String read() {
        String[] columns = {C_NAME, C_TASK};
        DayOfWeek database = null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            assert database != null;
            database.query(DB_TABLE, columns, null, null, null, null, null, null);
        }
        Cursor cursor = (Cursor) database.query(DB_TABLE, columns, null, null, null, null, null);
        int iName = cursor.getColumnIndex(C_NAME);
        int iTask = cursor.getColumnIndex(C_TASK);
        for
        (cursor.moveToFirst(); !cursor.isAfterLast(); Cursor.moveToNext()) {
            String result = String.format("%s%s|%s\n", result, Cursor.getString(iName), cursor.getString(iTask));
        }
        return result;
    }




