import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {

    /*
    Iterator only has program logic related to iterating through
    values it gets from the sequence class
     */

    /*
    Because the iterator class is dependant on instance of number sequence class
    It should be effortless to haave this iterator work with other number sequence classes
    Provided that they have attribute for iteration limit and methods for setting and getting
    it.
     */

    private FibonacciSequence sequence;
    private int iteration = 0;
    private int iterationLimit;


    public FibonacciIterator(FibonacciSequence instance) {
        sequence = instance;
        iterationLimit = instance.getIterationLimit();
    }


    @Override
    public boolean hasNext() {
        return iteration < iterationLimit;
    }

    @Override
    public Integer next() {
        iteration++;
        return sequence.getNextNumber();
    }
}
