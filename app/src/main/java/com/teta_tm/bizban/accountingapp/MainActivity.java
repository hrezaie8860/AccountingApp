package com.teta_tm.bizban.accountingapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.total_amount)
    EditText totalAmount;
    @BindView(R.id.deduction)
    EditText deduction;
    @BindView(R.id.discount)
    EditText discount;
    @BindView(R.id.invoice_date)
    EditText invoiceDate;
    @BindView(R.id.addition)
    EditText addition;
    @BindView(R.id.invoice_item_id)
    EditText invoiceItemId;
    @BindView(R.id.description)
    EditText description;
    @BindView(R.id.invoice_type)
    EditText invoiceType;
    @BindView(R.id.invoice_id)
    EditText invoiceId;
    @BindView(R.id.customer_code)
    EditText customerCode;
    @BindView(R.id.customer_name)
    EditText customerName;
    @BindView(R.id.load_data)
    Button loadData;
    @BindView(R.id.delete)
    Button delete;
    @BindView(R.id.update)
    Button update;
    @BindView(R.id.find)
    Button find;
    @BindView(R.id.add)
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }
}

