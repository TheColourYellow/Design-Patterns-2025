public class Main {
    public static void main(String[] args) {
        FibonacciSequence sequence = new FibonacciSequence();
        sequence.setIterationLimit(10);

        FibonacciIterator numbers = new FibonacciIterator(sequence);

        while (numbers.hasNext()) {
            System.out.println(numbers.next());
        }
        System.out.println(sequence.getSequenceNumbers());
    }
}
