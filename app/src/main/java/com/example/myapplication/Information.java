package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        TextView firstnameTxtView = (TextView) findViewById(R.id.i_firstnameTextView);
        TextView lastnameTxtView = (TextView) findViewById(R.id.i_lastnameTextView);
        TextView birthdateTxtView = (TextView) findViewById(R.id.i_bdateTextView);
         TextView emailTxtView = (TextView) findViewById(R.id.i_mailTextView);

        //getting the global variable that the user input and presenting into text view
        firstnameTxtView.setText(GlobalVariable.first_name);
        lastnameTxtView.setText(GlobalVariable.last_name);
        birthdateTxtView.setText(GlobalVariable.birthdate);
        emailTxtView.setText(GlobalVariable.email);

        //Save button and open in login page
        Button saveButton = (Button) findViewById(R.id.saveBtn);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                openLoginActivity();


            }
        });
        //back button
        Button backButton = (Button) findViewById(R.id.backBtn);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backToRegistration();
            }
        });
    }
    public void openLoginActivity(){
        Intent goToLogin = new Intent(Information.this,login.class);
        startActivity(goToLogin);
    }
    public void backToRegistration(){
        Intent backToReg = new Intent(Information.this,login.class);
        startActivity(backToReg);
    }
}