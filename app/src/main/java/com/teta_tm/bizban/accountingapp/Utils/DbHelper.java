package com.teta_tm.bizban.accountingapp.Utils;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper{

    private static final String DB_NAME = "accounting.db";

    private static final String CUSTOMER_TABLE = "customer";
    private static final String CUSTOMER_ID = "ID";
    private static final String CUSTOMER_PERSON_ID = "PERSON_ID";
    private static final String CUSTOMER_DEBT = "DEBT";
    private static final String CUSTOMER_CREDIT = "CREDIT";
    private static final String CUSTOMER_PHONE = "PHONE";
    private static final String CUSTOMER_ADDRESS = "ADDRESS";
    private static final String CUSTOMER_CITY = "CITY";

    private static final String PERSON_TABLE = "person";
    private static final String PERSON_ID = "ID";
    private static final String PERSON_NAME = "NAME";
    private static final String PERSON_LNAME = "LAST_NAME";

    private static final String USER_TABLE = "user";
    private static final String USER_ID = "ID";
    private static final String USER_PERSON_ID = "PERSON_ID";

    private static final String BNK_ACCOUNT_TABLE = "bnk_account";
    private static final String BNK_ACCOUNT_ID = "ID";
    private static final String BNK_ACCOUNT_BNK_NAME = "BANK_NAME";
    private static final String BNK_ACCOUNT_NUM = "ACCOUNT_NUM";
    private static final String BNK_ACCOUNT_CARD_NUM = "CARD_NUM";
    private static final String BNK_ACCOUNT_BNK_BRANCH = "BANK_BRANCH";
    private static final String BNK_ACCOUNT_FIRST_CASH = "THE_FIRST_CASH";

    private static final String CASH_BOX_TABLE = "cash_box";
    private static final String CASH_BOX_ID = "ID";
    private static final String CASH_BOX_FIRST_CASH = "THE_FIRST_CASH";
    private static final String CASH_BOX_NAME = "NAME";

    private static final String TRANSACTION_TABLE = "transaction";
    private static final String TRANSACTION_ID = "ID";
    private static final String TRANSACTION_DATE = "DATE";
    private static final String TRANSACTION_BNK_ACNT_ID = "BNK_ACCOUNT_ID";
    private static final String TRANSACTION_BOX_ID = "CASH_BOX_ID";
    private static final String TRANSACTION_DESCRIPTION = "DESCRIPTION";
    private static final String TRANSACTION_CUSTOMER_ID = "CUSTOMER_ID";
    private static final String TRANSACTION_CUSTOMER_NAME = "CUSTOMER_NAME";
    private static final String TRANSACTION_TRANSACTION_TYPE_ID = "TRANSACTION_TYPE_ID";
    private static final String TRANSACTION_TOTAL_AMOUNT = "TOTAL_AMOUNT";

    private static final String TRANSACTION_TYPE_TABLE = "transaction_type";
    private static final String TRANSACTION_tp_ID = "ID";
    private static final String TRANSACTION_tp_PAYMENT = "PAYMENT";
    private static final String TRANSACTION_tp_RESEIVE = "RECEIVE";
    private static final String TRANSACTION_tp_TRANSFERS = "TRANSFERS";
    private static final String TRANSACTION_tp_INCOME = "INCOME";
    private static final String TRANSACTION_tp_COST = "COST";

    private static final String INSTALLMENT_TABLE= "installment";
    private static final String INSTALLMENT_ID = "ID";
    private static final String INSTALLMENT_CUSTOMER_NAME = "CUSTOMER_NAME";
    private static final String INSTALLMENT_CUSTOMER_ID = "CUSTOMER_ID";
    private static final String INSTALLMENT_START_DATE = "DATE_OF_START";
    private static final String INSTALLMENT_EACH_PAY_AMAOUNT = "EACH_PAYMENT_AMOUNT";
    private static final String INSTALLMENT_TOTAL_AMOUNT = "TOTAL_AMOUNT";
    private static final String INSTALLMENT_PAYMENT_GAP = "GAP_OF_PAYMENT";

    private static final String CHECK_TABLE= "check";
    private static final String CHECK_ID = "CHECK_ID";
    private static final String CHECK_BNK_NAME = "BNK_NAME";
    private static final String CHECK_AMOUNT = "CHECK_AMOUNT";
    private static final String CHECK_NUM = "CHECK_NUM";
    private static final String CHECK_STATE = "CHECK_STATS";
    private static final String CHECK_ANNALS = "CHECK_ANNALS";
    private static final String CHECK_CSTMR_NAM_TO_PAY = "CUSTOMER_NAME_TO_PAY";
    private static final String CHECK_CSTMR_ID_TO_PAY = "CUSTOMER_ID_TO_PAY";
    private static final String CHECK_PAYMENT_DATE = "PAYMENT_DATE";

    private static final String COMPANY_CHECK_TABLE= "company_check";
    private static final String COMPANY_CHECK_ID = "COMPANY_CHECK_ID";
    private static final String COMPANY_CHECK_CSTMR_ID = "CUSTOMER_ID";
    private static final String COMPANY_CHECK_CHECK_ID = "CHECK_ID";

    private static final String CUSTOMER_CHECK_TABLE= "customer_check";
    private static final String CUSTOMER_CHECK_ID = "CUSTOMER_CHECK_ID";
    private static final String CUSTOMER_CHECK_CSTMR_ID_RECEIVE_FROM = "CUSTOMER_ID_RECEIVE_FROM";
    private static final String CUSTOMER_CHECK_CSTMR_NAME_RECEIVE_FROM = "CUSTOMER_NAME_RECEIVE_FROM";
    private static final String CUSTOMER_CHECK_RECEIVE_DATE = "RECEIVE_DATE";

    private static final String WAREHOUNSE_TABLE= "warehouse";
    private static final String WAREHOUSE_ID = "WAREHOUSE_ID";
    private static final String WAREHOUSE_NAME = "WAREHOUSE_NAME";
    private static final String WAREHOUSE_RESPONSIBLE_NAME = "RESPONSIBLE_NAME";

    private static final String GROUPING_TABLE= "grouping";
    private static final String GROUPING_ID = "GROUPING_ID";
    private static final String GROUPING_NAME = "GROUPING_NAME";

    private static final String PRODUCT_TABLE= "product";
    private static final String PRODUCT_ID = "PRODUCT_ID";
    private static final String PRODUCT_NAME = "PRODUCT_NAME";
    private static final String PRODUCT_GROUPING_ID = "GROUPING_ID";
    private static final String PRODUCT_FIRST_STOCK = "FIRST_STOCK";
    private static final String PRODUCT_WAREHOUSE_ID = "WAREHOUSE_ID";
    private static final String PRODUCT_COST = "PRODUCT_COST";
    private static final String PRODUCT_COUNTING_UNIT_ID = "COUNTING_UNIT_ID";

    private static final String COUNTING_UNIT_TABLE= "counting_unit";
    private static final String COUNTING_UNIT_ID = "COUNTING_UNIT_ID";
    private static final String COUNTING_UNIT_NAME = "COUNTING_UNIT_NAME";

    private static final String INVOICE_TABLE= "invoice";
    private static final String INVOICE_ID = "INVOICE_ID";
    private static final String INVOICE_CUSTOMER_NAME = "CUSTOMER_NAME";
    private static final String INVOICE_CUSTOMER_ID = "CUSTOMER_ID";
    private static final String INVOICE_INVOICE_TYPE = "INVOICE_TYPE";
    private static final String INVOICE_DESCRIPTION = "DESCRIPTION";
    private static final String INVOICE_TOTOAL_AMOUNT= "TOTAL_INVOICE_AMOUNT";
    private static final String INVOICE_ADDITION= "ADDITION";
    private static final String INVOICE_DEDUCTION = "DEDUCTION";
    private static final String INVOICE_INVOICE_DATA = "INVOICE_DATE";
    private static final String INVOICE_INVOICE_ITEM_ID = "INVOICE_ITEM_ID";
    private static final String INVOICE_DISCOUNT = "DISCOUNT";
    private static final String INVOICE_TOTAL_BALANCE = "TOTAL_BALANCE";

    private static final String INVOICE_ITEM_TABLE= "invoice_item";
    private static final String INVOICE_ITEM_ID = "INVOICE_ITEM_ID";
    private static final String INVOICE_ITEM_FEE = "ITEM_FEE";
    private static final String INVOICE_ITEM_AMOUNT = "AMOUNT";
    private static final String INVOICE_ITEM_NUMBER = "NUMBER";
    private static final String INVOICE_ITEM_WAREHOUSE_ID = "WAREHOUSE_ID";
    private static final String INVOICE_ITEM_PRODUCT_NAME= "PRODUCT_NAME";
    private static final String INVOICE_ITEM_PRODUCT_ID= "PRODUCT_ID";

    public DbHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version, @Nullable DatabaseErrorHandler errorHandler) {
        super(context, DB_NAME, null, 1, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String create_customer_table = "CREATE TABLE " +
                CUSTOMER_TABLE + " ( " +
                CUSTOMER_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                CUSTOMER_PERSON_ID + " INT," +
                CUSTOMER_CREDIT + " INTIGER , " +
                CUSTOMER_DEBT + " INTIGER , " +
                CUSTOMER_ADDRESS + " INTEGER , " +
                CUSTOMER_PHONE + " VARCHAR , " +
                CUSTOMER_CITY + " VARCHAR(25) ) ";
        db.execSQL(create_customer_table);

        String create_person_table = "CREATE TABLE " +
                PERSON_TABLE + " ( " +
                PERSON_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                PERSON_NAME + " VARCHAR ," +
                PERSON_LNAME + " INTIGER ) ";
        db.execSQL(create_person_table);

        String create_user_table = "CREATE TABLE " +
                USER_TABLE + " ( " +
                USER_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                USER_PERSON_ID + " VARCHAR(25) )";
        db.execSQL(create_user_table);

        String create_bnk_account_table = "CREATE TABLE " +
                BNK_ACCOUNT_TABLE + " ( " +
                BNK_ACCOUNT_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                BNK_ACCOUNT_NUM + " VARCHAR(25)," +
                BNK_ACCOUNT_BNK_NAME + " INTEGER(25)," +
                BNK_ACCOUNT_CARD_NUM + " VARCHAR(25)," +
                BNK_ACCOUNT_BNK_BRANCH + " VARCHAR(25)," +
                BNK_ACCOUNT_FIRST_CASH + " VARCHAR(30) ) ";
        db.execSQL(create_bnk_account_table);

        String create_cash_box_table = "CREATE TABLE " +
                CASH_BOX_TABLE + " ( " +
                CASH_BOX_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                CASH_BOX_FIRST_CASH + " INT," +
                CASH_BOX_NAME + " VARCHAR(25) ) ";
        db.execSQL(create_cash_box_table);

        String create_transaction_table = "CREATE TABLE " +
                TRANSACTION_TABLE + " ( " +
                TRANSACTION_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                TRANSACTION_DATE + " INT," +
                TRANSACTION_BNK_ACNT_ID + " INTIGER , " +
                TRANSACTION_BOX_ID + " INTIGER , " +
                TRANSACTION_DESCRIPTION + " INTEGER , " +
                TRANSACTION_CUSTOMER_ID + " VARCHAR , " +
                TRANSACTION_TOTAL_AMOUNT + " VARCHAR , " +
                TRANSACTION_CUSTOMER_NAME + " VARCHAR(25) ) ";
        db.execSQL(create_transaction_table);

        String create_transaction_tp_table = "CREATE TABLE " +
                TRANSACTION_TYPE_TABLE + " ( " +
                TRANSACTION_tp_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                TRANSACTION_tp_PAYMENT + " INT," +
                TRANSACTION_tp_RESEIVE + " INTIGER , " +
                TRANSACTION_tp_TRANSFERS + " INTIGER , " +
                TRANSACTION_tp_INCOME + " INTEGER , " +
                TRANSACTION_tp_COST + " VARCHAR(25) ) ";
        db.execSQL(create_transaction_tp_table);

        String create_installment_table = "CREATE TABLE " +
                INSTALLMENT_TABLE + " ( " +
                INSTALLMENT_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                INSTALLMENT_CUSTOMER_ID + " INT," +
                INSTALLMENT_CUSTOMER_NAME + " INTIGER , " +
                INSTALLMENT_START_DATE + " INTIGER , " +
                INSTALLMENT_EACH_PAY_AMAOUNT + " INTEGER , " +
                INSTALLMENT_TOTAL_AMOUNT + " VARCHAR , " +
                INSTALLMENT_PAYMENT_GAP + " VARCHAR(25) ) ";
        db.execSQL(create_installment_table);

        String create_check_table = "CREATE TABLE " +
                CHECK_TABLE + " ( " +
                CHECK_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                CHECK_BNK_NAME + " INT," +
                CHECK_AMOUNT + " INTIGER , " +
                CHECK_NUM + " INTIGER , " +
                CHECK_STATE + " INTEGER , " +
                CHECK_ANNALS + " VARCHAR , " +
                CHECK_CSTMR_NAM_TO_PAY + " VARCHAR , " +
                CHECK_CSTMR_ID_TO_PAY + " VARCHAR , " +
                CHECK_PAYMENT_DATE + " VARCHAR(25) ) ";
        db.execSQL(create_check_table);

        String create_company_check_table = "CREATE TABLE " +
                COMPANY_CHECK_TABLE + " ( " +
                COMPANY_CHECK_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                COMPANY_CHECK_CSTMR_ID + " INT," +
                COMPANY_CHECK_CHECK_ID + " VARCHAR(25) ) ";
        db.execSQL(create_company_check_table);

        String create_customer_check_table = "CREATE TABLE " +
                CUSTOMER_CHECK_TABLE + " ( " +
                CUSTOMER_CHECK_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                CUSTOMER_CHECK_CSTMR_ID_RECEIVE_FROM + " INT," +
                CUSTOMER_CHECK_CSTMR_NAME_RECEIVE_FROM + " INTIGER , " +
                CUSTOMER_CHECK_RECEIVE_DATE + " VARCHAR(25) ) ";
        db.execSQL(create_customer_check_table);

        String create_warehouse_table = "CREATE TABLE " +
                WAREHOUNSE_TABLE + " ( " +
                WAREHOUSE_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                WAREHOUSE_NAME + " INT," +
                WAREHOUSE_RESPONSIBLE_NAME + " VARCHAR(25) ) ";
        db.execSQL(create_warehouse_table);

        String create_grouping_table = "CREATE TABLE " +
                GROUPING_TABLE + " ( " +
                GROUPING_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                GROUPING_NAME + " VARCHAR(25) ) ";
        db.execSQL(create_grouping_table);

        String create_product_table = "CREATE TABLE " +
                PRODUCT_TABLE + " ( " +
                PRODUCT_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                PRODUCT_NAME + " INT," +
                PRODUCT_GROUPING_ID + " INTIGER , " +
                PRODUCT_FIRST_STOCK + " INTIGER , " +
                PRODUCT_WAREHOUSE_ID + " INTEGER , " +
                PRODUCT_COST + " VARCHAR , " +
                PRODUCT_COUNTING_UNIT_ID + " VARCHAR(25) ) ";
        db.execSQL(create_product_table);

        String create_counting_unit_table = "CREATE TABLE " +
                COUNTING_UNIT_TABLE + " ( " +
                COUNTING_UNIT_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                COUNTING_UNIT_NAME + " VARCHAR(25) ) ";
        db.execSQL(create_counting_unit_table);

        String create_invoice_table = "CREATE TABLE " +
                INVOICE_TABLE + " ( " +
                INVOICE_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                INVOICE_CUSTOMER_NAME + " INT," +
                INVOICE_CUSTOMER_ID + " INTIGER , " +
                INVOICE_INVOICE_TYPE + " INTIGER , " +
                INVOICE_DESCRIPTION + " INTEGER , " +
                INVOICE_TOTOAL_AMOUNT + " VARCHAR , " +
                INVOICE_ADDITION + " INT," +
                INVOICE_DEDUCTION + " INTIGER , " +
                INVOICE_INVOICE_DATA + " INTIGER , " +
                INVOICE_INVOICE_ITEM_ID + " INTEGER , " +
                INVOICE_DISCOUNT + " VARCHAR , " +
                INVOICE_TOTAL_BALANCE + " VARCHAR(25) ) ";
        db.execSQL(create_invoice_table);

        String create_invoice_item_table = "CREATE TABLE " +
                INVOICE_ITEM_TABLE + " ( " +
                INVOICE_ITEM_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                INVOICE_ITEM_FEE + " INT," +
                INVOICE_ITEM_AMOUNT + " INTIGER , " +
                INVOICE_ITEM_NUMBER + " INTIGER , " +
                INVOICE_ITEM_WAREHOUSE_ID + " INTEGER , " +
                INVOICE_ITEM_PRODUCT_NAME + " VARCHAR , " +
                INVOICE_ITEM_PRODUCT_ID + " VARCHAR(25) ) ";
        db.execSQL(create_invoice_item_table);


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
