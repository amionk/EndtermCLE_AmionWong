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

public class AgathaNecklace extends AppCompatActivity implements OnClickListener {
    EditText inputMetal, inputGems;
    String resultMessage, txtGems, txtMetal, dialogMessage, custom1, custom2, custom3, custom4, customization;
    int Custom, labor, alldiamonds_price, diamondgems_price;
    double gold_price, silver_price, overhead, wholesale, retail, custom1_materials, custom2_materials, custom3_materials, custom4_materials;
    ;
    Button btnCompute, btnRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agatha_necklace);
        btnCompute = (Button) findViewById(R.id.btnCalculate);
        btnRef = findViewById(R.id.btnReferences);
        btnCompute.setOnClickListener(this);
        btnRef.setOnClickListener(this);

        //for price list//
        labor = 1400; // Labor for Agatha Necklace
        overhead = 0.10; // 10%
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
                Intent i = new Intent(AgathaNecklace.this, Materials.class);
                startActivity(i);
                break;

            case R.id.btnCalculate:
                Toast.makeText(this, "Computing prices....", Toast.LENGTH_SHORT).show();
                inputMetal = (EditText) findViewById(R.id.inputMetal_n1);
                inputGems = (EditText) findViewById(R.id.inputGems_n1);

                txtGems = inputGems.getText().toString();
                txtMetal = inputMetal.getText().toString();

                int userMetal = Integer.parseInt(txtMetal);
                int userGems = Integer.parseInt(txtGems);


                if (userMetal == 1 && userGems == 1) {
                    Custom = 1;
                    custom1 = "24K Gold and All diamonds.";
                } else if (userMetal == 1 && userGems == 2) {
                    Custom = 2;
                    custom2 = "24K Gold and Diamonds with natural gemstones.";
                } else if (userMetal == 2 && userGems == 1) {
                    Custom = 3;
                    custom3 = "Silver and All diamonds.";
                } else if (userMetal == 2 && userGems == 2) {
                    Custom = 4;
                    custom4 = "Silver and Diamonds with natural gemstones";
                }

                switch (Custom) {
                    case 1:
                        wholesale = (labor + custom1_materials + overhead) * 2;
                        retail = wholesale * 2;
                        customization = custom1;
                        resultMessage = "The Wholesale price of this customization is: PHP " + df.format(wholesale) + "\n \n \n" + "The Retail price of this customization is: PHP" + df.format(retail);
                        Bundle args1 = new Bundle();
                        args1.putString("result", resultMessage);
                        Intent pricelist1 = new Intent(AgathaNecklace.this, PriceList.class);
                        pricelist1.putExtras(args1);
                        startActivity(pricelist1);
                        break;

                    case 2:
                        wholesale = (labor + custom2_materials + overhead) * 2;
                        retail = wholesale * 2;
                        customization = custom2;
                        resultMessage = "The Wholesale price of this customization is: PHP " + df.format(wholesale) + "\n \n \n" + "The Retail price of this customization is: PHP" + df.format(retail);
                        Bundle args2 = new Bundle();
                        args2.putString("result", resultMessage);
                        Intent pricelist2 = new Intent(AgathaNecklace.this, PriceList.class);
                        pricelist2.putExtras(args2);
                        startActivity(pricelist2);
                        break;

                    case 3:
                        wholesale = (labor + custom3_materials + overhead) * 2;
                        retail = wholesale * 2;
                        customization = custom3;
                        resultMessage = "The Wholesale price of this customization is: PHP " + df.format(wholesale) + "\n \n \n" + "The Retail price of this customization is: PHP" + df.format(retail);
                        Bundle args3 = new Bundle();
                        args3.putString("result", resultMessage);
                        Intent pricelist3 = new Intent(AgathaNecklace.this, PriceList.class);
                        pricelist3.putExtras(args3);
                        startActivity(pricelist3);
                        break;

                    case 4:
                        wholesale = (labor + custom4_materials + overhead) * 2;
                        retail = wholesale * 2;
                        customization = custom4;
                        resultMessage = "The Wholesale price of this customization is: PHP " + df.format(wholesale) + "\n \n \n" + "The Retail price of this customization is: PHP" + df.format(retail);
                        Bundle args4 = new Bundle();
                        args4.putString("result", resultMessage);
                        Intent pricelist4 = new Intent(AgathaNecklace.this, PriceList.class);
                        pricelist4.putExtras(args4);
                        startActivity(pricelist4);
                        break;
                }
                    DialogFragmentCustom dialogFragmentImp = new DialogFragmentCustom();

                    Bundle args5 = new Bundle();
                    args5.putString("result", dialogMessage);
                    dialogMessage = "Your customization is consists of the materials: " + customization;

                    // Create Bundle instance, this will allow transfer of data from Activity to DialogFragment;


                    // Create a dialog instance
                    DialogFragmentCustom dialogFragmentImp1 = new DialogFragmentCustom();
                    // Pass on dialog argument(args), the result
                    dialogFragmentImp1.setArguments(args5);
                    // Display the Dialog
                    dialogFragmentImp1.show(getSupportFragmentManager(), "Display Result");
                    // Reset EditTexts
                }
        }
    }

