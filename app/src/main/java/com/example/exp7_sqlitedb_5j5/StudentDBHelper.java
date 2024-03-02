package com.example.exp7_sqlitedb_5j5;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class StudentDBHelper extends SQLiteOpenHelper {
    public StudentDBHelper(Context context) {
        super(context,"student.db",null,1);
    }

    public StudentDBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) { //creating a table
        String q = "create table StudentGrade(roll TEXT primary key, name TEXT, avg TEXT, grade TEXT) ";
        //query is executed
        db.execSQL(q);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String q = "drop table if exists StudentGrade";
        //query is executed
        db.execSQL(q);
    }
    public boolean insertStudent(String roll, String name, String avg, String grade){
        SQLiteDatabase sqLiteDatabase= this.getWritableDatabase();
        ContentValues student = new ContentValues();
        student.put("roll",roll);
        student.put("name",name);
        student.put("avg",avg);
        student.put("grade",grade);
        long res;
        res = sqLiteDatabase.insert("StudentGrade",null,student);
        if(res==-1) return (false);
        else return(true);

    }
    public int updateStudent(String roll, String name, String avg, String grade){
        SQLiteDatabase sqLiteDatabase= this.getWritableDatabase();
        ContentValues student = new ContentValues();
        student.put("roll",roll);
        student.put("name",name);
        student.put("avg",avg);
        student.put("grade",grade);
        String[] params = new String[]{roll};

        return sqLiteDatabase.update("StudentGrade",student,"roll=?",params);
    }

    public boolean deleteStudent(String roll){
        SQLiteDatabase sqLiteDatabase= this.getWritableDatabase();
        ContentValues student = new ContentValues();
        student.put("roll",roll);

        String[] params = new String[]{roll};
        long res;
        res = sqLiteDatabase.delete("StudentGrade","roll=?",params);
        if(res==-1) return (false);
        else return(true);

    }
    public Cursor viewStudent(String roll){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        String[] params = new String[]{roll};
        return sqLiteDatabase.rawQuery("select * from StudentGrade where roll=?",params);
    }
}
