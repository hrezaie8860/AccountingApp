package com.teta_tm.bizban.accountingapp;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.teta_tm.bizban.accountingapp.Utils.DbHelper;

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
    @BindView(R.id.total_balance)
    EditText total_balance;
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
    @BindView(R.id.view)
    Button view;
    @BindView(R.id.add)
    Button add;
    DbHelper mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mydb= new DbHelper(this);
        addData();
        viewData();
    }

    public void addData(){
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isInserted = mydb.insertData(customerName.getText().toString(),
                        customerCode.getText().toString(),
                        invoiceType.getText().toString(),
                        description.getText().toString(),
                        totalAmount.getText().toString(),
                        addition.getText().toString(),
                        deduction.getText().toString(),
                        invoiceDate.getText().toString(),
                        invoiceItemId.getText().toString(),
                        discount.getText().toString(),
                        total_balance.getText().toString());
                if (isInserted)
                    Toast.makeText(MainActivity.this, "data inserted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "data not inserted", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void viewData(){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor res = mydb.getAllData();
                if (res.getCount()==0) {
                    showMessage("Error", "Nothing found");
                return;
                }
                StringBuffer buffer= new StringBuffer();
                while (res.moveToNext()){
                    buffer.append("id :" + res.getString(0) +"\n" );
                    buffer.append("customerName: " + res.getString(1) +"\n");
                    buffer.append("customer ID :" + res.getString(2) +"\n");
                    buffer.append("invoice type :" + res.getString(3) +"\n");
                    buffer.append("description :" + res.getString(4) +"\n");
                    buffer.append("total amount :" + res.getString(5) +"\n");
                    buffer.append("addition :" + res.getString(6) +"\n");
                    buffer.append("invoice date :" + res.getString(7) +"\n");
                    buffer.append("invoice item ID :" + res.getString(8) +"\n");
                    buffer.append("discount :" + res.getString(9) +"\n");
                    buffer.append("total balance :" + res.getString(10) +"\n\n");
                }
                showMessage("data", buffer.toString());
            }
        });
    }
    public void showMessage(String title, String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();

    }
}

