/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication67;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
class Baju {

      static String jenis;
      static int jumlah;
      int harga;
      
      
      final int bajuA;
      final int bajuB;
      final int bajuC;
   
   
    

    Baju(){
        if (jumlah <= 100){
            this.bajuA = 100000;
        } else {
            this.bajuA = 95000;
        }

        if (jumlah <= 100){
            this.bajuB = 125000;
        } else {
            this.bajuB = 120000;
        }

        if (jumlah <= 100){
            this.bajuC = 175000;
        } else {
            this.bajuC = 160000;
        }
    }

    void hargaA(){
        this.harga = this.bajuA;
    }

    void hargaB(){
        this.harga = this.bajuB;
    }

    void hargaC(){
        this.harga = this.bajuC;
    }

    void display(){
        if (jenis.equalsIgnoreCase("a")){
            this.hargaA();
        } else if (jenis.equalsIgnoreCase("b")){
            this.hargaB();
        } else if (jenis.equalsIgnoreCase("c")){
            this.hargaC();
        }
        System.out.println("Jenis yang anda beli : " + Baju.jenis);
        System.out.println("Harga per buah       : " + this.harga);
        System.out.println("Total harga          : " + this.harga * Baju.jumlah);
    }
}

public class Tugas3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jenis;
        int jumlah;
       
        displayBaju();

        System.out.print("Baju yang akan anda beli bertipe : ");
        jenis = input.nextLine();
        System.out.print("Jumlah Baju yang akan anda beli adalah : ");
        jumlah = input.nextInt();

        Baju.jenis = jenis;
        Baju.jumlah = jumlah;

        Baju bajuErigo = new Baju();
        bajuErigo.display();
    }

    private static void displayBaju(){
        System.out.println("Baju yang tersedia :");
        System.out.println("Baju A dengan harga 100000");
        System.out.println("Baju B dengan harga 125000");
        System.out.println("Baju C dengan harga 175000");
    }
}
