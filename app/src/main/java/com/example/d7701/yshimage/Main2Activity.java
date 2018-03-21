package com.example.d7701.yshimage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button btResult2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent findIntent = getIntent();
        int[] hitCount = findIntent.getIntArrayExtra("VoteCount");
        String[] imgName = findIntent.getStringArrayExtra("ImgName");

        btResult2 = findViewById(R.id.btResult2);
        btResult2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
