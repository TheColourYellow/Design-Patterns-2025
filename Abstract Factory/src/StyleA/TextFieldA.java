package StyleA;

import Abstracts.TextField;

public class TextFieldA extends TextField {

    private String prompt;
    @Override
    public void display() {
        System.out.print("|    " + prompt + "     |");
    }

    @Override
    public void setText(String input) {
        this.prompt = input;
    }
}
