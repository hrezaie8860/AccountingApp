package com.teta_tm.bizban.accountingapp.Models;

import android.provider.ContactsContract;

public class CashBox {

    String boxNam,theFrstCash;
    Integer boxId;


    public CashBox(String boxNam) {
        this.boxNam = boxNam;
    }

    public String getBoxNam() {
        return boxNam;
    }

    public void setBoxNam(String boxNam) {
        this.boxNam = boxNam;
    }

    public String getTheFrstCash() {
        return theFrstCash;
    }

    public void setTheFrstCash(String theFrstCash) {
        this.theFrstCash = theFrstCash;
    }

    public Integer getBoxId() {
        return boxId;
    }

    public void setBoxId(Integer boxId) {
        this.boxId = boxId;
    }




}
