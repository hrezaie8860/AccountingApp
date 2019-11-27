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

    private static final String TRANSACTIONS_TABLE = "transactions";
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
    private static final String TRANSACTION_TP_ID = "ID";
    private static final String TRANSACTION_TP_PAYMENT = "PAYMENT";
    private static final String TRANSACTION_TP_RECEIVE = "RECEIVE";
    private static final String TRANSACTION_TP_TRANSFERS = "TRANSFERS";
    private static final String TRANSACTION_TP_INCOME = "INCOME";
    private static final String TRANSACTION_TP_COST = "COST";

    private static final String INSTALLMENT_TABLE= "installment";
    private static final String INSTALLMENT_ID = "ID";
    private static final String INSTALLMENT_CUSTOMER_NAME = "CUSTOMER_NAME";
    private static final String INSTALLMENT_CUSTOMER_ID = "CUSTOMER_ID";
    private static final String INSTALLMENT_START_DATE = "DATE_OF_START";
    private static final String INSTALLMENT_EACH_PAY_AMOUNT = "EACH_PAYMENT_AMOUNT";
    private static final String INSTALLMENT_TOTAL_AMOUNT = "TOTAL_AMOUNT";
    private static final String INSTALLMENT_PAYMENT_GAP = "GAP_OF_PAYMENT";

    private static final String CHECK_TABLE= "check_table";
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

    private static final String WAREHOUSE_TABLE= "warehouse";
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
    private static final String INVOICE_TOTAL_AMOUNT= "TOTAL_INVOICE_AMOUNT";
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
                CUSTOMER_ADDRESS + " TEXT , " +
                CUSTOMER_PHONE + " DOUBLE(15) , " +
                CUSTOMER_CITY + " VARCHAR(25) ) ";
        db.execSQL(create_customer_table);

        String create_person_table = "CREATE TABLE " +
                PERSON_TABLE + " ( " +
                PERSON_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                PERSON_NAME + " VARCHAR(25) ," +
                PERSON_LNAME + " VARCHAR(25) ) ";
        db.execSQL(create_person_table);

        String create_user_table = "CREATE TABLE " +
                USER_TABLE + " ( " +
                USER_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                USER_PERSON_ID + " INT )";
        db.execSQL(create_user_table);

        String create_bnk_account_table = "CREATE TABLE " +
                BNK_ACCOUNT_TABLE + " ( " +
                BNK_ACCOUNT_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                BNK_ACCOUNT_NUM + " DOUBLE(30)," +
                BNK_ACCOUNT_BNK_NAME + " VARCHAR(25)," +
                BNK_ACCOUNT_CARD_NUM + " DOUBLE(16)," +
                BNK_ACCOUNT_BNK_BRANCH + " VARCHAR(25)," +
                BNK_ACCOUNT_FIRST_CASH + " DOUBLE(30) ) ";
        db.execSQL(create_bnk_account_table);

        String create_cash_box_table = "CREATE TABLE " +
                CASH_BOX_TABLE + " ( " +
                CASH_BOX_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                CASH_BOX_FIRST_CASH + " DOUBLE(30) ," +
                CASH_BOX_NAME + " VARCHAR(25) ) ";
        db.execSQL(create_cash_box_table);

        String create_transaction_table = "CREATE TABLE " +
                TRANSACTIONS_TABLE + " ( " +
                TRANSACTION_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                TRANSACTION_DATE + " VARCHAR," +
                TRANSACTION_BNK_ACNT_ID + " INT , " +
                TRANSACTION_BOX_ID + " INT , " +
                TRANSACTION_DESCRIPTION + " TEXT , " +
                TRANSACTION_CUSTOMER_ID + " INTEGER , " +
                TRANSACTION_TRANSACTION_TYPE_ID +"INT," +
                TRANSACTION_TOTAL_AMOUNT + " DOUBLE , " +
                TRANSACTION_CUSTOMER_NAME + " VARCHAR(25) ) ";
        db.execSQL(create_transaction_table);

        String create_transaction_tp_table = "CREATE TABLE " +
                TRANSACTION_TYPE_TABLE + " ( " +
                TRANSACTION_TP_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                TRANSACTION_TP_PAYMENT + " VARCHAR(10)," +
                TRANSACTION_TP_RECEIVE + " VARCHAR(10) , " +
                TRANSACTION_TP_TRANSFERS + " VARCHAR(15) , " +
                TRANSACTION_TP_INCOME + " VARCHAR(10) , " +
                TRANSACTION_TP_COST + " VARCHAR(10) ) ";
        db.execSQL(create_transaction_tp_table);

        String create_installment_table = "CREATE TABLE " +
                INSTALLMENT_TABLE + " ( " +
                INSTALLMENT_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                INSTALLMENT_CUSTOMER_ID + " INT," +
                INSTALLMENT_CUSTOMER_NAME + " VARCHAR(25) , " +
                INSTALLMENT_START_DATE + " VARCHAR(10) , " +
                INSTALLMENT_EACH_PAY_AMOUNT + " DOUBLE(10) , " +
                INSTALLMENT_TOTAL_AMOUNT + " DOUBLE(10) , " +
                INSTALLMENT_PAYMENT_GAP + " VATCHAR(15) ) ";
        db.execSQL(create_installment_table);

        String create_check_table = "CREATE TABLE " +
                CHECK_TABLE + " ( " +
                CHECK_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                CHECK_BNK_NAME + " VARCHAR(25)," +
                CHECK_AMOUNT + " DOUBLE(15) , " +
                CHECK_NUM + " VARCHAR(15) , " +
                CHECK_STATE + " VARCHAR(15) , " +
                CHECK_ANNALS + " VARCHAR(10) , " +
                CHECK_CSTMR_NAM_TO_PAY + " VARCHAR(25) , " +
                CHECK_CSTMR_ID_TO_PAY + " INT , " +
                CHECK_PAYMENT_DATE + " VARCHAR(10) ) ";
        db.execSQL(create_check_table);

        String create_company_check_table = "CREATE TABLE " +
                COMPANY_CHECK_TABLE + " ( " +
                COMPANY_CHECK_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                COMPANY_CHECK_CSTMR_ID + " INT," +
                COMPANY_CHECK_CHECK_ID + " INT ) ";
        db.execSQL(create_company_check_table);

        String create_customer_check_table = "CREATE TABLE " +
                CUSTOMER_CHECK_TABLE + " ( " +
                CUSTOMER_CHECK_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                CUSTOMER_CHECK_CSTMR_ID_RECEIVE_FROM + " INT," +
                CUSTOMER_CHECK_CSTMR_NAME_RECEIVE_FROM + " INTIGER(25) , " +
                CUSTOMER_CHECK_RECEIVE_DATE + " VARCHAR(10) ) ";
        db.execSQL(create_customer_check_table);

        String create_warehouse_table = "CREATE TABLE " +
                WAREHOUSE_TABLE + " ( " +
                WAREHOUSE_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                WAREHOUSE_NAME + " VARCHAR(20)," +
                WAREHOUSE_RESPONSIBLE_NAME + " VARCHAR(25) ) ";
        db.execSQL(create_warehouse_table);

        String create_grouping_table = "CREATE TABLE " +
                GROUPING_TABLE + " ( " +
                GROUPING_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                GROUPING_NAME + " VARCHAR(20) ) ";
        db.execSQL(create_grouping_table);

        String create_product_table = "CREATE TABLE " +
                PRODUCT_TABLE + " ( " +
                PRODUCT_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                PRODUCT_NAME + " VARCHAR(30)," +
                PRODUCT_GROUPING_ID + " INT , " +
                PRODUCT_FIRST_STOCK + " VHARCHAR , " +
                PRODUCT_WAREHOUSE_ID + " INT , " +
                PRODUCT_COST + " DOUBLE , " +
                PRODUCT_COUNTING_UNIT_ID + " INT ) ";
        db.execSQL(create_product_table);

        String create_counting_unit_table = "CREATE TABLE " +
                COUNTING_UNIT_TABLE + " ( " +
                COUNTING_UNIT_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                COUNTING_UNIT_NAME + " VARCHAR(25) ) ";
        db.execSQL(create_counting_unit_table);

        String create_invoice_table = "CREATE TABLE " +
                INVOICE_TABLE + " ( " +
                INVOICE_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                INVOICE_CUSTOMER_NAME + " VARCHAR(25)," +
                INVOICE_CUSTOMER_ID + " INT , " +
                INVOICE_INVOICE_TYPE + " VARCHAR(15) , " +
                INVOICE_DESCRIPTION + " VHARCHAR(50) , " +
                INVOICE_TOTAL_AMOUNT + " DOUBLE , " +
                INVOICE_ADDITION + " DOUBLE," +
                INVOICE_DEDUCTION + " DOUBLE , " +
                INVOICE_INVOICE_DATA + " VARCHAR(10) , " +
                INVOICE_INVOICE_ITEM_ID + " VARCHAR(10) , " +
                INVOICE_DISCOUNT + " DOUBLE , " +
                INVOICE_TOTAL_BALANCE + " DOUBLE ) ";
        db.execSQL(create_invoice_table);

        String create_invoice_item_table = "CREATE TABLE " +
                INVOICE_ITEM_TABLE + " ( " +
                INVOICE_ITEM_ID + " INT PRIMARY KEY AUTOINCREMENT, " +
                INVOICE_ITEM_FEE + " DOUBLE," +
                INVOICE_ITEM_AMOUNT + " DOUBLE , " +
                INVOICE_ITEM_NUMBER + " INT , " +
                INVOICE_ITEM_WAREHOUSE_ID + " INT , " +
                INVOICE_ITEM_PRODUCT_NAME + " VARCHAR , " +
                INVOICE_ITEM_PRODUCT_ID + " INT ) ";
        db.execSQL(create_invoice_item_table);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + CUSTOMER_TABLE);
        onCreate(db);

        db.execSQL("DROP TABLE IF EXISTS " + PERSON_TABLE);
        onCreate(db);

        db.execSQL("DROP TABLE IF EXISTS " + USER_TABLE);
        onCreate(db);

        db.execSQL("DROP TABLE IF EXISTS " + BNK_ACCOUNT_TABLE);
        onCreate(db);

        db.execSQL("DROP TABLE IF EXISTS " + CASH_BOX_TABLE);
        onCreate(db);

        db.execSQL("DROP TABLE IF EXISTS " + TRANSACTIONS_TABLE);
        onCreate(db);

        db.execSQL("DROP TABLE IF EXISTS " + TRANSACTION_TYPE_TABLE);
        onCreate(db);

        db.execSQL("DROP TABLE IF EXISTS " + INSTALLMENT_TABLE);
        onCreate(db);

        db.execSQL("DROP TABLE IF EXISTS " + CHECK_TABLE);
        onCreate(db);

        db.execSQL("DROP TABLE IF EXISTS " + COMPANY_CHECK_TABLE);
        onCreate(db);

        db.execSQL("DROP TABLE IF EXISTS " + CUSTOMER_CHECK_TABLE);
        onCreate(db);

        db.execSQL("DROP TABLE IF EXISTS " + WAREHOUSE_TABLE);
        onCreate(db);

        db.execSQL("DROP TABLE IF EXISTS " + GROUPING_TABLE);
        onCreate(db);

        db.execSQL("DROP TABLE IF EXISTS " + PRODUCT_TABLE);
        onCreate(db);

        db.execSQL("DROP TABLE IF EXISTS " + COUNTING_UNIT_TABLE);
        onCreate(db);

        db.execSQL("DROP TABLE IF EXISTS " + INVOICE_TABLE);
        onCreate(db);

        db.execSQL("DROP TABLE IF EXISTS " + INVOICE_ITEM_TABLE);
        onCreate(db);

    }
}
