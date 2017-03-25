package com.example.emtiaz.resturent;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.emtiaz.resturent.Food.Food_List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button stf_mnage, food_list,  cash_pament;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        stf_mnage= (Button) findViewById(R.id.stf_mnage);
        food_list= (Button) findViewById(R.id.food);
        cash_pament= (Button) findViewById(R.id.pament);
        tv=(TextView)findViewById(R.id.tv_about_us);
        stf_mnage.setOnClickListener(this);
        food_list.setOnClickListener(this);
        cash_pament.setOnClickListener(this);
        tv.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.stf_mnage:
                Intent intent = new Intent(this, Staff_management.class);
                startActivity(intent);
                break;
            case R.id.food:
                Intent intent2 = new Intent(this, Food_List.class);
                startActivity(intent2);
                break;

            case R.id.pament:
                Intent intent4 = new Intent(this, Cash_Pament.class);
                startActivity(intent4);
                break;
            case R.id.tv_about_us:
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
                alertDialogBuilder.setMessage("We are SpeedCoder.\n A android development group in LICT. " +
                        "\n We all are students of Rajshahi University (BANGLADESH).");
                alertDialogBuilder.setPositiveButton("yes",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                Toast.makeText(MainActivity.this,"You clicked yes button",Toast.LENGTH_LONG).show();
                            }
                        });

                alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"You clicked no button",Toast.LENGTH_LONG).show();

                    }
                });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

        }

    }
}
