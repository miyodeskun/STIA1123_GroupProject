/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FARRAH;

import java.io.Serializable;

/**
 *
 * @author A C E R
 */

public class OrderMobile implements Serializable {
    
    String code;
    String mobileNum;
    String mobileOperator;
    String amount;
    String pay;

    public OrderMobile(String code, String mobileNum, String mobileOperator, String amount, String pay) {
        this.code = code;
        this.mobileNum = mobileNum;
        this.mobileOperator = mobileOperator;
        this.amount = amount;
        this.pay = pay;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public String getMobileOperator() {
        return mobileOperator;
    }

    public void setMobileOperator(String mobileOperator) {
        this.mobileOperator = mobileOperator;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }
    
}
