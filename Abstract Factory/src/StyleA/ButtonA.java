package StyleA;

import Abstracts.Button;

public class ButtonA extends Button {

    private String text;

    @Override
    public void display() {
        System.out.println("===========");
        System.out.print("I");
        System.out.print(" " + text + " ");
        System.out.print("I" + '\n');
        System.out.println("===========");
    }

    @Override
    public void setText(String input) {
        this.text = input;
    }

    /*
    @Override
    public void display() {


    }*/
}
