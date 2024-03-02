package com.example.exp7_sqlitedb_5j5;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    StudentDBHelper dbHelper;
    EditText et_roll, et_name,et_avg, et_grade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //object is created
        dbHelper = new StudentDBHelper(this);
        et_roll = this.findViewById(R.id.et_roll);
        et_name = this.findViewById(R.id.et_name);
        et_avg = this.findViewById(R.id.et_avg);
        et_grade = this.findViewById(R.id.et_grade);
    }
    public void insertStudent(View v){
        String r = et_roll.getText().toString();
        String n = et_name.getText().toString();
        String a = et_avg.getText().toString();
        String g = et_grade.getText().toString();

        if(dbHelper.insertStudent(r,n,a,g)){
            Toast.makeText(this, "Insertion is Successful", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "Insertion is Failed", Toast.LENGTH_LONG).show();
        }
    }
    public void deleteStudent(View v){
        String r = et_roll.getText().toString();

        if(dbHelper.deleteStudent(r)){
            Toast.makeText(this, "Deletion is Successful", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "Deletion is Failed", Toast.LENGTH_LONG).show();
        }
    }

    public void updateStudent(View v){
        String r = et_roll.getText().toString();
        String n = et_name.getText().toString();
        String a = et_avg.getText().toString();
        String g = et_grade.getText().toString();

        if(dbHelper.updateStudent(r,n,a,g)>0){
            Toast.makeText(this, "Updation is Successful", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "Updation is Failed", Toast.LENGTH_LONG).show();
        }
    }
    public void getStudent(View v){
        Cursor student = dbHelper.viewStudent(et_roll.getText().toString());
        if(student.moveToFirst()){
            et_name.setText(student.getString(1));
            et_avg.setText(student.getString(2));
            et_grade.setText(student.getString(3));
        }
        else{
            Toast.makeText(this, "No such student", Toast.LENGTH_LONG).show();
        }
    }
}