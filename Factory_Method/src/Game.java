public class Game {

    public void main() {
        createMap();

    }

    public void createMap() {
        Map gameMap = new CityMap();
        //Map gameMap = new WildernessMap();
        String[][] map = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Tile tile = gameMap.createTile();
                map[i][j] = tile.getCharacter();
            }
        }
        gameMap.display(map);
    }
}
