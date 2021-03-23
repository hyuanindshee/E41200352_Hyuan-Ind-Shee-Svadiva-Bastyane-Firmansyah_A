/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Minggu3;

/**
 *
 * @author HP
 */
public class Tugas_Array03 {
    
    public static void main(String[] args) {
        
        int [][] angka = {{2,4,6,8},{3,5,7,9},{2,4,8,12},{1,4,9,15}};
        for (int baris = 0; baris < 4; baris++) {
            for (int kolom = 0; kolom < 4; kolom++) {
                System.out.print(angka[baris][kolom]+" ");
            }
            System.out.println("");
        }
    } 
}
