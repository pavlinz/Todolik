package com.example.todolik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showKeyboard(View view) {
        EditText taskInput = new EditText(this);
        taskInput.setInputType(InputType.TYPE_CLASS_TEXT);
    }
}
