package com.example.springboot.services;

import java.util.ArrayList;
import java.util.Arrays;

public class SortService {
    private int array[];

    public SortService(int array[]) {
        this.array = array;
    }

    public Integer[] sort() {
        return this.insertionSort(this.array);
    }

    private ArrayList<Integer> arrayToArrayList(int array[]) {
        ArrayList<Integer> newArray = new ArrayList<Integer>();

        for (int i : array) {
            newArray.add(i);
        }

        return newArray;
    }

    private Integer[] insertionSort(int array[]) {
        ArrayList<Integer> original = this.arrayToArrayList(array);
        ArrayList<Integer> sorted = new ArrayList<Integer>();
        
        for(int i = 0; i < original.size(); i++) {
            int atual = original.get(i);

            sorted = this.insert(sorted, atual);
        }

        return sorted.toArray(new Integer[0]);
    }

    private ArrayList<Integer> insert(ArrayList<Integer> array, int element) {
        int i = 0;

        if (array.size() == 0) {
            array.add(0,element);
            return array;
        }

        int atual = array.get(i);

        while (element > atual) {
            i++;
            atual = array.get(i);
        }

        array.add(i, element);

        return array;
    }
}
