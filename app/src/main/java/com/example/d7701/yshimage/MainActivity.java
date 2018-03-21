package com.example.d7701.yshimage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btResult;
    Button btRsult3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] imgName = {"그림1", "그림2", "그림3", "그림4", "그림5",  "그림6", "그림7", "그림8", "그림9"};
        final int[] voteCount = new int[imgName.length];
        for (int i=0; i<imgName.length; i++){
            voteCount[i] = 0;
        }
        ImageView image[] = new ImageView[imgName.length];
        Integer[] imgid = {R.id.pic1, R.id.pic2, R.id.pic3, R.id.pic4, R.id.pic5, R.id.pic6, R.id.pic7, R.id.pic8, R.id.pic9};

        for(int i=0; i<imgName.length; i++){
            final int index;
            index = i;
            image[index] = findViewById(imgid[index]);
            image[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public  void onClick(View view) {
                    voteCount[index]++;
                    Toast.makeText(MainActivity.this, imgName[index] + "가" + voteCount[index] +"좋다",Toast.LENGTH_SHORT).show();
                }
            });
        }

        btResult = findViewById(R.id.btResult);
        btRsult3 = findViewById(R.id.btResult3);
        btResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                i.putExtra("voteCount", voteCount);
                i.putExtra("imgName ", imgName);
                startActivity(i);
            }
        });

        btRsult3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Main3Activity.class);
                startActivity(i);
            }
        });
    }
}
