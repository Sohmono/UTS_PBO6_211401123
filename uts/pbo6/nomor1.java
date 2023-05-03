/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts.pbo6;

import java.util.Scanner;

/**
 *
 * @author Mono
 */

class mobil{
    String nama;
    boolean on;
    boolean gas;
    int kecepatan;
    int tempkecepatan; //untuk menyimpan nilai awal kecepatan, karena nilai nya akan diubah2
    String gear; // ada 3 gear, maju mundur dan netral
    String gasGear;
    String arah;
    boolean rem;
    
    mobil (String nama, boolean on, boolean gas, int kecepatan, String gear, String arah, boolean rem){
        this.nama = nama;
        this.on = on;
        this.gas = gas;
        this.kecepatan = kecepatan;
        this.gear = gear;
        this.arah = arah;
        this.rem = rem;
        this.tempkecepatan = kecepatan;
        
    }
    
    void turnOn(){
        on = !on; //biar kalau dipanggil lagi, on berganti nilai, mirip on/off versi tombol
        if(on == false || gear.equals("Netral")){ //memastikan apakah gear nya Netral atau tidak
            kecepatan = 0;
        }else{
            kecepatan = tempkecepatan;
        }
    }
    
    void pressRem(){
        rem = !rem;
        if(rem == true || gear.equals("Netral")){
            kecepatan = 0;
        }else{
            kecepatan = tempkecepatan;
        }
    }
    
    void remStat(boolean Trem){
        if(Trem == true){
            System.out.println("Tombol Rem sedang ditekan");
        }else{
            System.out.println("Tombol Rem sedang dilepas");
        }
    }
    
    void pressGas(){
       gas=!gas;
       if(gear == null){
           System.out.println("Input Gear dulu");
       }else{
           System.out.println("Mobil di Gas & "+gasGear);
       }
    }
    
    void gasStat(boolean Tgas){
        if(Tgas == true){
            System.out.println("Tombol Gas sedang ditekan");
        }else{
            System.out.println("Tombol Gas sedang dilepas");
        }
    }
    
    void chooseGear(int pilih){
        switch(pilih){
            case 1 : 
                gasGear = "Bergerak Kedepan";
                gear = "Maju";
                break;
            case 2 :
                gasGear = "Mode Netral";
                kecepatan = 0;
                gear = "Netral";
                break;
            case 3 :
                gasGear = "Bergerak Kebelakang";
                gear = "Mundur";
                break;
            default :
                System.out.println("Input Gear sesuai arahan");
        }
    }
    
    void arahKiri(){
        if(on==false){
            System.out.println("Status mobil masih Off");
        }
//        }else{
//            System.out.println("Mobil belok ke kiri");
//        }
        arah = "Kiri";
    }
    
    void arahKanan(){
        if(on==false){
            System.out.println("Status mobil masih Off");
        }
        arah = "Kanan";
    }
    
    void arahLurus(){
        if(on==false){
            System.out.println("Status mobil masih Off");
        }
        arah = "Lurus";
    }
    
    void print(){
        System.out.println("+===========================+");
        System.out.println("Mobil     : "+nama);
        System.out.println("On        : "+on);
        System.out.println("Gear      : "+gear);
        System.out.println("Arah      : "+arah);
        System.out.println("Kecepatan : "+kecepatan);
        gasStat(on);
        remStat(rem);
        System.out.println("+===========================+");
    }
    
}

public class nomor1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        mobil mobil1 = new mobil("GTR35",false,false, 50, "", "", false);
        
        
        mobil1.turnOn();
        mobil1.arahLurus();
        
        
        System.out.println("Masukkan Gear ");//proses pemilihan gear
        System.out.println("1. Maju");
        System.out.println("2. Netral");
        System.out.println("3. Mundur");
        System.out.print("==> ");
        int choose = input.nextInt();
        mobil1.chooseGear(choose);
        
        
        mobil1.pressRem();
        mobil1.pressRem();
        
        mobil1.print();
        
        mobil1.arahKanan();
        mobil1.print();
    }
    
}
