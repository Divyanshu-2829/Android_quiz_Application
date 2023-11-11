package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name, phone;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText firstname = (EditText) findViewById(R.id.firstname_TextField);
        EditText lastname = (EditText) findViewById(R.id.lastname_TextField);
        EditText birthdate = (EditText) findViewById(R.id.date_TextField);
        EditText email = (EditText) findViewById(R.id.email_TextField);
        EditText password = (EditText) findViewById(R.id.password_TextField);

        //for view button

        Button view = findViewById(R.id.view_btn);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalVariable.first_name = firstname.getText().toString();
                GlobalVariable.last_name = lastname.getText().toString();
                GlobalVariable.birthdate = birthdate.getText().toString();
                GlobalVariable.email = email.getText().toString();
                GlobalVariable.password = password.getText().toString();

                //open new activity
                Intent goToInformation = new Intent(MainActivity.this , Information.class);
                startActivity(goToInformation);
            }
        });


    }
}
