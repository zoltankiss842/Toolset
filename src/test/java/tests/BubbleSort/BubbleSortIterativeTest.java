package tests.BubbleSort;

import data.TestData;
import data.Person;
import data.PersonComparator;
import org.junit.Before;
import org.junit.Test;
import zoltankiss842.sorting.ComparisonSorts.BubbleSort.BubbleSortIterative;

import java.util.Comparator;

import static junit.framework.Assert.assertTrue;

public class BubbleSortIterativeTest {

    private Person[] people;
    private PersonComparator comparator;
    private BubbleSortIterative bubbleSortIterative;

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

        bubbleSortIterative = new BubbleSortIterative();
    }

    // ------ BYTE ------

    @Test
    public void sortByteAscending(){
        byte[] array = bubbleSortIterative.sort(TestData.SMALL_BYTE_ARRAY, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortByteDescending(){
        byte[] array = bubbleSortIterative.sort(TestData.SMALL_BYTE_ARRAY, false);
        assertTrue(checkIfSorted(array, false));
    }

    @Test(expected = NullPointerException.class)
    public void sortByteIfArrayIsNull(){
        byte[] array = bubbleSortIterative.sort((byte[])null, true);
    }

    @Test
    public void sortByteIfArrayIsEmpty(){
        byte[] temp = {};
        byte[] array = bubbleSortIterative.sort(temp, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortByteIfArrayIsOne(){
        byte[] temp = {54};
        byte[] array = bubbleSortIterative.sort(temp, true);
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
        short[] array = bubbleSortIterative.sort(TestData.SMALL_SHORT_ARRAY, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortShortDescending(){
        short[] array = bubbleSortIterative.sort(TestData.SMALL_SHORT_ARRAY, false);
        assertTrue(checkIfSorted(array, false));
    }

    @Test(expected = NullPointerException.class)
    public void sortShortIfArrayIsNull(){
        short[] array = bubbleSortIterative.sort((short[])null, true);
    }

    @Test
    public void sortShortIfArrayIsEmpty(){
        short[] temp = {};
        short[] array = bubbleSortIterative.sort(temp, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortShortIfArrayIsOne(){
        short[] temp = {54};
        short[] array = bubbleSortIterative.sort(temp, true);
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
        int[] array = bubbleSortIterative.sort(TestData.SMALL_INT_ARRAY, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortIntDescending(){
        int[] array = bubbleSortIterative.sort(TestData.SMALL_INT_ARRAY, false);
        assertTrue(checkIfSorted(array, false));
    }

    @Test(expected = NullPointerException.class)
    public void sortIntIfArrayIsNull(){
       int[] array = bubbleSortIterative.sort((int[])null, true);
    }

    @Test
    public void sortIntIfArrayIsEmpty(){
        int[] temp = {};
        int[] array = bubbleSortIterative.sort(temp, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortIntIfArrayIsOne(){
        int[] temp = {54};
        int[] array = bubbleSortIterative.sort(temp, true);
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
        long[] array = bubbleSortIterative.sort(TestData.SMALL_LONG_ARRAY, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortLongDescending(){
        long[] array = bubbleSortIterative.sort(TestData.SMALL_LONG_ARRAY, false);
        assertTrue(checkIfSorted(array, false));
    }

    @Test(expected = NullPointerException.class)
    public void sortLongIfArrayIsNull(){
        long[] array = bubbleSortIterative.sort((long[])null, true);
    }

    @Test
    public void sortLongIfArrayIsEmpty(){
        long[] temp = {};
        long[] array = bubbleSortIterative.sort(temp, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortLongIfArrayIsOne(){
        long[] temp = {54546};
        long[] array = bubbleSortIterative.sort(temp, true);
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
        float[] array = bubbleSortIterative.sort(TestData.SMALL_FLOAT_ARRAY, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortFloatDescending(){
        float[] array = bubbleSortIterative.sort(TestData.SMALL_FLOAT_ARRAY, false);
        assertTrue(checkIfSorted(array, false));
    }

    @Test(expected = NullPointerException.class)
    public void sortFloatIfArrayIsNull(){
        float[] array = bubbleSortIterative.sort((float[])null, true);
    }

    @Test
    public void sortFloatIfArrayIsEmpty(){
        float[] temp = {};
        float[] array = bubbleSortIterative.sort(temp, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortFloatIfArrayIsOne(){
        float[] temp = {0.36987f};
        float[] array = bubbleSortIterative.sort(temp, true);
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
        double[] array = bubbleSortIterative.sort(TestData.SMALL_DOUBLE_ARRAY, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortDoubleDescending(){
        double[] array = bubbleSortIterative.sort(TestData.SMALL_DOUBLE_ARRAY, false);
        assertTrue(checkIfSorted(array, false));
    }

    @Test(expected = NullPointerException.class)
    public void sortDoubleIfArrayIsNull(){
        double[] array = bubbleSortIterative.sort((double[])null, true);
    }

    @Test
    public void sortDoubleIfArrayIsEmpty(){
        double[] temp = {};
        double[] array = bubbleSortIterative.sort(temp, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortDoubleIfArrayIsOne(){
        double[] temp = {0.36987};
        double[] array = bubbleSortIterative.sort(temp, true);
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
        char[] array = bubbleSortIterative.sort(TestData.SMALL_CHAR_ARRAY, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortCharDescending(){
        char[] array = bubbleSortIterative.sort(TestData.SMALL_CHAR_ARRAY, false);
        assertTrue(checkIfSorted(array, false));
    }

    @Test(expected = NullPointerException.class)
    public void sortCharIfArrayIsNull(){
        char[] array = bubbleSortIterative.sort((char[])null, true);
    }

    @Test
    public void sortCharIfArrayIsEmpty(){
        char[] temp = {};
        char[] array = bubbleSortIterative.sort(temp, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortCharIfArrayIsOne(){
        char[] temp = {'p'};
        char[] array = bubbleSortIterative.sort(temp, true);
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
        String[] array = bubbleSortIterative.sort(TestData.SMALL_STRING_ARRAY, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortStringDescending(){
        String[] array = bubbleSortIterative.sort(TestData.SMALL_STRING_ARRAY, false);
        assertTrue(checkIfSorted(array, false));
    }

    @Test(expected = NullPointerException.class)
    public void sortStringIfArrayIsNull(){
        String[] array = bubbleSortIterative.sort((String[])null, true);
    }

    @Test
    public void sortStringIfArrayIsEmpty(){
        String[] temp = {};
        String[] array = bubbleSortIterative.sort(temp, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortStringIfArrayIsOne(){
        String[] temp = {"test"};
        String[] array = bubbleSortIterative.sort(temp, true);
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
        Object[] array = bubbleSortIterative.sort(people, true, comparator);
        assertTrue(checkIfSorted(array, true, comparator));
    }

    @Test
    public void sortObjectDescending(){
        Object[] array = bubbleSortIterative.sort(people, false, comparator);
        assertTrue(checkIfSorted(array, false, comparator));
    }

    @Test(expected = NullPointerException.class)
    public void sortObjectIfArrayIsNull(){
        Object[] array = bubbleSortIterative.sort((Object[])null, true, comparator);
    }

    @Test
    public void sortObjectIfArrayIsEmpty(){
        Object[] temp = {};
        Object[] array = bubbleSortIterative.sort(temp, true, comparator);
        assertTrue(checkIfSorted(array, true, comparator));
    }

    @Test
    public void sortObjectIfArrayIsOne(){
        Object[] temp = new Person[]{new Person("John", "Smith", 56, "AAAAA")};
        Object[] array = bubbleSortIterative.sort(temp, true, comparator);
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
