package com.example.todo_app.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.todo_app.R;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NoteCreationActivity extends AppCompatActivity {
    ImageButton goBackButton;
    TextView noteName;
    TextView noteTime;
    EditText editNoteName;
    EditText editNoteDescription;
    RadioButton highButton;
    RadioButton mediumButton;
    RadioButton lowButton;
    Button createButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_creation);
        initView();

        goBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NoteCreationActivity.this, MainActivity.class));
            }
        });

        String name; String description; Date date = new Date(); String importance;
        name = editNoteName.getText().toString(); description = editNoteDescription.getText().toString();
        noteName.setText(name);

//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(date);
//        String dateBuf;
//        dateBuf = calendar.get(Calendar.DAY_OF_MONTH) + calendar.get(Calendar.MONTH) + "\"" + calendar.get(Calendar.YEAR).substring(2, 3)
//                + "\n" + calendar.get(Calendar.HOUR);
//        noteTime.setText(date.toString());

        if (lowButton.isChecked()) importance = "low";
        if (mediumButton.isChecked()) importance = "medium";
        if (highButton.isChecked()) importance = "high";

    }
    private void initView(){
        goBackButton = findViewById(R.id.goBackButton);
        noteName = findViewById(R.id.noteName);
        noteTime = findViewById(R.id.noteTime);
        editNoteName = findViewById(R.id.editNoteName);
        editNoteDescription = findViewById(R.id.editNoteDescription);
        highButton = findViewById(R.id.highButton);
        mediumButton = findViewById(R.id.mediumButton);
        lowButton = findViewById(R.id.lowButton);
        createButton = findViewById(R.id.createButton);
    }
}