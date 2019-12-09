package com.teta_tm.bizban.accountingapp.Models;

public class Check {

    String bnkNam;
    String amount;
    String num;
    String state;
    String annals;
    String cstmrNamToPy;
    Integer cstmrIdToPy;
    String pyDate;


    public Check(String bnkNam, String amount, String num, String state, String annals, String pyDate) {
        this.bnkNam = bnkNam;
        this.amount = amount;
        this.num = num;
        this.state = state;
        this.annals = annals;
        this.pyDate = pyDate;
    }




    public String getBnkNam() {
        return bnkNam;
    }

    public void setBnkNam(String bnkNam) {
        this.bnkNam = bnkNam;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAnnals() {
        return annals;
    }

    public void setAnnals(String annals) {
        this.annals = annals;
    }

    public String getCstmrNamToPy() {
        return cstmrNamToPy;
    }

    public void setCstmrNamToPy(String cstmrNamToPy) {
        this.cstmrNamToPy = cstmrNamToPy;
    }

    public Integer getCstmrIdToPy() {
        return cstmrIdToPy;
    }

    public void setCstmrIdToPy(Integer cstmrIdToPy) {
        this.cstmrIdToPy = cstmrIdToPy;
    }

    public String getPyDate() {
        return pyDate;
    }

    public void setPyDate(String pyDate) {
        this.pyDate = pyDate;
    }


}
