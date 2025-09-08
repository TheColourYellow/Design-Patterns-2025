import java.util.Random;

public class ExpertState extends State{

    public ExpertState(Character ch) {
        super(ch);
    }


    @Override
    public void action() {
        String[] actions = {"Train", "Meditate", "Fight"};
        //this.getCharacter().getCurrentState();
        //this.getCharacter().selectAction(actions);
        if (this.getCharacter().getExperience() == 990) {
            this.getCharacter().setState(new IntermediateState(this.getCharacter()));
        }
        if (this.getCharacter().selectAction(actions) == 1) {
            this.getCharacter().setExperience(10);
        }
        if (this.getCharacter().selectAction(actions) == 2) {
            this.getCharacter().setHp(5);
        }
        if (this.getCharacter().selectAction(actions) == 3) {
            int damage = new Random().nextInt(5);
            this.getCharacter().setHp(-damage);
            this.getCharacter().setExperience(25);
        }
    }
}
