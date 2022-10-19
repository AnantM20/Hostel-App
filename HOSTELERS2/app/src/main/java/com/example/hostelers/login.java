package com.example.hostelers;

import androidx.appcompat.app.AppCompatActivity;

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
        
        Button bt = findViewById(R.id.L_login);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(login.this, "Login Successfull", Toast.LENGTH_SHORT).show();
            }
        });

        Button bt2 = findViewById(R.id.ca_l);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(login.this,register.class);
                startActivity(i);

                Toast.makeText(login.this, "create account", Toast.LENGTH_SHORT).show();
            }
        });
    }

}

