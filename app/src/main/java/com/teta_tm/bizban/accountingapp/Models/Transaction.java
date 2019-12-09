package com.teta_tm.bizban.accountingapp.Models;

public class Transaction {

    String date,dscrip,trnsactionTp,ttlAmunt,cstmrNam;
    Integer trnsctionId,bnkAcntId,cstmrId,boxId;

    public Transaction(String date, String trnsactionTp, String ttlAmunt) {
        this.date = date;
        this.trnsactionTp = trnsactionTp;
        this.ttlAmunt = ttlAmunt;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDscrip() {
        return dscrip;
    }

    public void setDscrip(String dscrip) {
        this.dscrip = dscrip;
    }

    public String getTrnsactionTp() {
        return trnsactionTp;
    }

    public void setTrnsactionTp(String trnsactionTp) {
        this.trnsactionTp = trnsactionTp;
    }

    public String getTtlAmunt() {
        return ttlAmunt;
    }

    public void setTtlAmunt(String ttlAmunt) {
        this.ttlAmunt = ttlAmunt;
    }

    public String getCstmrNam() {
        return cstmrNam;
    }

    public void setCstmrNam(String cstmrNam) {
        this.cstmrNam = cstmrNam;
    }

    public Integer getTrnsctionId() {
        return trnsctionId;
    }

    public void setTrnsctionId(Integer trnsctionId) {
        this.trnsctionId = trnsctionId;
    }

    public Integer getBnkAcntId() {
        return bnkAcntId;
    }

    public void setBnkAcntId(Integer bnkAcntId) {
        this.bnkAcntId = bnkAcntId;
    }

    public Integer getCstmrId() {
        return cstmrId;
    }

    public void setCstmrId(Integer cstmrId) {
        this.cstmrId = cstmrId;
    }

    public Integer getBoxId() {
        return boxId;
    }

    public void setBoxId(Integer boxId) {
        this.boxId = boxId;
    }



}
