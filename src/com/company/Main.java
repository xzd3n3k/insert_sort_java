package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public static int[] insertSort(int[] array){
        for (int x = 1; x < array.length; x++){
            int tmp = array[x];
            int i = x - 1;

            while (i >= 0 && tmp < array[i]){
                array[i+1] = array[i];
                i-=1;
            }

            array[i+1] = tmp;
        }
        return array;
    }
}
