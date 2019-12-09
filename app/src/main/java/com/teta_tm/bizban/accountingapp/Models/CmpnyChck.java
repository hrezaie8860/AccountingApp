package com.teta_tm.bizban.accountingapp.Models;

public class CmpnyChck extends Check {

    Integer cmpnyChckId,checkId;


    public CmpnyChck(String bnkNam, String amount, String num, String state, String annals, String pyDate, Integer cmpnyChckId, Integer checkId) {
        super(bnkNam, amount, num, state, annals, pyDate);
        this.cmpnyChckId = cmpnyChckId;
        this.checkId = checkId;
    }



    public Integer getCmpnyChckId() {
        return cmpnyChckId;
    }

    public void setCmpnyChckId(Integer cmpnyChckId) {
        this.cmpnyChckId = cmpnyChckId;
    }

    public Integer getCheckId() {
        return checkId;
    }

    public void setCheckId(Integer checkId) {
        this.checkId = checkId;
    }



}
