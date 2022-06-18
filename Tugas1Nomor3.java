import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
         double setor = input.nextDouble();
        double saldoPertama= input.nextDouble();
    
        System.out.println(Saldo(saldoPertama, setor));
    }
    
    static double biayaAdmin(double saldoPertama, double setor){
        
        double saldoSekarang = saldoPertama + setor;
        double admin = saldoSekarang - 7000;
        return admin;
    }
    
    static double Saldo(double saldoPertama, double setor){
        
        double bonus = 0.0005;
        double saldoAkhir = biayaAdmin(saldoPertama,setor) * bonus;
        double saldoTotal = biayaAdmin(saldoPertama,setor) + saldoAkhir;
        return saldoTotal;
    }
}
