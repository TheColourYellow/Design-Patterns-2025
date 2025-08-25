public class BuildingTile implements Tile {
    private String symbol = "B";
    private String type = "Building";
    @Override
    public String getCharacter() {
        return symbol;
    }

    @Override
    public String getType() {
        return type;
    }
}
