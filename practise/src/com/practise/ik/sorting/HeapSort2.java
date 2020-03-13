package com.practise.ik.sorting;

public class HeapSort2 {

    public static void main(String[] args) {
        //int[] arr =  {10, 13, 12, 11, 9, 6, 7, 5} ;
        int arr[] = {12, 11, 13, 6, 5, 7}; 
        sort(arr);
           
    }
    
    public static void sort(int[] arr) {
        int n = arr.length;
        
        System.out.println("Given arry is:");
        print(arr);
        //Build Heap
        for(int i =n/2 -1; i>=0; i--) {
            heapify(arr, n, i);
        }
        System.out.println("\nAfter heapify:");
        print(arr);
        
        //Extract Elements from Heap
        for(int i=n-1; i>=0; i--) {
            swap(arr, i, 0);
            heapify(arr, i, 0);
            
        }
        
        System.out.println("\nAfter Heap Sort:");
        print(arr);
        
    }
    
    private static void print(int[] arr) {
        for(int i=0; i<arr.length; i++ ) {
            System.out.print(arr[i]+ " " );
        }
    }
    
    
    
    public static void heapify(int[] arr, int n, int i) {
        int pni = i;
        int lci = 2*i+1;
        int rci = 2*i+2;
        
        if (lci <n && arr[lci]> arr[pni]) {
            pni = lci;
        }
        
        if(rci< n && arr[rci] > arr[pni]) {
            pni = rci;
        }
        
        if(i != pni) {
            swap (arr, pni, i);
            heapify(arr, n, pni);
        }
        
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
    
    

}
