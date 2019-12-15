package com.teta_tm.bizban.accountingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class InvoiceActivityClass extends AppCompatActivity {
    ImageView nvcCls,nvcAddCstmr;
    TextView nvcNo,nvcTyp,nvcDate;
    EditText setCstmr;
    Button nvcAddPrdct,nvcDesc,nvcOk,nvcDscnt,nvcAddition,nvcDdct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoice_class);
        inIt();
    }


    public void inIt(){
        nvcCls= findViewById(R.id.img_invc_cls);
        nvcAddCstmr= findViewById(R.id.img_add_cstmr);
        nvcNo=findViewById(R.id.tv_invc_no);
        nvcTyp=findViewById(R.id.tv_invc_typ);
        nvcDate= findViewById(R.id.tv_invc_date);
        setCstmr= findViewById(R.id.ed_set_cstmr);
        nvcAddPrdct= findViewById(R.id.btn_add_prdct);
        nvcDesc= findViewById(R.id.btn_nvc_dsc);
        nvcOk= findViewById(R.id.btn_nvc_ok);
        nvcDscnt= findViewById(R.id.btn_nvc_dcnt);
        nvcAddition= findViewById(R.id.btn_nvc_addition);
        nvcDdct= findViewById(R.id.btn_nvc_ddct);

    }

    public void closeNvc(){

    }

    public void setDate(){

    }

    public void setCstmr(){


    }

}
