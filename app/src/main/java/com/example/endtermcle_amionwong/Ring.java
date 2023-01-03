package com.example.endtermcle_amionwong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Ring extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ring);

        ImageView valeriaR= findViewById(R.id.ringView1);
        valeriaR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ring.this, ValeriaRing.class);
                startActivity(i);
            }
        });

        ImageView candaceR = findViewById(R.id.ringView2);
        candaceR.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(Ring.this, CandanceRing.class);
                startActivity(i);
            }
        });
    }
}