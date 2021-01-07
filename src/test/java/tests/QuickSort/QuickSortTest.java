package tests.QuickSort;

import data.Person;
import data.PersonComparator;
import data.TestData;
import org.junit.Before;
import org.junit.Test;
import zoltankiss842.sorting.ComparisonSorts.BubbleSort.BubbleSortImproved;
import zoltankiss842.sorting.ComparisonSorts.BubbleSort.BubbleSortIterative;
import zoltankiss842.sorting.ComparisonSorts.QuickSort.QuickSort;

import static junit.framework.Assert.assertTrue;

public class QuickSortTest {

    private Person[] people;
    private PersonComparator comparator;
    private QuickSort quickSort;

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

        quickSort = new QuickSort();
    }

    // ------ BYTE ------

    @Test
    public void sortByteAscending(){
        byte[] array = TestData.SMALL_BYTE_ARRAY;
        array = quickSort.sort(array, 0, TestData.SMALL_BYTE_ARRAY.length-1, QuickSort.RANDOM_MEDIAN_ELEMENT_PIVOT, true);
        for(byte a : array){
            System.out.print(a + " ");
        }
    }
}
