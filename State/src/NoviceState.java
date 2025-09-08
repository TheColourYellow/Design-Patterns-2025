
public class NoviceState extends State {

    public NoviceState(Character ch) {
        super(ch);
    }


    @Override
    public void action() {
        String[] actions = {"Train"};
        //this.getCharacter().getCurrentState();
        //this.getCharacter().selectAction(actions);
        if (this.getCharacter().getExperience() == 100) {
            this.getCharacter().setState(new IntermediateState(this.getCharacter()));
            this.getCharacter().setLevel("Intermediate");
        }
        if (this.getCharacter().selectAction(actions) == 1) {
            this.getCharacter().setExperience(10);
        }
    }
}
