public class Item implements WorldObject {
    int coordinateY;
    int coordinateX;
    double strenght;
    ItemType itemType;

    public Item(int worldHeight, int worldWidth, ItemType itemType) {
        this.coordinateY = generateRandomCoordinate(worldHeight);
        this.coordinateX = generateRandomCoordinate(worldWidth);
        this.itemType = itemType;
        detemineStrenght(itemType);
    }

    private void detemineStrenght(ItemType itemType) { //ctrl + alt + m highlighti valitud read
        switch (itemType) {
            case SWORD:
                this.strenght = 3;
                break;
            case HAMMER:
                this.strenght = 2;
                break;
            case DAGGER:
                this.strenght = 1;
                break;
        }
    }

    public int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1;
    }

    @Override
    public String toString() {
        return "Item{" +
                "coordinateY=" + coordinateY +
                ", coordinateX=" + coordinateX +
                ", strenght=" + strenght +
                ", itemType=" + itemType +
                '}';
    }
}
