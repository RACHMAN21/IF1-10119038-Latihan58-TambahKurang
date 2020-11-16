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
 * Deskripsi Program : program ini berisi untuk menampilkan hasil perjumlah &
 *                     hasil selisih dari bilangan x & y
 * 
 */

public class Tester {
    public static void main(String[] args) {
        JumlahBilangan jmlBil = new JumlahBilangan();
        jmlBil.tampilHasilJumlah();
        
        SelisihBilangan selBil = new SelisihBilangan();
        selBil.tampilSelisih();
    }
}