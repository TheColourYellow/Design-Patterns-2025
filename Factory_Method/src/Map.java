import java.util.Arrays;

public abstract class Map {
    public abstract Tile createTile();

    public void display(String[][] map) {
        for (String[] letter : map) {
            System.out.println(Arrays.toString(letter));
        }
    }


}
