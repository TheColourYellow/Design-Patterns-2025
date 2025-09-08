public class MasterState extends State{

    public MasterState(Character ch) {
        super(ch);
    }


    @Override
    public void action() {
        System.out.println("Congrats! You Won");
    }
}
