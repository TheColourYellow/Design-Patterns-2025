import Abstracts.Button;
import Abstracts.Checkbox;
import Abstracts.TextField;
import Abstracts.UIFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String buttonText;
        String textFieldText;
        String checkMark;

        String input;


        Scanner sc = new Scanner(System.in);
        //System.out.println("Press Enter to initialise the system");
        //String input = sc.nextLine();
        do {
            System.out.println("Enter what the button says");
            buttonText = sc.nextLine();
            System.out.println("Enter what the textfield says");
            textFieldText = sc.nextLine();
            System.out.println("Enter what the checkmark says");
            checkMark = sc.nextLine();
            UIFactory factory = new AFactory();
            //UIFactory factory = new BFactory();
            Button button = factory.createButton(buttonText);
            TextField tf = factory.createTextField(textFieldText);
            Checkbox cb = factory.createCheckbox(checkMark);
            button.display();
            tf.display();
            cb.display();
            System.out.println(" \n To exit type and enter anything or press Enter to continue");
            input = sc.nextLine();

        } while (input.isBlank()
        );


    }
}
