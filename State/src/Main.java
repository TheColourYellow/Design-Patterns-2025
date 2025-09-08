import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the hero: ");
        String name = input.nextLine();
        Character character = new Character(name);
        character.play();
    }
}
