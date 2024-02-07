/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projekcase;

import java.util.Scanner;

/**
 *
 * @author LAPTOPS
 */
public class ProjekCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        
        int[] nilaiBobot = { 
            50, 35, 35, 35, 35, 30, 30, 10, 10, 10, 40, 40, 40, 40, 40, 40, 50
    };

        String[] jawaban = new String [nilaiBobot.length];
        
        int totalBobot = 0;
        for (int i = 0; i < nilaiBobot.length; i++) {
            System.out.printf("Apakah P %d Terjawab Y/T? : ", i + 1);
              jawaban[i] = input.next();
              if (jawaban[i].equals("Y")) {
                totalBobot += nilaiBobot[i];
            }
        }
        tampilkanHasilDeteksi(totalBobot);
}
       public static void tampilkanHasilDeteksi(int totalBobot) {
           System.out.println("Total nilai bobot adalah : " + totalBobot);
           if (totalBobot < 80){
               System.out.println("Tingkat: < 80");
               System.out.println("Tidak terindikasi mencurigakan");               
           } else if (totalBobot >= 80 && totalBobot < 150) {
               System.out.println("Tingkat 80 - 150");
               System.out.println("Terindikasi mencurigakan dengan level low");             
           } else if (totalBobot >= 151 && totalBobot <= 221) {
               System.out.println("Tingkat 151 - 221");
               System.out.println("Terindikasi mencurigakan dengan level medium");
           } else {
           System.out.println("Tingkat > 221");
           System.out.println("Terindikasi mencurigakan dengan level high");
       }
    }
    
}
