//PRG 452 Object Oriented Programming III
// Jerrie Pineda
//Courtnee Sullivan
// Week 3 Assignment
//pg 837 problem E18.6

package com.company;
import java.util.Arrays;
import java.util.Comparator;

class MergeSort {

    public static void main(String[] args) {
        // this is sorting integers
        Integer[] intArr = new Integer[] { 20, 32, 16, 12, 40 };
        Comparator<Integer> intComp = new Comparator<Integer>() {
            public int compare(Integer d1, Integer d2) {
                return d1.compareTo(d2);
            }
        };
        System.out.println("Before Sorting :" + Arrays.toString(intArr));
        MergeSorter.sort(intArr, intComp);
        System.out.println("After Sorting :" + Arrays.toString(intArr));

        // this is sorting characters
        Character[] charArr = new Character[] { 'a', 'k', 's', 'z', 'j', 'k' };
        Comparator<Character> comp = new Comparator<Character>() {
            public int compare(Character d1, Character d2) {
                return d1.compareTo(d2);
            }
        };
        System.out.println("Before Sorting :" + Arrays.toString(charArr));
        MergeSorter.sort(charArr, comp);
        System.out.println("After Sorting :" + Arrays.toString(charArr));

    }
}
