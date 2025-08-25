public class WildernessMap extends Map {
    @Override
    public Tile createTile() {
        Tile swamp = new SwampTile();
        Tile forest = new ForestTile();
        Tile water = new WaterTile();
        Tile[] tiles = {swamp, forest, water};
        int x = (int)(Math.random() * tiles.length);
        return tiles[x];

    }
}
