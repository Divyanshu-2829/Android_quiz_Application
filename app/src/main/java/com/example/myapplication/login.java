package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText emailTextField  = (EditText) findViewById(R.id.l_emailTextField);
        EditText passwordTextField  = (EditText) findViewById(R.id.l_passwordTextView);

        //login button
        Button loginButton= (Button) findViewById(R.id.l_lgnBtn);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (emailTextField.getText().toString().equals(GlobalVariable.email) &&
                        passwordTextField.getText().toString().equals(GlobalVariable.password)) {
                    Toast.makeText(login.this, "Login success", Toast.LENGTH_SHORT).show();
                    openHomepageActivity();

                } else{}
            }
        });
    }
    public void openHomepageActivity(){
        Intent goToHomepage = new Intent(login.this,Homepage.class);
        startActivity(goToHomepage);

    }
}
