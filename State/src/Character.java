import java.util.Scanner;

public class Character {
    private String name;
    private String level;
    private double experience;
    private int hp;

    private State state;

    public Character(String name) {
        this.name = name;
        this.level = "Novice";
        this.hp = 10;
        state = new NoviceState(this);
    }
    public void setState(State state) {
        this.state = state;
    }

    public void play() {
        while (experience < 1000) {
            if (state == null) {
                System.out.println("Error");
                return;
            }
            state.action();
        }
    }


    public double getExperience() {return experience;}

    public void setLevel(String level) {this.level = level;}
    public void setExperience(double exp) {this.experience+=exp;}
    public void setHp(int hp) {this.hp+=hp;}


    public int selectAction(String[] actions) {
        Scanner input = new Scanner(System.in);
        getCurrentState();
        System.out.println("Select what you would like to do.");
        for (int i = 0; i < actions.length; i++) {
            System.out.println(i+1 + ". " + actions[i]);
        }
        int result = input.nextInt();
        return result;
    }
    public void getCurrentState() {
        System.out.println("Your name is " + name);
        System.out.println("Current level: " + level);
        System.out.println("Current health: " + hp);
        System.out.println("Current experience: " + experience);
    }

}
