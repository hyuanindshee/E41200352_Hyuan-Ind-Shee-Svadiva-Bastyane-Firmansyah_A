/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SelectionSort;

/**
 *
 * @author Asia Computer
 */
public class SelectionSort {
    
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
    
    public static void main(String a[]) {
        int[] arrl = {9,14,3,2,43,11,58,22};
        System.out.println("Before Selection Sort");
        for(int i:arrl) {
            System.out.print(i+" ");
        }
        System.out.println();
        
        selectionSort(arrl);//sorting array using selection sort
        
        System.out.println("After Selection Sort");
        for(int i:arrl) {
            System.out.print(i+" ");
        }
    }
}
