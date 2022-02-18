public class Enemy {
    // parem klõps(muuutuja aktiivne) -> refactor ->rename
    int CoordinateY;
    int CoordinateX;

    // new Enemy(1, 2)
    public Enemy(int worldHeight, int worldWidth) {
        this.CoordinateY = generateRandomCoordinate(worldHeight);
        this.CoordinateX = generateRandomCoordinate(worldWidth);
    }
    public  int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1;
    }
}
