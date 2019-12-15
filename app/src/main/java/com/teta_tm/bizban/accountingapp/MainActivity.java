package com.teta_tm.bizban.accountingapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.teta_tm.bizban.accountingapp.Utils.DbHelper;


public class MainActivity extends AppCompatActivity {

    private Button income,received,sell,cost,pay,buy,
            installment,check,bnk_acnt,customer,edit,wrhus_prdct,report;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inIt();
        sellInvoice();

    }


    public void inIt(){

        income=findViewById(R.id.btn_income);
        received=findViewById(R.id.btn_receive);
        sell=findViewById(R.id.btn_sell);
        cost=findViewById(R.id.btn_cost);
        pay=findViewById(R.id.btn_pay);
        buy=findViewById(R.id.btn_buy);
        installment=findViewById(R.id.btn_installment);
        check=findViewById(R.id.btn_checks);
        bnk_acnt=findViewById(R.id.btn_bnk_acnt);
        customer=findViewById(R.id.btn_customer);
        edit=findViewById(R.id.btn_edit);
        wrhus_prdct=findViewById(R.id.btn_wrhus_prdct);
        report=findViewById(R.id.btn_report);

    }



    public void sellInvoice(){

        sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),InvoiceActivityClass.class);
                startActivity(intent);
            }
        });

    }
    public void invoiceDialog(){



    }


}

