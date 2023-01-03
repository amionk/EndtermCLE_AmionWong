package com.example.endtermcle_amionwong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Bracelet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bracelet);

        ImageView laurenB = findViewById(R.id.braceletView1);
        laurenB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Bracelet.this, LaurenBracelet.class);
                startActivity(i);
            }
        });

        ImageView jaquiB = findViewById(R.id.braceletView2);
        jaquiB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(Bracelet.this, JaquiBracelet.class);
                startActivity(i);
            }
        });
    }
}

