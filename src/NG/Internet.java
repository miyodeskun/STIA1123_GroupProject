/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NG;

import java.io.*;

public class Internet implements Serializable {
    
    private String name;
    private String telNo;
    private String address;
    private String wifiName;
    private double price;
    private int speed;
    private String itemCOVID19;

    public Internet(String name, String telNo, String address, String wifiName, double price, int speed, String itemCOVID19) {
        this.name = name;
        this.telNo = telNo;
        this.address = address;
        this.wifiName = wifiName;
        this.price = price;
        this.speed = speed;
        this.itemCOVID19 = itemCOVID19;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWifiName() {
        return wifiName;
    }

    public void setWifiName(String wifiName) {
        this.wifiName = wifiName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getItemCOVID19() {
        return itemCOVID19;
    }

    public void setItemCOVID19(String itemCOVID19) {
        this.itemCOVID19 = itemCOVID19;
    }

          
}
