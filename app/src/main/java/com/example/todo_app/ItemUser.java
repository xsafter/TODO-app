package com.example.todo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemUser extends AppCompatActivity {
    ImageView avatar;
    TextView username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_user);
    }
    private void initView() {
        avatar = (ImageView) findViewById(R.id.userAvatar);
        username = (TextView) findViewById(R.id.nameUser);
    }
}