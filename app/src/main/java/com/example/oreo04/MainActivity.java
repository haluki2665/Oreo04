package com.example.oreo04;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*
  ボタンによる画面遷移
 */
        Button btTransitionNext = findViewById(R.id.btTransition);
        btTransitionNext.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(), inputID.class);
            startActivity(intent);
        });

    }
}