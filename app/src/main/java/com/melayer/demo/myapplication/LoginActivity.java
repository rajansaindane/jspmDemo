package com.melayer.demo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Bundle bundle;
    EditText username,password;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       // Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        username=findViewById(R.id.edtUsername);
        password=findViewById(R.id.edtLoginPassword);
        btnLogin=findViewById(R.id.btnLoginLogin);
        bundle=getIntent().getExtras();
        if(bundle!=null)
        {
            username.setText(bundle.getString("username"));
            password.setText(bundle.getString("password"));
        }
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,DashboardActivity.class));
            }
        });


    }

   /* @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(LoginActivity.this,"onStart",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_LONG).show();
    }*/
}
