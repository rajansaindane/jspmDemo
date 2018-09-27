package com.melayer.demo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class RegistrationActivity extends AppCompatActivity {

    EditText name,contact,username,password;
    RadioButton radioHod,radioTeacher,radioMale,radioFemale;
    Button btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        name=findViewById(R.id.edtRegisterFullName);
        contact=findViewById(R.id.edtRegisterContact);
        username=findViewById(R.id.edtRegisterUserName);
        password=findViewById(R.id.edtRegisterPassword);
        radioHod=findViewById(R.id.radioRegisterHod);
        radioMale=findViewById(R.id.radioRegisterMale);
        radioFemale=findViewById(R.id.radioRegisterFemale);
        radioTeacher=findViewById(R.id.radioRegisterTeacher);
        btnRegister=findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle=new Bundle();
                bundle.putString("username",username.getText().toString());
                bundle.putString("password",password.getText().toString());
                Intent intent=new Intent(RegistrationActivity.this,LoginActivity.class);
                intent.putExtras(bundle);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK
                | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

    }
}
