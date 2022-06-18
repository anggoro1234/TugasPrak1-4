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
import java.util.ArrayList;

public class CarData {
    ArrayList<Car> carList = new ArrayList<>();

    public void addCar(String carType, String polNum, String merk){
        carList.add(new Car(carType, polNum, merk, true));
    }

    public void listOfCar(){
        System.out.println("--------------------------");
        System.out.println("   DAFTAR MOBIL   ");
        System.out.println("--------------------------");

        for (Car data : carList) {
            System.out.println("TIPE MOBIL : " + data.getCarType());
            System.out.println("NO POL  : " + data.getPolNum());
            System.out.println("MERK MOBIL : " + data.getMerk());
            System.out.println("------------------------------------------");
        }
        System.out.println("");
    }
}
