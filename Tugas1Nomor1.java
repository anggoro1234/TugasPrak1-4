import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int pilih = input.nextInt();    
       
        switch (pilih){
        case 1 :
            int sisi = input.nextInt();
            System.out.println(luasPersegi(sisi));
            break;
        
        case 2 :
            int alas = input.nextInt();
            int tinggi = input.nextInt();
            System.out.println(luasSegitiga(alas, tinggi));
            break;
                
        case 3 :
            int jariJari = input.nextInt();
            System.out.println(luasLingkaran(jariJari));
            break;
                
        default :
            System.out.println("Input yang anda masukan tidak sesuai");
            break;
         }
       }
    
    static int luasPersegi(int sisi){
            int luas = sisi * sisi;
            return luas;
    }
    static int luasSegitiga(int alas, int tinggi){
        int luas = alas * tinggi / 2;
        return luas;
    }
    static double luasLingkaran(int jari){
        if(jari % 7 == 0){
            double phi = 22/7;
            double luas = phi * jari * jari;
        return (double)(int)luas;  
        } else {
            double phi = 3.14;
            double luas = phi * jari * jari;
            return (double)(int)luas;  
        }
        
    }
 }
