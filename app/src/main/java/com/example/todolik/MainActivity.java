package com.example.todolik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.InputType;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayList<Task> tasks = new ArrayList<Task>();
    CheckBox task;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setData();

        RecyclerView recyclerView = findViewById(R.id.listOfTasks);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        DoesAdapter adapter = new DoesAdapter(this, tasks);
        recyclerView.setAdapter(adapter);
    }

    public void showKeyboard(View view) {
        //Todo: write keyboard opening with edittext
    }

    private void setData() {
        tasks.add(new Task("Work out", false));
        tasks.add(new Task("Study English", false));
        tasks.add(new Task("Go to work", false));
    }
}
