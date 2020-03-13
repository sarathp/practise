package com.practise.ik.sorting;
/**
 * 
 * @author sarat.polavarap
 *      10
 *      /\
 *     9  11
 *    /\   / \
 *   6  5 7   8
 *
 *
 */
public class HeapSort3 {

    public static void main(String[] args) {
        int[] arr = {10, 9, 11, 6, 5, 7, 8};
        sort(arr);
    }
    
    private static void sort(int[] arr) {
        int n = arr.length;
        int klarget =3; //Target largest
        System.out.println("Given Element:");
        print(arr);
        //Step1: Heapify non-leaf nodes (incyluding root node)
        for(int i=n/2-1; i>=0; i--) {
            heapify(arr, n, i);
        }
        System.out.println("\nAfter Heapify:");
        print(arr);
        
        int k=1;
       //Step 2: Extract root node and swap with last array index
        for(int i=n-1; i>=0; i--) {
            if(k== klarget) {
                System.out.println("\n-->"+klarget + " - largest element is: "+ arr[0]);
            }
            k++;
            swap(arr, i, 0);
            heapify(arr, i, 0);
        }
        
        
        System.out.println("\nAfter Heap Sort:");
        print(arr);
        
        
    }
    
    private static void print(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    
    private static void heapify(int[] arr, int n, int i) {
        int pni = i;
        int lci = 2*i+1;
        int rci = 2*i+2;
        
        if(lci< n && arr[lci]>arr[pni]) {
            pni = lci;
        }
        
        if(rci<n && arr[rci]> arr[pni]) {
            pni = rci;
        }
        
        if(pni!= i) {
            swap(arr, i, pni); 
            //heapify upto root node
            heapify(arr, n, pni);
        }
        
        
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
