package tests.BubbleSort;

import data.Person;
import data.PersonComparator;
import data.TestData;
import org.junit.Before;
import org.junit.Test;
import zoltankiss842.sorting.ComparisonSorts.BubbleSort.BubbleSortImproved;

import java.util.Comparator;

import static junit.framework.Assert.assertTrue;

public class BubbleSortImprovedTest {
    private Person[] people;
    private PersonComparator comparator;
    private BubbleSortImproved bubbleSortImproved;

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

        bubbleSortImproved = new BubbleSortImproved();
    }

    // ------ BYTE ------

    @Test
    public void sortByteAscending(){
        byte[] array = bubbleSortImproved.sort(TestData.SMALL_BYTE_ARRAY, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortByteDescending(){
        byte[] array = bubbleSortImproved.sort(TestData.SMALL_BYTE_ARRAY, false);
        assertTrue(checkIfSorted(array, false));
    }

    @Test(expected = NullPointerException.class)
    public void sortByteIfArrayIsNull(){
        byte[] array = bubbleSortImproved.sort((byte[])null, true);
    }

    @Test
    public void sortByteIfArrayIsEmpty(){
        byte[] temp = {};
        byte[] array = bubbleSortImproved.sort(temp, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortByteIfArrayIsOne(){
        byte[] temp = {54};
        byte[] array = bubbleSortImproved.sort(temp, true);
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
        short[] array = bubbleSortImproved.sort(TestData.SMALL_SHORT_ARRAY, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortShortDescending(){
        short[] array = bubbleSortImproved.sort(TestData.SMALL_SHORT_ARRAY, false);
        assertTrue(checkIfSorted(array, false));
    }

    @Test(expected = NullPointerException.class)
    public void sortShortIfArrayIsNull(){
        short[] array = bubbleSortImproved.sort((short[])null, true);
    }

    @Test
    public void sortShortIfArrayIsEmpty(){
        short[] temp = {};
        short[] array = bubbleSortImproved.sort(temp, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortShortIfArrayIsOne(){
        short[] temp = {54};
        short[] array = bubbleSortImproved.sort(temp, true);
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
        int[] array = bubbleSortImproved.sort(TestData.SMALL_INT_ARRAY, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortIntDescending(){
        int[] array = bubbleSortImproved.sort(TestData.SMALL_INT_ARRAY, false);
        assertTrue(checkIfSorted(array, false));
    }

    @Test(expected = NullPointerException.class)
    public void sortIntIfArrayIsNull(){
        int[] array = bubbleSortImproved.sort((int[])null, true);
    }

    @Test
    public void sortIntIfArrayIsEmpty(){
        int[] temp = {};
        int[] array = bubbleSortImproved.sort(temp, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortIntIfArrayIsOne(){
        int[] temp = {54};
        int[] array = bubbleSortImproved.sort(temp, true);
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
        long[] array = bubbleSortImproved.sort(TestData.SMALL_LONG_ARRAY, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortLongDescending(){
        long[] array = bubbleSortImproved.sort(TestData.SMALL_LONG_ARRAY, false);
        assertTrue(checkIfSorted(array, false));
    }

    @Test(expected = NullPointerException.class)
    public void sortLongIfArrayIsNull(){
        long[] array = bubbleSortImproved.sort((long[])null, true);
    }

    @Test
    public void sortLongIfArrayIsEmpty(){
        long[] temp = {};
        long[] array = bubbleSortImproved.sort(temp, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortLongIfArrayIsOne(){
        long[] temp = {54546};
        long[] array = bubbleSortImproved.sort(temp, true);
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
        float[] array = bubbleSortImproved.sort(TestData.SMALL_FLOAT_ARRAY, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortFloatDescending(){
        float[] array = bubbleSortImproved.sort(TestData.SMALL_FLOAT_ARRAY, false);
        assertTrue(checkIfSorted(array, false));
    }

    @Test(expected = NullPointerException.class)
    public void sortFloatIfArrayIsNull(){
        float[] array = bubbleSortImproved.sort((float[])null, true);
    }

    @Test
    public void sortFloatIfArrayIsEmpty(){
        float[] temp = {};
        float[] array = bubbleSortImproved.sort(temp, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortFloatIfArrayIsOne(){
        float[] temp = {0.36987f};
        float[] array = bubbleSortImproved.sort(temp, true);
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
        double[] array = bubbleSortImproved.sort(TestData.SMALL_DOUBLE_ARRAY, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortDoubleDescending(){
        double[] array = bubbleSortImproved.sort(TestData.SMALL_DOUBLE_ARRAY, false);
        assertTrue(checkIfSorted(array, false));
    }

    @Test(expected = NullPointerException.class)
    public void sortDoubleIfArrayIsNull(){
        double[] array = bubbleSortImproved.sort((double[])null, true);
    }

    @Test
    public void sortDoubleIfArrayIsEmpty(){
        double[] temp = {};
        double[] array = bubbleSortImproved.sort(temp, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortDoubleIfArrayIsOne(){
        double[] temp = {0.36987};
        double[] array = bubbleSortImproved.sort(temp, true);
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
        char[] array = bubbleSortImproved.sort(TestData.SMALL_CHAR_ARRAY, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortCharDescending(){
        char[] array = bubbleSortImproved.sort(TestData.SMALL_CHAR_ARRAY, false);
        assertTrue(checkIfSorted(array, false));
    }

    @Test(expected = NullPointerException.class)
    public void sortCharIfArrayIsNull(){
        char[] array = bubbleSortImproved.sort((char[])null, true);
    }

    @Test
    public void sortCharIfArrayIsEmpty(){
        char[] temp = {};
        char[] array = bubbleSortImproved.sort(temp, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortCharIfArrayIsOne(){
        char[] temp = {'p'};
        char[] array = bubbleSortImproved.sort(temp, true);
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
        String[] array = bubbleSortImproved.sort(TestData.SMALL_STRING_ARRAY, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortStringDescending(){
        String[] array = bubbleSortImproved.sort(TestData.SMALL_STRING_ARRAY, false);
        assertTrue(checkIfSorted(array, false));
    }

    @Test(expected = NullPointerException.class)
    public void sortStringIfArrayIsNull(){
        String[] array = bubbleSortImproved.sort((String[])null, true);
    }

    @Test
    public void sortStringIfArrayIsEmpty(){
        String[] temp = {};
        String[] array = bubbleSortImproved.sort(temp, true);
        assertTrue(checkIfSorted(array, true));
    }

    @Test
    public void sortStringIfArrayIsOne(){
        String[] temp = {"test"};
        String[] array = bubbleSortImproved.sort(temp, true);
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
        Object[] array = bubbleSortImproved.sort(people, true, comparator);
        assertTrue(checkIfSorted(array, true, comparator));
    }

    @Test
    public void sortObjectDescending(){
        Object[] array = bubbleSortImproved.sort(people, false, comparator);
        assertTrue(checkIfSorted(array, false, comparator));
    }

    @Test(expected = NullPointerException.class)
    public void sortObjectIfArrayIsNull(){
        Object[] array = bubbleSortImproved.sort((Object[])null, true, comparator);
    }

    @Test
    public void sortObjectIfArrayIsEmpty(){
        Object[] temp = {};
        Object[] array = bubbleSortImproved.sort(temp, true, comparator);
        assertTrue(checkIfSorted(array, true, comparator));
    }

    @Test
    public void sortObjectIfArrayIsOne(){
        Object[] temp = new Person[]{new Person("John", "Smith", 56, "AAAAA")};
        Object[] array = bubbleSortImproved.sort(temp, true, comparator);
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
