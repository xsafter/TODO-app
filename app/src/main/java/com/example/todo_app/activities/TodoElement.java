package com.example.todo_app.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.todo_app.R;

public class TodoElement extends AppCompatActivity {
    CheckBox hasDone;
    TextView taskName;
    TextView taskDescription;
    TextView taskPriority;
    ImageView userAvatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_todo_element);
    }
    private void initView(){
        hasDone = findViewById(R.id.checkBoxHasDone);
        taskName = findViewById(R.id.taskName);
        taskDescription = findViewById(R.id.taskDescription);
        userAvatar = findViewById(R.id.userAvatar);
    }
}