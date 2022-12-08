/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class BMI2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String mengulang;
     do{Scanner input = new Scanner(System.in);
         System.out.println("=====Test BMI=====");
         System.out.println("jenis kelamin anda");
         System.out.println("1.laki-laki");
         System.out.println("2.perempuan");
         String kelamin = input.nextLine();
         System.out.println("");
         System.out.println("masukkan berat badan anda");
         int berat = input.nextInt();
         System.out.println("masukkan tinggi badan anda dalam meter");
         System.out.println("contoh 1.6");
         float tinggi = input.nextFloat();
         
         double bmi = berat / (tinggi*tinggi);
         System.out.println("BMI anda seberat "+bmi);
         if (bmi <= 19){
             System.out.println("anda terlalu kurus");
         }else if (bmi <= 27){
             System.out.println("normal");
         }else if (bmi <= 30){
             System.out.println("kelebihan berat badan");
         }else if (bmi <= 35){
             System.out.println("obesitas");
         }else if (bmi <= 40){
             System.out.println("obesitas berlebih");
         }
         System.out.println("");
         System.out.println("ulang ?");
         mengulang = input.next();
     }while (mengulang.equals("ya"));
     }
}
