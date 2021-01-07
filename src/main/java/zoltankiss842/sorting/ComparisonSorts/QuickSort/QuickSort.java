package zoltankiss842.sorting.ComparisonSorts.QuickSort;

import zoltankiss842.sorting.ComparisonSorts.BubbleSort.BubbleSortImproved;

import java.lang.reflect.Array;
import java.util.*;

public class QuickSort {

    public static final int FIRST_ELEMENT_PIVOT = 0;
    public static final int LAST_ELEMENT_PIVOT = 1;
    public static final int CENTER_ELEMENT_PIVOT = 2;
    public static final int RANDOM_ELEMENT_PIVOT = 3;
    public static final int MEDIAN_ELEMENT_PIVOT = 4;
    public static final int RANDOM_MEDIAN_ELEMENT_PIVOT = 5;

    public byte[] sort(byte[] array, int startIndex, int endIndex, int partitionType, boolean ascending){
        if(startIndex < endIndex){

            int pivot = partition(array, startIndex, endIndex, partitionType, ascending);

            sort(array, startIndex, pivot-1, partitionType, ascending);
            sort(array, pivot+1, endIndex, partitionType, ascending);
        }

        return array;

    }

    private int partition(byte[] array, int startIndex, int endIndex, int partitionType, boolean ascending) {
        switch (partitionType){
            case 0:
                return firstElementPartition(array, startIndex, endIndex, ascending);
            case 1:
                return lastElementPartition(array, startIndex, endIndex, ascending);
            case 2:
                return centerElementPartition(array, startIndex, endIndex, ascending);
            case 3:
                return randomElementPartition(array, startIndex, endIndex, ascending);
            case 4:
                return medianElementPartition(array, startIndex, endIndex, ascending);
            case 5:
                return randomMedianElementPartition(array, startIndex, endIndex, ascending);
            default:
                return firstElementPartition(array, startIndex, endIndex, ascending);
        }
    }

    private int firstElementPartition(byte[] array, int startIndex, int endIndex, boolean ascending) {
        byte pivot = array[startIndex];

        int i = startIndex+1;

        for(int j = startIndex+1; j <= endIndex; ++j){
            if(array[j] < pivot && ascending){
                byte temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                ++i;
            }

            if(array[j] > pivot && !ascending){
                byte temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                ++i;
            }
        }

        byte temp = array[startIndex];
        array[startIndex] = array[i-1];
        array[i-1] = temp;

        return i - 1;
    }

    private int lastElementPartition(byte[] array, int startIndex, int endIndex, boolean ascending) {
        byte pivot = array[endIndex];

        int i = startIndex-1;

        for(int j = startIndex; j <= endIndex; ++j){
            if(array[j] < pivot && ascending){
                ++i;
                byte temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

            if(array[j] > pivot && !ascending){
                ++i;
                byte temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        byte temp = array[endIndex];
        array[endIndex] = array[i+1];
        array[i+1] = temp;

        return i + 1;
    }

    private int centerElementPartition(byte[] array, int startIndex, int endIndex, boolean ascending) {
        int center = array.length/2;

        byte temp = array[center];
        array[center] = array[startIndex];
        array[startIndex] = temp;

        return firstElementPartition(array, startIndex, endIndex, ascending);
    }

    private int randomElementPartition(byte[] array, int startIndex, int endIndex, boolean ascending) {

        Random rnd = new Random();

        int pivotIndex = rnd.nextInt(endIndex-startIndex);

        byte temp = array[pivotIndex];
        array[pivotIndex] = array[startIndex];
        array[startIndex] = temp;

        return firstElementPartition(array, startIndex, endIndex, ascending);
    }

    private int medianElementPartition(byte[] array, int startIndex, int endIndex, boolean ascending) {
        TreeMap<Byte, Integer> map = new TreeMap<>();
        map.put(array[startIndex], startIndex);
        map.put(array[array.length/2], array.length/2);
        map.put(array[endIndex], endIndex);

        ArrayList<Integer> values = new ArrayList<>(map.values());

        byte temp = array[startIndex];
        array[startIndex] = array[values.get(1)];
        array[values.get(1)] = temp;

        return firstElementPartition(array, startIndex, endIndex, ascending);
    }

    private int randomMedianElementPartition(byte[] array, int startIndex, int endIndex, boolean ascending) {
        Random rnd = new Random();
        HashSet<Integer> set = new HashSet<>();

        // TODO If the number of choices is less then 3, it will run forever
        while(set.size() != 3){
            int index = rnd.nextInt(endIndex-startIndex);
            set.add(index);
        }

        Integer[] setArray = (Integer[]) set.toArray();

        TreeMap<Byte, Integer> map = new TreeMap<>();
        map.put(array[setArray[0]], setArray[0]);
        map.put(array[setArray[1]], setArray[1]);
        map.put(array[setArray[2]], setArray[2]);

        ArrayList<Integer> values = new ArrayList<>(map.values());

        byte temp = array[startIndex];
        array[startIndex] = array[values.get(1)];
        array[values.get(1)] = temp;

        return firstElementPartition(array, startIndex, endIndex, ascending);
    }
}
