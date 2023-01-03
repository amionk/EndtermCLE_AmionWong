package com.example.endtermcle_amionwong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Earrings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earrings);

        ImageView teardropE = findViewById(R.id.earringsView1);
        teardropE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Earrings.this, TeardropEarrings.class);
                startActivity(i);
            }
        });

        ImageView SereinaE = findViewById(R.id.earringsView2);
        SereinaE.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(Earrings.this, SereinaEarrings.class);
                startActivity(i);
            }
        });
    }
}