package com.example.endtermcle_amionwong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.text.DecimalFormat;
import android.view.View.OnClickListener;

public class ValeriaRing extends AppCompatActivity implements OnClickListener {
    EditText inputMetal, inputGems;
    String  resultMessage, txtGems, txtMetal;
    int Custom, alldiamonds_price, diamondgems_price;
    double labor, gold_price, silver_price, overhead, wholesale, retail, custom1_materials, custom2_materials, custom3_materials, custom4_materials;;
    Button btnCompute, btnRef;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_valeria_ring);
            btnCompute = (Button) findViewById(R.id.btnCalculate);
            btnRef = findViewById(R.id.btnReferences);
            btnCompute.setOnClickListener(this);
            btnRef.setOnClickListener(this);

            //for price list//
            labor = 1250; // labor for Valeria Diamond Ring
            overhead = 0.10; //10%
            gold_price = 3297.91; //24K per gram
            silver_price = 43.55; // Silver per gram
            alldiamonds_price = 4300;
            diamondgems_price = 3000;

            custom1_materials = gold_price + alldiamonds_price;
            custom2_materials = gold_price + diamondgems_price;
            custom3_materials = silver_price + alldiamonds_price;
            custom4_materials = silver_price + diamondgems_price;
        }

        private static final DecimalFormat df = new DecimalFormat("0.00");
        public void onClick(View v) {

            int id = v.getId();
            switch (id) {
                case R.id.btnReferences:
                    Toast.makeText(this, "Viewing references....", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(ValeriaRing.this, Materials.class);
                    startActivity(i);
                    break;

                case R.id.btnCalculate:
                    Toast.makeText(this, "Computing prices....", Toast.LENGTH_SHORT).show();
                    inputMetal = (EditText) findViewById(R.id.inputMetal_r1);
                    inputGems = (EditText) findViewById(R.id.inputGems_r1);

                    txtGems = inputGems.getText().toString();
                    txtMetal = inputMetal.getText().toString();

                    int userMetal = Integer.parseInt(txtMetal);
                    int userGems = Integer.parseInt(txtGems);


                    if (userMetal == 1 && userGems == 1) {
                        Custom = 1;

                    } else if (userMetal == 1 && userGems == 2) {
                        Custom = 2;

                    } else if (userMetal == 2 && userGems == 1) {
                        Custom = 3;

                    } else if (userMetal == 2 && userGems == 2) {
                        Custom = 4;

                    }

                    switch (Custom) {
                        case 1:
                            wholesale = (labor + custom1_materials + overhead) * 2;
                            retail = wholesale * 2;
                            resultMessage = "The Wholesale price of this customization is: PHP " + df.format(wholesale) + "\n \n \n" + "The Retail price of this customization is: PHP "  + df.format(retail);
                            Bundle args1 = new Bundle();
                            args1.putString("result", resultMessage);
                            Intent pricelist1 = new Intent(ValeriaRing.this, PriceList.class);
                            pricelist1.putExtras(args1);
                            startActivity(pricelist1);
                            break;

                        case 2:
                            wholesale = (labor + custom2_materials + overhead) * 2;
                            retail = wholesale * 2;
                            resultMessage = "The Wholesale price of this customization is: PHP " + df.format(wholesale) + "\n \n \n" + "The Retail price of this customization is: PHP "  + df.format(retail);
                            Bundle args2 = new Bundle();
                            args2.putString("result", resultMessage);
                            Intent pricelist2 = new Intent(ValeriaRing.this, PriceList.class);
                            pricelist2.putExtras(args2);
                            startActivity(pricelist2);
                            break;

                        case 3:
                            wholesale = (labor + custom3_materials + overhead) * 2;
                            retail = wholesale * 2;
                            resultMessage = "The Wholesale price of this customization is: PHP " + df.format(wholesale) + "\n \n \n" + "The Retail price of this customization is: PHP "  + df.format(retail);
                            Bundle args3 = new Bundle();
                            args3.putString("result", resultMessage);
                            Intent pricelist3 = new Intent(ValeriaRing.this, PriceList.class);
                            pricelist3.putExtras(args3);
                            startActivity(pricelist3);
                            break;

                        case 4:
                            wholesale = (labor + custom4_materials + overhead) * 2;
                            retail = wholesale * 2;
                            resultMessage = "The Wholesale price of this customization is: PHP " + df.format(wholesale) + "\n \n \n" + "The Retail price of this customization is: PHP "  + df.format(retail);
                            Bundle args4 = new Bundle();
                            args4.putString("result", resultMessage);
                            Intent pricelist4 = new Intent(ValeriaRing.this, PriceList.class);
                            pricelist4.putExtras(args4);
                            startActivity(pricelist4);
                            break;
                    }
            }
        }
    }