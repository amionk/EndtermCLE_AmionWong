package com.example.endtermcle_amionwong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Necklace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_necklace);

        ImageView agathaN = findViewById(R.id.necklaceView1);
        agathaN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Necklace.this, AgathaNecklace.class);
                startActivity(i);
            }
        });

        ImageView mauriceN = findViewById(R.id.necklaceView2);
        mauriceN.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(Necklace.this, MauriceNecklace.class);
                startActivity(i);
            }
        });
    }
}