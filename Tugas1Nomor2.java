import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
       
        String huruf = scan.nextLine();
        
        int putaran = scan.nextInt();
        
        int panjang = huruf.length();
        
        
        System.out.print(perulangan(putaran,huruf,panjang));
      }
    
    static String perulangan(int putaran, String huruf,int panjang){
      String jadi = "";  
      
        for(int a = 0;a<panjang;a++){
       
          int x = huruf.charAt(a);
          
           if(x == 32){
          jadi = jadi+" ";
        }
          else if (x >=65 && x<=90){
            x = x+putaran;
            if(x>90){
              x-=26;
              jadi = jadi+(char)x;
            }else{
              jadi = jadi+(char)x;
            }
          }
          else if(x>=97&&x<=122){
            x = x+putaran;
            if(x>122){
              x -=26;
              jadi = jadi+(char)x;
            }else{
              jadi = jadi+(char)x;
            }
          }
        
          
        }
        return jadi;
      
    }
}
