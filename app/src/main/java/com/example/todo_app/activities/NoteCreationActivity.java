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
import com.example.todo_app.models.application.User;
import com.example.todo_app.models.domain.Note;
import com.example.todo_app.models.domain.UserD;
import com.example.todo_app.services.DatabaseService;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

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

        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name; String description; Date date = new Date(); String importance = "";
                name = editNoteName.getText().toString(); description = editNoteDescription.getText().toString();
                noteName.setText(name);
                SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy hh:mm");
                noteTime.setText(sdf.format(date));

                if (lowButton.isChecked()) importance = "low";
                if (mediumButton.isChecked()) importance = "medium";
                if (highButton.isChecked()) importance = "high";

                User user = new User(new UserD("zxczxc", date.getDate()));
                Note note = new Note(name, description, date.getDate(), importance, user, false);
                DatabaseService.addNote(note);
                startActivity(new Intent(NoteCreationActivity.this, MainActivity.class));
            }
        });
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