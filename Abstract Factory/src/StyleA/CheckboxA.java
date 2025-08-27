package StyleA;

import Abstracts.Checkbox;

public class CheckboxA extends Checkbox {

    private String check;

    @Override
    public void display() {
        System.out.print("[ " + check + " ]");
    }

    @Override
    public void setText(String input) {
        this.check = input;
    }
}
