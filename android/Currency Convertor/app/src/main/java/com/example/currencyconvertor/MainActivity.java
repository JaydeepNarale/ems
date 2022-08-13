package com.example.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convertCurrency(View view){
        Log.i("Info", "Button pressed");

        EditText editText=(EditText) findViewById(R.id.editText);
        String amountInRupees=editText.getText().toString();
        double amountInRupeesDouble= Double.parseDouble(amountInRupees);
        double amountInDollarDouble=amountInRupeesDouble * 0.013;
        String amountInDollarString=Double.toString(amountInDollarDouble);
        Log.i("Amount in dollars", amountInDollarString);
        Toast.makeText(this, "Amount in dollars is:"+amountInDollarString, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}