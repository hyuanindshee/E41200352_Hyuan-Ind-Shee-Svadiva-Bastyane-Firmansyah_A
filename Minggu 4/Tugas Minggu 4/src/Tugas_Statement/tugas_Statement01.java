/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Statement;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class tugas_Statement01 {
    
    public static void main(String[] args) {
        
        String awal = JOptionPane.showInputDialog("Masukkan Batas Nilai Awal) =");
        String akhir = JOptionPane.showInputDialog("Masukkan Batas Nilau akhir) =");
        int genap = Integer.parseInt(awal);
        int genap1 = Integer.parseInt(akhir);
        
        for(int i = 1; i <= 10; i++)
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
    }
}
