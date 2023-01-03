package com.example.endtermcle_amionwong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button chip = findViewById(R.id.chip);
        chip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Necklace.class);
                startActivity(i);
            }
        });
        Button chipThree = findViewById(R.id.chipThree);
        chipThree.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this, Bracelet.class);
                startActivity(i);
            }
        });
        Button chipFour = findViewById(R.id.chipFour);
        chipFour.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this, Earrings.class);
                startActivity(i);
            }
        });
        Button chipFive = findViewById(R.id.chipFive);
        chipFive.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this, Ring.class);
                startActivity(i);
            }
        });
    }
}

