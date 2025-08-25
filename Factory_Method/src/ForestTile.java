public class ForestTile implements Tile {
    private String symbol = "F";
    private String type = "Forest";
    @Override
    public String getCharacter() {
        return symbol;
    }

    @Override
    public String getType() {
        return type;
    }
}
