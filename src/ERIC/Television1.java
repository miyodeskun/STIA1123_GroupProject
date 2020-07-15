/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ERIC;

/**
 *
 * @author Eric Cheok
 */
public class Television1 {
    String TelevisionType, Channel, Brand, PriceB; 
    double ScreenSize,Price;
    
    public Television1(String TelevisionType, String Channel, String Brand, String PriceB, double ScreenSize, double Price){
        this.TelevisionType = TelevisionType;
        this.Channel = Channel;
        this.Brand = Brand;
        this.ScreenSize = ScreenSize;
        this.Price = Price;
        this.PriceB = PriceB;
    }

    Television1(String TelevisionType, double ScreenSize, String Channel, String Brand, double Price, String PriceB) {
        this.TelevisionType = TelevisionType;
        this.Channel = Channel;
        this.Brand = Brand;
        this.ScreenSize = ScreenSize;
        this.Price = Price;
        this.PriceB = PriceB;
        
    }
}
