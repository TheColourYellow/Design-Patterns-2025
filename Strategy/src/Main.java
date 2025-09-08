import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SorterStrategy[] sorters = {new SelectionSort(), new MergeSort(), new InsertionSort()};
        Random rand = new Random();
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }
        int[] manyNumbers = new int[25000];
        for (int i = 0; i < manyNumbers.length; i++) {
            manyNumbers[i] = rand.nextInt(100);
        }
        SorterContext arraySorter = new SorterContext(new SelectionSort());


        //Tiny list sort
        for (SorterStrategy sorter : sorters) {
            int[] numbersCopy = numbers.clone();
            //SorterContext arraySorter = new SorterContext(sorter);
            arraySorter.setStrategy(sorter);
            System.out.println("Current sorter: " + sorter.getName());
            //System.out.println("Original numbers: " + Arrays.toString(numbersCopy));
            long startTime = System.nanoTime();
            //arraySorter.processList(numbersCopy);
            //System.out.println("Sorting done");
            long endTime = arraySorter.processList(numbersCopy) - startTime;
            System.out.println("Time taken: " + endTime / (Math.pow(10, 9)) + " s");
        }
        System.out.println("-----------------------------------------");
        // Huge list sort
        for (SorterStrategy sorter : sorters) {
            int[] numbersCopy = manyNumbers.clone();
            //SorterContext arraySorter = new SorterContext(sorter);
            arraySorter.setStrategy(sorter);
            System.out.println("Current sorter: " + sorter.getName());
            //System.out.println("Original numbers: " + Arrays.toString(numbersCopy));
            long startTime = System.nanoTime();
            //arraySorter.processList(numbersCopy);
            //System.out.println("Sorting done");
            long endTime = arraySorter.processList(numbersCopy) - startTime;
            System.out.println("Time taken: " + endTime /(Math.pow(10,9)) + " s");
        }
    }
}
