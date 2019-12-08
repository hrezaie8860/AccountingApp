package com.teta_tm.bizban.accountingapp.Models;

public class Invoice {

    String cstmrName;
    String cstmrId;
    String invocTyp;
    String dscrip;
    String ttalAmnt;
    String addition;
    String dduction;
    String invcDate;
    String invcItmId;
    String discnt;
    String ttalBlnc;


    public Invoice(String cstmrName, String invocTyp, String ttalAmnt, String invcDate, String invcItmId) {
        this.cstmrName = cstmrName;
        this.invocTyp = invocTyp;
        this.ttalAmnt = ttalAmnt;
        this.invcDate = invcDate;
        this.invcItmId = invcItmId;
    }




    public String getCstmrName() {
        return cstmrName;
    }

    public void setCstmrName(String cstmrName) {
        this.cstmrName = cstmrName;
    }

    public String getCstmrId() {
        return cstmrId;
    }

    public void setCstmrId(String cstmrId) {
        this.cstmrId = cstmrId;
    }

    public String getInvocTyp() {
        return invocTyp;
    }

    public void setInvocTyp(String invocTyp) {
        this.invocTyp = invocTyp;
    }

    public String getDscrip() {
        return dscrip;
    }

    public void setDscrip(String dscrip) {
        this.dscrip = dscrip;
    }

    public String getTtalAmnt() {
        return ttalAmnt;
    }

    public void setTtalAmnt(String ttalAmnt) {
        this.ttalAmnt = ttalAmnt;
    }

    public String getAddition() {
        return addition;
    }

    public void setAddition(String addition) {
        this.addition = addition;
    }

    public String getDduction() {
        return dduction;
    }

    public void setDduction(String dduction) {
        this.dduction = dduction;
    }

    public String getInvcDate() {
        return invcDate;
    }

    public void setInvcDate(String invcDate) {
        this.invcDate = invcDate;
    }

    public String getInvcItmId() {
        return invcItmId;
    }

    public void setInvcItmId(String invcItmId) {
        this.invcItmId = invcItmId;
    }

    public String getDiscnt() {
        return discnt;
    }

    public void setDiscnt(String discnt) {
        this.discnt = discnt;
    }

    public String getTtalBlnc() {
        return ttalBlnc;
    }

    public void setTtalBlnc(String ttalBlnc) {
        this.ttalBlnc = ttalBlnc;
    }


}
