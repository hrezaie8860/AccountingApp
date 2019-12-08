package com.teta_tm.bizban.accountingapp.Models;

public class CmpnyChck extends Check {

    String cmpnyChckId,checkId;


    public CmpnyChck(String bnkNam, String amount, String num, String state, String annals, String pyDate, String cmpnyChckId, String checkId) {
        super(bnkNam, amount, num, state, annals, pyDate);
        this.cmpnyChckId = cmpnyChckId;
        this.checkId = checkId;
    }



    public String getCmpnyChckId() {
        return cmpnyChckId;
    }

    public void setCmpnyChckId(String cmpnyChckId) {
        this.cmpnyChckId = cmpnyChckId;
    }

    public String getCheckId() {
        return checkId;
    }

    public void setCheckId(String checkId) {
        this.checkId = checkId;
    }



}
