/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.rachman.tambahkurang;

/**
 * 
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : program ini berisi class SelisihBilangan
 * 
 */

public class SelisihBilangan extends Bilangan {
    
    public void tampilSelisih() {
        int a, b;
        a = getX();
        b = getY();
        int result = a - b;
        System.out.println("Hasil Selisih " + a + " - " + b + " = " + result);
    }
}