/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carpim.tablosu;
import java.util.Scanner;
public class CarpimTablosu {

    public static void main(String[] args) {
        //tablonun başlığı 
        System.out.println("        Çarpım Tablosu :");
        // SAYI BAŞLIĞI 
        System.out.print("   ");
        for (int j = 1 ; j<= 9 ; j++){
            System.out.print("   " + j);     
        }
        System.out.println("\n------------------------------------------");
        
        //tablonun gövdesi
        for(int i = 1 ; i<=9 ; i++){
        System.out.print(i + " | " );
        for ( int j =1 ; j <=9 ; j++){
            //çarpimlar ve düzenli yerleştirme
            System.out.printf("%4d", i * j);
        }
        System.out.println();
    }
    }
}

