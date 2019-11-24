package com.teta_tm.bizban.accountingapp.Utils;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper{

    private static final String DB_NAME = "accounting.db";

    private static final String TABLE_NAME_1 = "customer";
    private static final String COL_0 = "ID";
    private static final String COL_1 = "PERSON_ID";
    private static final String COL_2 = "DEBT";
    private static final String COL_3 = "CREDIT";
    private static final String COL_4 = "PHONE";
    private static final String COL_5 = "ADDRESS";
    private static final String COL_6 = "CITY";

    private static final String TABLE_NAME_2 = "person";
    private static final String PESONE_COL_0 = "ID";
    private static final String PESONE_COL_1 = "NAME";
    private static final String PESONE_COL_2 = "LAST_NAME";

    private static final String TABLE_NAME_3 = "customer";
    private static final String CUSTOMER_COL_0 = "ID";
    private static final String CUSTOMER_COL_1 = "PERSON_ID";
    private static final String CUSTOMER_COL_2 = "DEBT";
    private static final String CUSTOMER_COL_3 = "CREDIT";
    private static final String CUSTOMER_COL_4 = "PHONE";
    private static final String CUSTOMER_COL_5 = "ADDRESS";
    private static final String CUSTOMER_COL_6 = "CITY";

    private static final String TABLE_NAME_4 = "user";
    private static final String USER_COL_0 = "ID";
    private static final String USER_COL_1 = "PERSON_ID";

    private static final String TABLE_NAME_5 = "bnk_account";
    private static final String BNK_ACNT_COL_0 = "ID";
    private static final String BNK_ACNT_COL_1 = "BANK_NAME";
    private static final String BNK_ACNT_COL_2 = "ACCOUNT_NUM";
    private static final String BNK_ACNT_COL_3 = "CARD_NUM";
    private static final String BNK_ACNT_COL_4 = "BANK_BRANCH";
    private static final String BNK_ACNT_COL_5 = "THE_FIRST_CASH";

    private static final String TABLE_NAME_6 = "cash_box";
    private static final String CASH_DESK_COL_0 = "ID";
    private static final String CASH_DESK_CLO_1 = "THE_FIRST_CASH";
    private static final String CASH_DESK_CLO_2 = "NAME";

    private static final String TABLE_NAME_7 = "transaction";
    private static final String TRANSACTION_COL_0 = "ID";
    private static final String TRANSACTION_COL_1 = "DATA";
    private static final String TRANSACTION_COL_2 = "BNK_ACCOUNT_ID";
    private static final String TRANSACTION_COL_3 = "CASH_BOX_ID";
    private static final String TRANSACTION_COL_4 = "DESCRIPTION";
    private static final String TRANSACTION_COL_5 = "CUSTOMER_ID";
    private static final String TRANSACTION_COL_6 = "CUSTOMER_NAME";
    private static final String TRANSACTION_COL_7 = "TRANSACTION_TYPE_ID";
    private static final String TRANSACTION_COL_8 = "TOTAL_AMOUNT";

    private static final String TABLE_NAME_8 = "transaction_type";
    private static final String TRANSACTION_tp_COL_0 = "ID";
    private static final String TRANSACTION_tp_COL_1 = "PAYMENT";
    private static final String TRANSACTION_tp_COL_2 = "RECEIVE";
    private static final String TRANSACTION_tp_COL_3 = "TRANSFERS";
    private static final String TRANSACTION_tp_COL_4 = "INCOME";
    private static final String TRANSACTION_tp_COL_5 = "COST";


    private static final String TABLE_NAME_9= "installment";
    private static final String INSTALLMENT_COL_0 = "ID";
    private static final String INSTALLMENT_COL_1 = "CUSTOMER_NAME";
    private static final String INSTALLMENT_COL_2 = "CUSTOMER_ID";
    private static final String INSTALLMENT_COL_3 = "DATE_OF_START";
    private static final String INSTALLMENT_COL_4 = "ONE_PAYMENT_AMOUNT";
    private static final String INSTALLMENT_COL_5 = "TOTAL_AMOUNT";
    private static final String INSTALLMENT_COL_6 = "GAP_OF_PAYMENT";

    private static final String TABLE_NAME_10= "check";
    private static final String CHECK_COL_0 = "CHECK_ID";
    private static final String CHECK_COL_1 = "BNK_NAME";
    private static final String CHECK_COL_2 = "CHECK_AMOUNT";
    private static final String CHECK_COL_3 = "CHECK_NUM";
    private static final String CHECK_COL_4 = "CHECK_STATS";
    private static final String CHECK_COL_5 = "CHECK_ANNALS";
    private static final String CHECK_COL_6 = "CUSTOMER_NAME_TO_PAY";
    private static final String CHECK_COL_7 = "CUSTOMER_ID_TO_PAY";

    private static final String TABLE_NAME_11= "company_check";
    private static final String CAMPANY_CHECK_COL_0 = "COMPANY_CHECK_ID";
    private static final String CAMPANY_CHECK_COL_1 = "CUSTOMER_ID";
    private static final String CAMPANY_CHECK_COL_2 = "CHECK_ID";

    private static final String TABLE_NAME_12= "customer_check";
    private static final String CUSTOMER_CHECK_COL_0 = "CUSTOMER_CHECK_ID";
    private static final String CUSTOMER_CHECK_COL_1 = "CUSTOMER_ID_RECEIVE_FROM";
    private static final String CUSTOMER_CHECK_COL_2 = "CUSTOMER_NAME_RECEIVE_FROM";





    public DbHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version, @Nullable DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
