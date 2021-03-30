/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Statement;

/**
 *
 * @author HP
 */
public class tugas_Statement02 {
    
    public static void main(String[] args) {
        
        System.out.println("          DO_While          ");
        System.out.println("Bilangan kelipatan 2 (1-100)");
        System.out.println("============================");
          int i = 1;
        do{
            i = i * 2;
           System.out.print(i + " ");
        if( i == 64 )break;
        } while (true);
    } 
}
