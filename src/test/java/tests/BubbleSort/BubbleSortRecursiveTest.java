package tests.BubbleSort;

import data.Person;
import data.PersonComparator;
import data.TestData;
import org.junit.Before;
import org.junit.Test;
import zoltankiss842.sorting.ComparisonSorts.BubbleSort.BubbleSortRecursive;

import java.util.Comparator;

import static junit.framework.Assert.assertTrue;

public class BubbleSortRecursiveTest {

    private Person[] people;
    private PersonComparator comparator;
    private BubbleSortRecursive bubbleSortRecursive;

    @Before
    public void setUp(){
        people = new Person[]{
                new Person("John", "Smith", 56, "AAAAA"),
                new Person("Jane", "Doe", 28, "AAAAB"),
                new Person("Claire", "McKanzie", 36, "AAAAC"),
                new Person("Max", "Payne", 64, "AAAAD"),
                new Person("Elenore", "Balder", 37, "AAAAE"),
        };

        comparator = new PersonComparator();

        bubbleSortRecursive = new BubbleSortRecursive();
    }

    // ------ BYTE ------

    @Test
    public void sortByteAscending(){
        byte[] array = bubbleSortRecursive.sort(TestData.SMALL_BYTE_ARRAY, TestData.SMALL_BYTE_ARRAY.length, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortByteDescending(){
        byte[] array = bubbleSortRecursive.sort(TestData.SMALL_BYTE_ARRAY, TestData.SMALL_BYTE_ARRAY.length, false);
        assertTrue(checkIfSorted(array, false));
    }

    @Test(expected = NullPointerException.class)
    public void sortByteIfArrayIsNull(){
        byte[] array = bubbleSortRecursive.sort((byte[])null, 0, true);
    }

    @Test
    public void sortByteIfArrayIsEmpty(){
        byte[] temp = {};
        byte[] array = bubbleSortRecursive.sort(temp, temp.length, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortByteIfArrayIsOne(){
        byte[] temp = {54};
        byte[] array = bubbleSortRecursive.sort(temp, temp.length, true);
        assertTrue(checkIfSorted(array, true));
    }

    private boolean checkIfSorted(byte[] array, boolean ascending){
        if(array.length == 0 || array.length == 1){
            return true;
        }

        for(int i = 1; i < array.length; ++i){
            if((array[i-1] > array[i] && ascending) || (array[i-1] < array[i] && !ascending) ) return false;
        }

        return true;
    }

    // ------ SHORT ------

    @Test
    public void sortShortAscending(){
        short[] array = bubbleSortRecursive.sort(TestData.SMALL_SHORT_ARRAY, TestData.SMALL_SHORT_ARRAY.length,true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortShortDescending(){
        short[] array = bubbleSortRecursive.sort(TestData.SMALL_SHORT_ARRAY, TestData.SMALL_SHORT_ARRAY.length, false);
        assertTrue(checkIfSorted(array, false));
    }

    @Test(expected = NullPointerException.class)
    public void sortShortIfArrayIsNull(){
        short[] array = bubbleSortRecursive.sort((short[])null, 0, true);
    }

    @Test
    public void sortShortIfArrayIsEmpty(){
        short[] temp = {};
        short[] array = bubbleSortRecursive.sort(temp, temp.length, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortShortIfArrayIsOne(){
        short[] temp = {54};
        short[] array = bubbleSortRecursive.sort(temp, temp.length, true);
        assertTrue(checkIfSorted(array, true));
    }

    private boolean checkIfSorted(short[] array, boolean ascending){
        if(array.length == 0 || array.length == 1){
            return true;
        }

        for(int i = 1; i < array.length; ++i){
            if((array[i-1] > array[i] && ascending) || (array[i-1] < array[i] && !ascending) ) return false;
        }

        return true;
    }

    // ------ INTEGER ------

    @Test
    public void sortIntAscending(){
        int[] array = bubbleSortRecursive.sort(TestData.SMALL_INT_ARRAY, TestData.SMALL_INT_ARRAY.length, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortIntDescending(){
        int[] array = bubbleSortRecursive.sort(TestData.SMALL_INT_ARRAY, TestData.SMALL_INT_ARRAY.length, false);
        assertTrue(checkIfSorted(array, false));
    }

    @Test(expected = NullPointerException.class)
    public void sortIntIfArrayIsNull(){
        int[] array = bubbleSortRecursive.sort((int[])null, 0, true);
    }

    @Test
    public void sortIntIfArrayIsEmpty(){
        int[] temp = {};
        int[] array = bubbleSortRecursive.sort(temp, temp.length, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortIntIfArrayIsOne(){
        int[] temp = {54};
        int[] array = bubbleSortRecursive.sort(temp, temp.length, true);
        assertTrue(checkIfSorted(array, true));
    }

    private boolean checkIfSorted(int[] array, boolean ascending){
        if(array.length == 0 || array.length == 1){
            return true;
        }

        for(int i = 1; i < array.length; ++i){
            if((array[i-1] > array[i] && ascending) || (array[i-1] < array[i] && !ascending) ) return false;
        }

        return true;
    }

    // ------ LONG ------

    @Test
    public void sortLongAscending(){
        long[] array = bubbleSortRecursive.sort(TestData.SMALL_LONG_ARRAY, TestData.SMALL_LONG_ARRAY.length,true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortLongDescending(){
        long[] array = bubbleSortRecursive.sort(TestData.SMALL_LONG_ARRAY, TestData.SMALL_LONG_ARRAY.length, false);
        assertTrue(checkIfSorted(array, false));
    }

    @Test(expected = NullPointerException.class)
    public void sortLongIfArrayIsNull(){
        long[] array = bubbleSortRecursive.sort((long[])null, 0, true);
    }

    @Test
    public void sortLongIfArrayIsEmpty(){
        long[] temp = {};
        long[] array = bubbleSortRecursive.sort(temp, temp.length, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortLongIfArrayIsOne(){
        long[] temp = {54546};
        long[] array = bubbleSortRecursive.sort(temp, temp.length, true);
        assertTrue(checkIfSorted(array, true));
    }

    private boolean checkIfSorted(long[] array, boolean ascending){
        if(array.length == 0 || array.length == 1){
            return true;
        }

        for(int i = 1; i < array.length; ++i){
            if((array[i-1] > array[i] && ascending) || (array[i-1] < array[i] && !ascending) ) return false;
        }

        return true;
    }

    // ------ FLOAT ------

    @Test
    public void sortFloatAscending(){
        float[] array = bubbleSortRecursive.sort(TestData.SMALL_FLOAT_ARRAY, TestData.SMALL_FLOAT_ARRAY.length, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortFloatDescending(){
        float[] array = bubbleSortRecursive.sort(TestData.SMALL_FLOAT_ARRAY, TestData.SMALL_FLOAT_ARRAY.length, false);
        assertTrue(checkIfSorted(array, false));
    }

    @Test(expected = NullPointerException.class)
    public void sortFloatIfArrayIsNull(){
        float[] array = bubbleSortRecursive.sort((float[])null, 0, true);
    }

    @Test
    public void sortFloatIfArrayIsEmpty(){
        float[] temp = {};
        float[] array = bubbleSortRecursive.sort(temp, temp.length, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortFloatIfArrayIsOne(){
        float[] temp = {0.36987f};
        float[] array = bubbleSortRecursive.sort(temp, temp.length, true);
        assertTrue(checkIfSorted(array, true));
    }

    private boolean checkIfSorted(float[] array, boolean ascending){
        if(array.length == 0 || array.length == 1){
            return true;
        }

        for(int i = 1; i < array.length; ++i){
            if((array[i-1] > array[i] && ascending) || (array[i-1] < array[i] && !ascending) ) return false;
        }

        return true;
    }

    // ------ DOUBLE ------

    @Test
    public void sortDoubleAscending(){
        double[] array = bubbleSortRecursive.sort(TestData.SMALL_DOUBLE_ARRAY, TestData.SMALL_DOUBLE_ARRAY.length, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortDoubleDescending(){
        double[] array = bubbleSortRecursive.sort(TestData.SMALL_DOUBLE_ARRAY, TestData.SMALL_DOUBLE_ARRAY.length,false);
        assertTrue(checkIfSorted(array, false));
    }

    @Test(expected = NullPointerException.class)
    public void sortDoubleIfArrayIsNull(){
        double[] array = bubbleSortRecursive.sort((double[])null, 0,true);
    }

    @Test
    public void sortDoubleIfArrayIsEmpty(){
        double[] temp = {};
        double[] array = bubbleSortRecursive.sort(temp, temp.length, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortDoubleIfArrayIsOne(){
        double[] temp = {0.36987};
        double[] array = bubbleSortRecursive.sort(temp, temp.length, true);
        assertTrue(checkIfSorted(array, true));
    }

    private boolean checkIfSorted(double[] array, boolean ascending){
        if(array.length == 0 || array.length == 1){
            return true;
        }

        for(int i = 1; i < array.length; ++i){
            if((array[i-1] > array[i] && ascending) || (array[i-1] < array[i] && !ascending) ) return false;
        }

        return true;
    }

    // ------ CHAR ------

    @Test
    public void sortCharAscending(){
        char[] array = bubbleSortRecursive.sort(TestData.SMALL_CHAR_ARRAY, TestData.SMALL_CHAR_ARRAY.length, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortCharDescending(){
        char[] array = bubbleSortRecursive.sort(TestData.SMALL_CHAR_ARRAY, TestData.SMALL_CHAR_ARRAY.length, false);
        assertTrue(checkIfSorted(array, false));
    }

    @Test(expected = NullPointerException.class)
    public void sortCharIfArrayIsNull(){
        char[] array = bubbleSortRecursive.sort((char[])null, 0, true);
    }

    @Test
    public void sortCharIfArrayIsEmpty(){
        char[] temp = {};
        char[] array = bubbleSortRecursive.sort(temp, temp.length, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortCharIfArrayIsOne(){
        char[] temp = {'p'};
        char[] array = bubbleSortRecursive.sort(temp, temp.length, true);
        assertTrue(checkIfSorted(array, true));
    }

    private boolean checkIfSorted(char[] array, boolean ascending){
        if(array.length == 0 || array.length == 1){
            return true;
        }

        for(int i = 1; i < array.length; ++i){
            if((array[i-1] > array[i] && ascending) || (array[i-1] < array[i] && !ascending) ) return false;
        }

        return true;
    }

    // ------ STRING ------

    @Test
    public void sortStringAscending(){
        String[] array = bubbleSortRecursive.sort(TestData.SMALL_STRING_ARRAY, TestData.SMALL_STRING_ARRAY.length, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortStringDescending(){
        String[] array = bubbleSortRecursive.sort(TestData.SMALL_STRING_ARRAY, TestData.SMALL_STRING_ARRAY.length, false);
        assertTrue(checkIfSorted(array, false));
    }

    @Test(expected = NullPointerException.class)
    public void sortStringIfArrayIsNull(){
        String[] array = bubbleSortRecursive.sort((String[])null, 0, true);
    }

    @Test
    public void sortStringIfArrayIsEmpty(){
        String[] temp = {};
        String[] array = bubbleSortRecursive.sort(temp, temp.length, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortStringIfArrayIsOne(){
        String[] temp = {"test"};
        String[] array = bubbleSortRecursive.sort(temp, temp.length, true);
        assertTrue(checkIfSorted(array, true));
    }

    private boolean checkIfSorted(String[] array, boolean ascending){
        if(array.length == 0 || array.length == 1){
            return true;
        }

        for(int i = 1; i < array.length; ++i){
            if((array[i-1].compareTo(array[i]) < 0  && ascending) || (array[i-1].compareTo(array[i]) > 0  && !ascending) ) return false;
        }

        return true;
    }

    // ------ OBJECT ------

    @Test
    public void sortObjectAscending(){
        Object[] array = bubbleSortRecursive.sort(people, people.length, true, comparator);
        assertTrue(checkIfSorted(array, true, comparator));
    }

    @Test
    public void sortObjectDescending(){
        Object[] array = bubbleSortRecursive.sort(people, people.length, false, comparator);
        assertTrue(checkIfSorted(array, false, comparator));
    }

    @Test(expected = NullPointerException.class)
    public void sortObjectIfArrayIsNull(){
        Object[] array = bubbleSortRecursive.sort((Object[])null, 0, true, comparator);
    }

    @Test
    public void sortObjectIfArrayIsEmpty(){
        Object[] temp = {};
        Object[] array = bubbleSortRecursive.sort(temp, temp.length, true, comparator);
        assertTrue(checkIfSorted(array, true, comparator));
    }

    @Test
    public void sortObjectIfArrayIsOne(){
        Object[] temp = new Person[]{new Person("John", "Smith", 56, "AAAAA")};
        Object[] array = bubbleSortRecursive.sort(temp, temp.length, true, comparator);
        assertTrue(checkIfSorted(array, true, comparator));
    }

    private boolean checkIfSorted(Object[] array, boolean ascending, Comparator<Object> comparator){
        if(array.length == 0 || array.length == 1){
            return true;
        }

        for(int i = 1; i < array.length; ++i){
            if(comparator.compare(array[i-1], array[i]) > 0  && ascending || comparator.compare(array[i-1], array[i]) < 0  && !ascending)  return false;
        }

        return true;
    }
}
