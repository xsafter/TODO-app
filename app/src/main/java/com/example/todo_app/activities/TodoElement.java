package com.example.todo_app.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
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

        hasDone.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    CharSequence styledText = Html.fromHtml("<s>" + taskName + "</s>");
                    taskName.setText(styledText.toString());
                }
                else ;
            }
        });
    }
    private void initView(){
        hasDone = findViewById(R.id.checkBoxHasDone);
        taskName = findViewById(R.id.taskName);
        taskDescription = findViewById(R.id.taskDescription);
        userAvatar = findViewById(R.id.userAvatar);
    }
}