public class WaterTile  implements Tile {
    private String symbol = "~";
    private String type = "Water";
    @Override
    public String getCharacter() {
        return symbol;
    }

    @Override
    public String getType() {
        return type;
    }
}
