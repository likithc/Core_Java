package com.xyz.basicsofprogramming.day24;

import java.util.Scanner;

class LinearSearch {
    private int arr[];
    private int size;
    Scanner sc = new Scanner(System.in);

    void createArray() {
        System.out.println("Array Creation");
        System.out.println("Enter the array size:");
        size = sc.nextInt();
        arr = new int[size];
        System.out.println("Array is ready");
        System.out.println("==================");
    }

    void addElements() {
        System.out.println("Collecting the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements added");
        System.out.println("===================");
    }

    void search() {
        System.out.println("Search started");
        System.out.println("Enter the element to be found:");
        int key = sc.nextInt();
        int flag = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                System.out.println("Key element found at position: " + (i + 1));
                flag++;
                break;
            }
        }

        if (flag == 0) {
            System.out.println("Element not found");
            System.out.println("===================");
        }
    }
}

public class LinearSearchAlgorithm {
    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        ls.createArray();
        ls.addElements();
        ls.search();
    }
}
