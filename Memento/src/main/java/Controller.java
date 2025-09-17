
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Model model;
    private Gui gui;
    private List<IMemento> history; // Memento history

    private List<IMemento> redoHistory;

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.history = new ArrayList<>();
        this.redoHistory = new ArrayList<>();
    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory();
        redoHistory.clear();    //Addition by the assignment
        model.setOption(optionNumber, choice);
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        redoHistory.clear();    //Addition by the assignment
        model.setIsSelected(isSelected);
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (!history.isEmpty()) {
            System.out.println("Memento found in history");
            IMemento previousState = history.get(history.size() - 1);

            //Addition by the assignment
            redoHistory.add(previousState);
            history.remove(history.size() - 1);

            model.restoreState(previousState);
            gui.updateGui();
        }
    }

    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        history.add(currentState);
    }

    //Addition by the assignment
    public void redo() {
        if (!redoHistory.isEmpty()) {
            IMemento previousState = redoHistory.get(redoHistory.size() - 1);

            history.add(previousState);
            redoHistory.remove(redoHistory.size() - 1);

            model.restoreState(previousState);
            gui.updateGui();
        }
    }
}