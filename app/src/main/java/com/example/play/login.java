package com.example.play;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    public EditText username,password;
    Button loginbut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.uname);
        password = findViewById(R.id.pass);
        loginbut = findViewById(R.id.loginbutton);
    }

    public void onLogin(View view){
            Intent it = new Intent(login.this, ValidateService.class);

            it.putExtra("username", username.getText().toString());
            it.putExtra("password", password.getText().toString());

            startService(it);

        }

}