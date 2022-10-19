package com.example.hostelers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class student_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        Button bt = findViewById(R.id.S_login);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(student_login.this,index.class);
                startActivity(i);
                Toast.makeText(student_login.this, "Login Successfull", Toast.LENGTH_SHORT).show();
            }
        });
        Button bt1 = findViewById(R.id.ca_s);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(student_login.this,student_register.class);
                startActivity(i);

                Toast.makeText(student_login.this, "create account", Toast.LENGTH_SHORT).show();
            }
        });
    }
    }
