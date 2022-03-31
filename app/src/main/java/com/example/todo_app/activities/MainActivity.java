package com.example.todo_app.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.todo_app.R;
import com.example.todo_app.adapters.TodoAdapter;
import com.example.todo_app.services.DatabaseService;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton createNoteButton;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        createNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, NoteCreationActivity.class));
            }
        });


        RecyclerView recyclerview = findViewById(R.id.recyclerView);

        adapter = new TodoAdapter(DatabaseService.getNoteOptions());
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);

        recyclerview.setAdapter(adapter);
        recyclerview.setLayoutManager(layoutManager);
    }
    private void initView(){
        createNoteButton = findViewById(R.id.createNoteButton);
    }

    protected void onStart(){
        super.onStart();
//        adapter.startListening();
    }
}