package zoltankiss842.sorting.ComparisonSorts.BubbleSort;

import java.util.Comparator;

public class BubbleSortImproved {
    public byte[] sort(byte[] array, boolean ascending){

        if(array == null){
            throw new NullPointerException("Array was null, nothing to sort");
        }

        if(array.length == 0 || array.length == 1){
            return array;
        }

        for(int i = 0; i < array.length-1; ++i){
            boolean sorted = true;
            for(int j = 0; j < array.length-i-1; ++j){
                if( (array[j] > array[j+1] && ascending) ||
                        (array[j] < array[j+1] && !ascending)){
                    byte tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    sorted = false;
                }
            }

            if(sorted){
                return array;
            }
        }

        return array;
    }

    public short[] sort(short[] array, boolean ascending){

        if(array == null){
            throw new NullPointerException("Array was null, nothing to sort");
        }

        if(array.length == 0 || array.length == 1){
            return array;
        }

        for(int i = 0; i < array.length-1; ++i){
            boolean sorted = true;
            for(int j = 0; j < array.length-i-1; ++j){
                if( (array[j] > array[j+1] && ascending) ||
                        (array[j] < array[j+1] && !ascending)){
                    short tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    sorted = false;
                }
            }

            if(sorted){
                return array;
            }
        }

        return array;
    }

    public int[] sort(int[] array, boolean ascending){

        if(array == null){
            throw new NullPointerException("Array was null, nothing to sort");
        }

        if(array.length == 0 || array.length == 1){
            return array;
        }

        for(int i = 0; i < array.length-1; ++i){
            boolean sorted = true;
            for(int j = 0; j < array.length-i-1; ++j){
                if( (array[j] > array[j+1] && ascending) ||
                        (array[j] < array[j+1] && !ascending)){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    sorted = false;
                }
            }

            if(sorted){
                return array;
            }
        }

        return array;
    }

    public long[] sort(long[] array, boolean ascending){

        if(array == null){
            throw new NullPointerException("Array was null, nothing to sort");
        }

        if(array.length == 0 || array.length == 1){
            return array;
        }

        for(int i = 0; i < array.length-1; ++i){
            boolean sorted = true;
            for(int j = 0; j < array.length-i-1; ++j){
                if( (array[j] > array[j+1] && ascending) ||
                        (array[j] < array[j+1] && !ascending)){
                    long tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    sorted = false;
                }
            }

            if(sorted){
                return array;
            }
        }

        return array;
    }

    public float[] sort(float[] array, boolean ascending){

        if(array == null){
            throw new NullPointerException("Array was null, nothing to sort");
        }

        if(array.length == 0 || array.length == 1){
            return array;
        }

        for(int i = 0; i < array.length-1; ++i){
            boolean sorted = true;
            for(int j = 0; j < array.length-i-1; ++j){
                if( (array[j] > array[j+1] && ascending) ||
                        (array[j] < array[j+1] && !ascending)){
                    float tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    sorted = false;
                }
            }

            if(sorted){
                return array;
            }
        }

        return array;
    }

    public double[] sort(double[] array, boolean ascending){

        if(array == null){
            throw new NullPointerException("Array was null, nothing to sort");
        }

        if(array.length == 0 || array.length == 1){
            return array;
        }

        for(int i = 0; i < array.length-1; ++i){
            boolean sorted = true;
            for(int j = 0; j < array.length-i-1; ++j){
                if( (array[j] > array[j+1] && ascending) ||
                        (array[j] < array[j+1] && !ascending)){
                    double tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    sorted = false;
                }
            }

            if(sorted){
                return array;
            }
        }

        return array;
    }

    public char[] sort(char[] array, boolean ascending){

        if(array == null){
            throw new NullPointerException("Array was null, nothing to sort");
        }

        if(array.length == 0 || array.length == 1){
            return array;
        }

        for(int i = 0; i < array.length-1; ++i){
            boolean sorted = true;
            for(int j = 0; j < array.length-i-1; ++j){
                if( (array[j] > array[j+1] && ascending) ||
                        (array[j] < array[j+1] && !ascending)){
                    char tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    sorted = false;
                }
            }

            if(sorted){
                return array;
            }
        }

        return array;
    }

    public String[] sort(String[] array, boolean ascending){

        if(array == null){
            throw new NullPointerException("Array was null, nothing to sort");
        }

        if(array.length == 0 || array.length == 1){
            return array;
        }

        for(int i = 0; i < array.length-1; ++i){
            boolean sorted = true;
            for(int j = 0; j < array.length-i-1; ++j){
                if( (array[j].compareTo(array[j+1]) < 0 && ascending) ||
                        ((array[j].compareTo(array[j+1]) > 0 && !ascending)) ){
                    String tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    sorted = false;
                }
            }

            if(sorted){
                return array;
            }
        }

        return array;
    }

    public Object[] sort(Object[] array, boolean ascending, Comparator<Object> comparator){

        if(array == null){
            throw new NullPointerException("Array was null, nothing to sort");
        }

        if(array.length == 0 || array.length == 1){
            return array;
        }

        for(int i = 0; i < array.length-1; ++i){
            boolean sorted = true;
            for(int j = 0; j < array.length-i-1; ++j){
                if( (comparator.compare(array[j], array[j+1]) > 0 && ascending) ||
                        (comparator.compare(array[j], array[j+1]) < 0 && !ascending)){
                    Object tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    sorted = false;
                }
            }

            if(sorted){
                return array;
            }
        }

        return array;
    }
}
