package StyleB;

import Abstracts.Button;

public class ButtonB extends Button {
    private String text;

    @Override
    public void display() {
        System.out.println("~~~~~~~~~~~~");
        System.out.print("S");
        System.out.print(" " + text + " ");
        System.out.print("S" + '\n');
        System.out.println("~~~~~~~~~~~~");
    }
    @Override
    public void setText(String input) {
        this.text = input;
    }
}
