import java.io.*;
import java.util.*;

public class Solution {

    
           static Scanner input = new Scanner(System.in);

            static int pilih1;
            static int pilih2;
            static int menu;

            public static void main(String[] args) {

            menu = input.nextInt();
            switch(menu){
            case 1:
                Persegi a = new Persegi(input.nextInt());
                System.out.println(a.rumusP());
                break;
            case 2:
                Segitiga b = new Segitiga(input.nextInt(), input.nextInt());
                System.out.println(b.rumusS());
                break;
            case 3:
                Lingkaran c = new Lingkaran(input.nextInt());
                System.out.println(c.rumusL());
                break;
            default :
                System.out.println("Input yang anda masukan tidak sesuai");
                break;
        }
    }
}
    
class Persegi{
   static int sisi = Solution.pilih1;

   Persegi(int sisi){
      this.sisi = sisi;
   }

    int rumusP(){
       return sisi*sisi;
   }
}

class Segitiga{
   static int alas = Solution.pilih1;
   static int tinggi = Solution.pilih2;

   Segitiga(int alas, int tinggi){
      this.alas = alas;
      this.tinggi = tinggi;
   }

    int rumusS(){
       return alas*tinggi/2;
   }
}

class Lingkaran{
   int rad = Solution.pilih1;

   Lingkaran(int rad){
      this.rad = rad;
   }

    double rumusL(){
        double hasil;
       if (rad % 7 == 0){
              double phi = 22/7;
              hasil = phi*rad*rad;
          }else{
              double phi = 3.14;
              hasil= phi*rad*rad;
          }
        return (int)(double) hasil; 
    }
}
    
