/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primaapp;

import java.util.Scanner;

/**
 *
 * @author riseloka
 */
public class PrimaApp {
    
    static String apakahPrima(int angka) {
        int pembagi = 0;
        for (int i = 1; i <= angka; i++) {
            if (angka % i == 0) {
                pembagi++;
            }
        }
      
        if(pembagi == 2) {
            return Integer.toString(angka) + " Adalah bilangan Prima";
        } else {
            return Integer.toString(angka) +  " Bukan bilangan Prima";
        }
    }
    
    public static void main(String[] args) {
       System.out.println("Prima App");
//     version1();
       version2();
    }
    
    static void version1() {
        System.out.println(apakahPrima(1));
        System.out.println(apakahPrima(2));
    }
    
    static void version2() {
         Scanner scan = new Scanner(System.in);
         System.out.println("Masukan angka untuk di cek atau [N]/[n] untuk keluar.");
         
         String input = scan.nextLine();
         if( input.matches("\\d+") ) {
            int angka = Integer.parseInt(input);
            System.out.println(apakahPrima(angka));
            System.out.println("");
            version2();
          } else if ("N".equals(input) || "n".equals(input)) {
            System.exit(0);
          } else {
            System.out.println("Masukan angka dengan benar, "
                    + "tidak boleh huruf atau karakter");
            System.out.println("");
            version2();
          }
    }
}
