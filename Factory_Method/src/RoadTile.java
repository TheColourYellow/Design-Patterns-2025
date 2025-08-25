public class RoadTile implements Tile {
    private String symbol = "=";
    private String type = "Road";
    @Override
    public String getCharacter() {
        return symbol;
    }

    @Override
    public String getType() {
        return type;
    }
}
