package zoltankiss842.sorting.ComparisonSorts.BubbleSort;

import java.util.Comparator;

public class BubbleSortRecursive {

    public byte[] sort(byte[] array, int arrayLength, boolean ascending) {

        if (array == null) {
            throw new NullPointerException("Array was null, nothing to sort");
        }

        if (arrayLength == 0 || arrayLength == 1) {
            return array;
        }

        for (int i = 0; i < arrayLength - 1; ++i) {
            if ((array[i] > array[i + 1] && ascending) ||
                    (array[i] < array[i + 1] && !ascending)) {
                byte tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
            }
        }

        return sort(array, arrayLength - 1, ascending);
    }

    public short[] sort(short[] array, int arrayLength, boolean ascending) {

        if (array == null) {
            throw new NullPointerException("Array was null, nothing to sort");
        }

        if (arrayLength == 0 || arrayLength == 1) {
            return array;
        }

        for (int i = 0; i < arrayLength - 1; ++i) {
            if ((array[i] > array[i + 1] && ascending) ||
                    (array[i] < array[i + 1] && !ascending)) {
                short tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
            }
        }

        return sort(array, arrayLength - 1, ascending);
    }

    public int[] sort(int[] array, int arrayLength, boolean ascending) {

        if (array == null) {
            throw new NullPointerException("Array was null, nothing to sort");
        }

        if (arrayLength == 0 || arrayLength == 1) {
            return array;
        }

        for (int i = 0; i < arrayLength - 1; ++i) {
            if ((array[i] > array[i + 1] && ascending) ||
                    (array[i] < array[i + 1] && !ascending)) {
                int tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
            }
        }

        return sort(array, arrayLength - 1, ascending);
    }

    public long[] sort(long[] array, int arrayLength, boolean ascending) {

        if (array == null) {
            throw new NullPointerException("Array was null, nothing to sort");
        }

        if (arrayLength == 0 || arrayLength == 1) {
            return array;
        }

        for (int i = 0; i < arrayLength - 1; ++i) {
            if ((array[i] > array[i + 1] && ascending) ||
                    (array[i] < array[i + 1] && !ascending)) {
                long tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
            }
        }

        return sort(array, arrayLength - 1, ascending);
    }

    public float[] sort(float[] array, int arrayLength, boolean ascending) {

        if (array == null) {
            throw new NullPointerException("Array was null, nothing to sort");
        }

        if (arrayLength == 0 || arrayLength == 1) {
            return array;
        }

        for (int i = 0; i < arrayLength - 1; ++i) {
            if ((array[i] > array[i + 1] && ascending) ||
                    (array[i] < array[i + 1] && !ascending)) {
                float tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
            }
        }

        return sort(array, arrayLength - 1, ascending);
    }

    public double[] sort(double[] array, int arrayLength, boolean ascending) {

        if (array == null) {
            throw new NullPointerException("Array was null, nothing to sort");
        }

        if (arrayLength == 0 || arrayLength == 1) {
            return array;
        }

        for (int i = 0; i < arrayLength - 1; ++i) {
            if ((array[i] > array[i + 1] && ascending) ||
                    (array[i] < array[i + 1] && !ascending)) {
                double tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
            }
        }

        return sort(array, arrayLength - 1, ascending);
    }

    public char[] sort(char[] array, int arrayLength, boolean ascending) {

        if (array == null) {
            throw new NullPointerException("Array was null, nothing to sort");
        }

        if (arrayLength == 0 || arrayLength == 1) {
            return array;
        }

        for (int i = 0; i < arrayLength - 1; ++i) {
            if ((array[i] > array[i + 1] && ascending) ||
                    (array[i] < array[i + 1] && !ascending)) {
                char tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
            }
        }

        return sort(array, arrayLength - 1, ascending);
    }

    public String[] sort(String[] array, int arrayLength, boolean ascending) {

        if (array == null) {
            throw new NullPointerException("Array was null, nothing to sort");
        }

        if (arrayLength == 0 || arrayLength == 1) {
            return array;
        }

        for (int i = 0; i < arrayLength - 1; ++i) {
            if ((array[i + 1].compareTo(array[i]) > 0 && ascending) ||
                    ((array[i + 1].compareTo(array[i]) < 0 && !ascending))) {
                String tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
            }
        }


        return sort(array, arrayLength - 1, ascending);
    }

    public Object[] sort(Object[] array, int arrayLength, boolean ascending, Comparator<Object> comparator) {

        if (array == null) {
            throw new NullPointerException("Array was null, nothing to sort");
        }

        if (arrayLength == 0 || arrayLength == 1) {
            return array;
        }

        for (int i = 0; i < arrayLength - 1; ++i) {
            if ((comparator.compare(array[i], array[i + 1]) > 0 && ascending) ||
                    (comparator.compare(array[i], array[i + 1]) < 0 && !ascending)) {
                Object tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
            }
        }


        return sort(array, arrayLength - 1, ascending, comparator);
    }
}
