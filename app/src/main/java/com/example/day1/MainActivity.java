package com.example.day1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText cadEt;
    private EditText usdEt;
    //private Button calculateBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cadEt = findViewById(R.id.cadValue);
        usdEt = findViewById(R.id.usdValue);
        //calculateBtn = findViewById(R.id.calculate);
        
    }

    public void calculate(View view){
        String cadVal = cadEt.getText().toString();
        String usdVal = usdEt.getText().toString();
        //double usdVal = Double.parseDouble(String.valueOf(usdEt.getText()));
        if(!cadVal.isEmpty() && usdVal.isEmpty()){
            double finalValue = 0.75 * Double.parseDouble(cadVal);
            usdEt.setText(String.valueOf(finalValue));
        }
        if(cadVal.isEmpty() && !usdVal.isEmpty()){
            double finalValue = 1.34 * Double.parseDouble(usdVal);
            cadEt.setText(String.valueOf(finalValue));
        }

        if(cadVal.isEmpty() && usdVal.isEmpty()){
            Toast.makeText(this, "Please provide any of the value", Toast.LENGTH_SHORT).show();
        }
    }
}