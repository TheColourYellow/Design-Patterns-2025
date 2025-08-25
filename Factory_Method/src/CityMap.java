public class CityMap extends Map {

    @Override
    public Tile createTile() {
        Tile road = new RoadTile();
        Tile forest = new ForestTile();
        Tile building = new BuildingTile();
        Tile[] tiles = {road, forest, building};
        int x = (int)(Math.random() * tiles.length);
        return tiles[x];
    }
}
