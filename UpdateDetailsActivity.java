package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class UpdateDetailsActivity extends AppCompatActivity {

    private EditText fullNameEditText, phoneNumberEditText, sexEditText, dobEditText, emailEditText, addressEditText, countryEditText, stateEditText, cityEditText, pincodeEditText, aadhaarIdEditText;
    private Button saveDetailsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_details);

        fullNameEditText = findViewById(R.id.fullNameEditText);
        phoneNumberEditText = findViewById(R.id.phoneNumberEditText);
        sexEditText = findViewById(R.id.sexEditText);
        dobEditText = findViewById(R.id.dobEditText);
        emailEditText = findViewById(R.id.emailEditText);
        addressEditText = findViewById(R.id.addressEditText);
        countryEditText = findViewById(R.id.countryEditText);
        stateEditText = findViewById(R.id.stateEditText);
        cityEditText = findViewById(R.id.cityEditText);
        pincodeEditText = findViewById(R.id.pincodeEditText);
        aadhaarIdEditText = findViewById(R.id.aadhaarIdEditText);
        saveDetailsButton = findViewById(R.id.saveDetailsButton);

        saveDetailsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle saving details
            }
        });
    }
}
