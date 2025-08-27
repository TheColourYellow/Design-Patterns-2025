import Abstracts.Button;
import Abstracts.Checkbox;
import Abstracts.TextField;
import Abstracts.UIFactory;
import StyleA.ButtonA;
import StyleA.CheckboxA;
import StyleA.TextFieldA;
import StyleB.ButtonB;
import StyleB.CheckboxB;
import StyleB.TextFieldB;

public class BFactory extends UIFactory {
    @Override
    public Button createButton(String text) {
        Button btn = new ButtonB();
        //System.out.println(text);
        btn.setText(text);
        return btn;
    }

    @Override
    public TextField createTextField(String text) {
        TextField tf = new TextFieldB();
        tf.setText(text);
        return tf;
    }

    @Override
    public Checkbox createCheckbox(String text) {
        Checkbox cb = new CheckboxB();
        cb.setText(text);
        return cb;
    }
}
