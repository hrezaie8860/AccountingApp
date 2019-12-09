package com.teta_tm.bizban.accountingapp.Models;

public class InvoiceItem {


    String itmFee;
    String amount;
    String prdctNam;
    Integer itmId,number,wrehousId,prdctId;

    public InvoiceItem(Integer itmId, Integer number, Integer wrehousId) {
        this.itmId = itmId;
        this.number = number;
        this.wrehousId = wrehousId;
    }



    public String getItmFee() {
        return itmFee;
    }

    public void setItmFee(String itmFee) {
        this.itmFee = itmFee;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPrdctNam() {
        return prdctNam;
    }

    public void setPrdctNam(String prdctNam) {
        this.prdctNam = prdctNam;
    }

    public Integer getItmId() {
        return itmId;
    }

    public void setItmId(Integer itmId) {
        this.itmId = itmId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getWrehousId() {
        return wrehousId;
    }

    public void setWrehousId(Integer wrehousId) {
        this.wrehousId = wrehousId;
    }

    public Integer getPrdctId() {
        return prdctId;
    }

    public void setPrdctId(Integer prdctId) {
        this.prdctId = prdctId;
    }




}
