/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak5;

/**
 *
 * @author ACER
 */
public class Car {
    private String carType;
    private String polNum;
    private String merk;
    private boolean status;

    public Car(String carType,String polNum,String merk, boolean status){
        this.carType = carType;
        this.merk = merk;
        this.polNum = polNum;
        this.status = status;
    }

    public String getCarType() {
        return carType;
    }

    public String getPolNum() {
        return polNum;
    }

    public String getMerk() {
        return merk;
    }

    public boolean isStatus(){
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
