/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan48.kalkulator;

import java.util.Scanner;
import model.Kalkulator;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk menghitung nilai dengan
 * menggunakan program kalkulator sederhana
 */
public class PBOIF210119064Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //inisialisasi objek Kalkulator
        Kalkulator kalkulator = new Kalkulator();
        
        //input
        kalkulator.setValue1(7);
        kalkulator.setValue2(5);
        
        //output
        System.out.println("VALUE 1 = " + kalkulator.getValue1());
        System.out.println("VALUE 2 = " + kalkulator.getValue2());
        kalkulator.setNameProject();
        kalkulator.setNoteProject("This project show you how to manage method in java");
        System.out.println("Result Add is  = " + kalkulator.add(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.println("Result Minus is  = " + kalkulator.minus(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.println("Result Multiple is  = " + kalkulator.multiplication(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.println("Result Division is  = " + kalkulator.division(kalkulator.getValue1(), kalkulator.getValue2()));
    }
    
}
