package com.teta_tm.bizban.accountingapp.Models;

public class CstmrChck extends Check {




    String cstmrNamRcivFrm,recivDate;
    Integer cstmrChckId,cstmrIdRcivFrm;

    public CstmrChck(String bnkNam, String amount, String num, String state, String annals, String pyDate, String cstmrNamRcivFrm, String recivDate,Integer cstmrChckId) {
        super(bnkNam, amount, num, state, annals, pyDate);
        this.cstmrNamRcivFrm = cstmrNamRcivFrm;
        this.recivDate = recivDate;
        this.cstmrChckId=cstmrChckId;
    }



    public Integer getCstmrChckId() {
        return cstmrChckId;
    }

    public void setCstmrChckId(Integer cstmrChckId) {
        this.cstmrChckId = cstmrChckId;
    }

    public String getCstmrNamRcivFrm() {
        return cstmrNamRcivFrm;
    }

    public void setCstmrNamRcivFrm(String cstmrNamRcivFrm) {
        this.cstmrNamRcivFrm = cstmrNamRcivFrm;
    }

    public Integer getCstmrIdRcivFrm() {
        return cstmrIdRcivFrm;
    }

    public void setCstmrIdRcivFrm(Integer cstmrIdRcivFrm) {
        this.cstmrIdRcivFrm = cstmrIdRcivFrm;
    }

    public String getRecivDate() {
        return recivDate;
    }

    public void setRecivDate(String recivDate) {
        this.recivDate = recivDate;
    }







}
