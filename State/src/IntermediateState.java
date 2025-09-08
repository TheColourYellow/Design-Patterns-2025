public class IntermediateState extends State{

    public IntermediateState(Character ch) {
        super(ch);
    }


    @Override
    public void action() {
        String[] actions = {"Train", "Meditate"};
        //this.getCharacter().getCurrentState();
        //this.getCharacter().selectAction(actions);
        if (this.getCharacter().getExperience() == 250) {
            this.getCharacter().setState(new ExpertState(this.getCharacter()));
            this.getCharacter().setLevel("Expert");
        }
        if (this.getCharacter().selectAction(actions) == 1) {
            this.getCharacter().setExperience(10);

        }
        if (this.getCharacter().selectAction(actions) == 2) {
            this.getCharacter().setHp(5);
        }
    }
}
