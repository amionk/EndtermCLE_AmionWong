package com.example.endtermcle_amionwong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PriceList extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
                Bundle extras = getIntent().getExtras();
                String result = extras.getString("result");
                setContentView(R.layout.activity_price_list);

                Button btnReturn = (Button) findViewById(R.id.btnReturn);
                TextView tvResult = (TextView) findViewById(R.id.txt_result);
                tvResult.setText(result);
                btnReturn.setOnClickListener(this);
            }

            @Override
            public void onClick(View v) {
                Intent price = new Intent(PriceList.this, MainActivity.class);
                startActivity(price);



            }
        }

