package com.example.endtermcle_amionwong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class Materials extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materials);


        readDataByColumn();
    }


    ArrayList<String> listDataArray;


    private void readDataByColumn() {

        InputStream is = getResources().openRawResource(R.raw.materialsdata);


        BufferedReader br = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));


        String line = "";


        try {
            listDataArray = new ArrayList<>();

            while ((line = br.readLine()) != null) {

                String[] cols = line.split(",");


                System.out.println("Column 0 = '" + cols[0] + "', Column 1 = '" + cols[1] + "', Column 2: '" + cols[2] + "'");
                listDataArray.add(cols[0]+ " " + cols[1]+ " " + cols[2]);
            }
        } catch (IOException e) {

            e.printStackTrace();
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listDataArray);
        ((ListView) findViewById(R.id.list)).setAdapter(arrayAdapter);

    }}