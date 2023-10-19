package com.example.oreo04;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class inputID extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_id);
    }

    public void onTransitionClick(View view){
        EditText YourID = findViewById(R.id.IDField);
        EditText CouponID = findViewById(R.id.CouponField);

        String text1 = YourID.getText().toString();
        String text2 = CouponID.getText().toString();

        if(!text1.isEmpty() && !text2.isEmpty()){
            Intent intentNext = new Intent(getApplication(), ViewPicture.class);
            startActivity(intentNext);
        }
    }
    public void onBackButtonClick(View view) {
        finish();
    }
}

/*
        画面遷移-次
        Button btTransitionNext = findViewById(R.id.btGenerate);
        btTransitionNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNext = new Intent(getApplication(), inputID.class);
                startActivity(intentNext);
            }
        });

        以下は上記のラムダ式

        Button btTransitionNext = findViewById(R.id.btGenerate);
        btTransitionNext.setOnClickListener(v -> {
            Intent intentNext = new Intent(getApplication(), ViewPicture.class);
            startActivity(intentNext);
        });

        以下は戻るボタンで戻る記述、ただonBackButtonClickのような書式で良い。
        なぜならfinish(); でinputIDそのものの画面描写が終わるから。
            Androidは画面の上に画面が乗っかって行くイメージ。画面遷移というものの...と言った実態。

        Button btBackInputID = findViewById(R.id.btBackInputID);
        btBackInputID.setOnClickListener(v -> {
            Intent intentBack = new Intent(getApplication() , MainActivity.class);
            startActivity(intentBack);
        });

 */