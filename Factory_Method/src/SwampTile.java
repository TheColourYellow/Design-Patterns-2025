public class SwampTile implements Tile {
    private String symbol = "S";
    private String type = "Swamp";


    @Override
    public String getCharacter() {
        return symbol;
    }

    @Override
    public String getType() {
        return type;
    }
}
