import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FibonacciSequence implements Sequence {

    /*
    In the interest of proper encapsulation
    the sequence class should only have logic related to the
    actual calculation of the Fibonacci sequence.
     */

    private int firstNumber = 0;
    private int secondNumber= 1;

    private int iterationLimit;


    //Should we want to have numbers recorded, I feel jt's only
    // Sensible to have them where the numbers are actually determined
    private List<Integer> sequenceNumbers;

    public FibonacciSequence() {
        sequenceNumbers = new ArrayList<Integer>();
        sequenceNumbers.add(firstNumber);
        sequenceNumbers.add(secondNumber);
    }



    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator(this);
    }

    public int getNextNumber() {
        int result = firstNumber + secondNumber;
        firstNumber = secondNumber;
        secondNumber = result;
        sequenceNumbers.add(result);
        return result;
    }
    public void setIterationLimit(int iterationLimit) {
        this.iterationLimit = iterationLimit;
    }
    public int getIterationLimit() {
        return iterationLimit;
    }
    public List<Integer> getSequenceNumbers() {
        return sequenceNumbers;
    }

}
