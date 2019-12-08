package com.teta_tm.bizban.accountingapp.Models;

public class CstmrChck extends Check {



    String cstmrChckId,cstmrNamRcivFrm,cstmrIdRcivFrm,recivDate;

    public CstmrChck(String bnkNam, String amount, String num, String state, String annals, String pyDate, String cstmrNamRcivFrm, String recivDate) {
        super(bnkNam, amount, num, state, annals, pyDate);
        this.cstmrNamRcivFrm = cstmrNamRcivFrm;
        this.recivDate = recivDate;
    }

    public String getCstmrNamRcivFrm() {
        return cstmrNamRcivFrm;
    }

    public void setCstmrNamRcivFrm(String cstmrNamRcivFrm) {
        this.cstmrNamRcivFrm = cstmrNamRcivFrm;
    }

    public String getCstmrIdRcivFrm() {
        return cstmrIdRcivFrm;
    }

    public void setCstmrIdRcivFrm(String cstmrIdRcivFrm) {
        this.cstmrIdRcivFrm = cstmrIdRcivFrm;
    }

    public String getRecivDate() {
        return recivDate;
    }

    public void setRecivDate(String recivDate) {
        this.recivDate = recivDate;
    }







}
