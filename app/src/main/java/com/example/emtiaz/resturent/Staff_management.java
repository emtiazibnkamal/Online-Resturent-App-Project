package com.example.emtiaz.resturent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Staff_management extends AppCompatActivity implements View.OnClickListener {
    Button sing_in,Registration;
    EditText user_name, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_management);

        sing_in= (Button) findViewById(R.id.btn_singin);
        Registration= (Button) findViewById(R.id.btn_reg);
        user_name=(EditText) findViewById(R.id.user_name);
        password=(EditText) findViewById(R.id.password);
        sing_in.setOnClickListener(this);
        Registration.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
       switch (v.getId()){
           case R.id.btn_singin :
               if(user_name.getText().toString().equals("emtiaz") &&
              password.getText().toString().equals("ibnkamal"));
               Intent intent=new Intent(this,staffDetails.class);
               startActivity(intent);
           case R.id.btn_reg :
               Intent intent2=new Intent(this,staffDetails.class);
               startActivity(intent2);

       }
    }
}
