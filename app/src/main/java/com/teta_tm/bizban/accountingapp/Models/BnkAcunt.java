package com.teta_tm.bizban.accountingapp.Models;

public class BnkAcunt {

    String bnk_nam;
    String acntNum;
    String crdNum;
    String bnkBrnch;
    String frstCash;



    public BnkAcunt(String bnk_nam, String acntNum) {
        this.bnk_nam = bnk_nam;
        this.acntNum = acntNum;
    }




    public String getBnk_nam() {
        return bnk_nam;
    }

    public void setBnk_nam(String bnk_nam) {
        this.bnk_nam = bnk_nam;
    }

    public String getAcntNum() {
        return acntNum;
    }

    public void setAcntNum(String acntNum) {
        this.acntNum = acntNum;
    }

    public String getCrdNum() {
        return crdNum;
    }

    public void setCrdNum(String crdNum) {
        this.crdNum = crdNum;
    }

    public String getBnkBrnch() {
        return bnkBrnch;
    }

    public void setBnkBrnch(String bnkBrnch) {
        this.bnkBrnch = bnkBrnch;
    }

    public String getFrstCash() {
        return frstCash;
    }

    public void setFrstCash(String frstCash) {
        this.frstCash = frstCash;
    }



}
