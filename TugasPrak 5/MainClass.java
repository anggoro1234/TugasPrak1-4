package prak5;

import java.util.Scanner;
import prak5.CarRider;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.next();
        int age = input.nextInt();
        String phone = input.next();

        CarRider Joko = new CarRider("Joko", 32, "081216787654");
        CarRider Bambang = new CarRider("Bambang", 35, "089756511231");
        CarRider Khoirul = new CarRider("Khoirul", 26, "081242577479");
        CarRider random = new CarRider(name, age, phone);

    CarData data = new CarData();
    data.addCar("RUSH", "AG 3245 BU", "TOYOTA");
    data.addCar("XENIA", "W 8743 KL", "DAIHATSU");
    data.addCar("BRIO", "B 6533 KA", "HONDA");
    data.addCar("ERTIGA", "AE 3211 CC", "SUZUKI");

    data.listOfCar();

    RentArchive simpan = new RentArchive();
    simpan.Rent(Joko, data.carList.get(1), 9);
    simpan.Rent(Bambang, data.carList.get(3), 3);
    simpan.Rent(Khoirul, data.carList.get(1), 1);
    simpan.Rent(random,data.carList.get(2),7);

        System.out.println("");
        simpan.info();
    }
}
