/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//PROGRAM REKURSIF PANGKAT
package uts.pbo6;

import java.util.Scanner;

/**
 *
 * @author Mono
 */

public class nomor2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai base    : ");
        int nilai = input.nextInt();
        System.out.print("Masukkan nilai pangkat : ");
        int pangkat = input.nextInt();
        
        int hasil = Perpangkatan(nilai, pangkat);
        System.out.println(nilai + " pangkat " + pangkat + " = " + hasil);
    }

    public static int Perpangkatan(int nil, int pk) {
        if (pk == 0) {
            return 1;
        } else {
            return nil * Perpangkatan(nil, pk - 1);
        }
        
    }
    
}
