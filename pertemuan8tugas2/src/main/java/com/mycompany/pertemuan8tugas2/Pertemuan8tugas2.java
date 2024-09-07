/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan8tugas2;

/**
 *
 * @author Windows 11
 */
public class Pertemuan8tugas2 {

    public static void main(String[] args) {
        int tahunAwal = 1950;
        int tahunAkhir = 2015;

        System.out.println("Tahun Awal  ?: " + tahunAwal);
        System.out.println("Tahun Akhir ?: " + tahunAkhir);

        System.out.println("Hasilnya:");

         for (int tahun = tahunAkhir; tahun >= tahunAwal; tahun--) {
            System.out.println(tahun);
        }
    }
}