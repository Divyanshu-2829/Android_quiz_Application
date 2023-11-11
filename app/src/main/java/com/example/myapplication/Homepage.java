package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        TextView name = (TextView) findViewById(R.id.fullnameTextView);
        name.setText(GlobalVariable.last_name + "," + " "+GlobalVariable.first_name);

        //back to registration button

        Button back2Reg = (Button) findViewById(R.id.backToRegBtn);
        back2Reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backToRegistration();

            }
        });
    }
    public void  backToRegistration(){
        Intent backToRegistration = new Intent(Homepage.this,main.class);
        startActivity(backToRegistration);
    }
}