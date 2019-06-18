package com.softhans.mycurrencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Spinner spinner1;
    private Spinner spinner2;

    private TextView currency1;
    private TextView currency2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        spinner1 = (Spinner) findViewById(R.id.spinner1Id);
        spinner2 = (Spinner) findViewById(R.id.spinner2Id);

        currency1 = (TextView) findViewById(R.id.currency1ID);
        currency2 = (TextView) findViewById(R.id.currency2ID);

        // TODO: Connect the list of countries to the different menus.


// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.currency_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter);

        // TODO: Connect the exchange rate to the internet, so that it remains updated

        // TODO: connect both textviews to respond simultaneously, irrespective to the one the user uses.
    }
}
