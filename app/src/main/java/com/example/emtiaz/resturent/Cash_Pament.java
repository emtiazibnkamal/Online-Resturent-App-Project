package com.example.emtiaz.resturent;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by emtiaz on 3/22/17.
 */

public class Cash_Pament extends AppCompatActivity implements View.OnClickListener {

    EditText et1,et2;
    Button add,sub,multi ,dvn, mmyAdd,mmyRmv, mmySw;
    TextView tvRslt;

    SharedPreferences sharedpreferences;
    public static final String res = "resultKey";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cash_pament);
        et1= (EditText) findViewById(R.id.et1);
        et2= (EditText) findViewById(R.id.et2);
        add= (Button) findViewById(R.id.bt_add);
        sub= (Button) findViewById(R.id.bt_sub);
        multi= (Button) findViewById(R.id.bt_multi);
        dvn= (Button) findViewById(R.id.bt_divition);
        tvRslt= (TextView) findViewById(R.id.tv_rslt);
        mmyAdd= (Button) findViewById(R.id.bt_addmemory);
        mmyRmv= (Button) findViewById(R.id.bt_removememory);
        mmySw= (Button) findViewById(R.id.bt_showmemory);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        multi.setOnClickListener(this);
        dvn.setOnClickListener(this);
        mmyAdd.setOnClickListener(this);
        mmyRmv.setOnClickListener(this);
        mmySw.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        float num1 ;
        float num2 ;
        float result = 0;



        num1 = Float.parseFloat(et1.getText().toString());
        num2 = Float.parseFloat(et2.getText().toString());


        switch (v.getId()) {

            case R.id.bt_add:

                result = num1 + num2;
                break;
            case R.id.bt_sub:

                result = num1 - num2;
                break;
            case R.id.bt_multi:

                result = num1 * num2;
                break;
            case R.id.bt_divition:
                if(num1>0) {
                    result = num1 / num2;

                }
                else
                    Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_LONG).show();


                break;
            case R.id.bt_addmemory:



                break;
            case R.id.bt_removememory:



                break;
            case R.id.bt_showmemory:






                break;
            default:
                break;
        }
        tvRslt.setText(" "+num1+ "" + num2+"="+result);



    }


}
