import java.util.ArrayList;

public class SorterContext {

    private SorterStrategy sortStrategy;

    public SorterContext(SorterStrategy strategy) {
        this.sortStrategy = strategy;
    }

    public void setStrategy(SorterStrategy strategy ) {
        this.sortStrategy = strategy;
    }

    public long processList(int[] list) {
        return sortStrategy.processList(list);
    }

}
