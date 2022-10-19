package com.example.hostelers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button bt = findViewById(R.id.L_register);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(register.this, "Registation Successfull", Toast.LENGTH_SHORT).show();
            }
        });

        Button L_register = findViewById(R.id.L_register);
        L_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(register.this , login.class);
                startActivity(i);

            }
        });

    }

}