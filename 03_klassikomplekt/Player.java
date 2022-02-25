public class Player {
    int CoordinateY;
    int CoordinateX;
    Direction direction;
    Item item;

    // Constructor
    public Player(int worldHeight, int worldWidth) {
        this.CoordinateY = generateRandomCoordinate(worldHeight);
        this.CoordinateX = generateRandomCoordinate(worldWidth);
        this.direction = Direction.UP;
    }

    public void addItem(Item item) {
        this.item = item;
        System.out.println("Mängija sai eseme + " + item.itemType);
    }

    public int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1;
    } // cast

    public void movePlayer(String input, int worldHeight, int worldWidth) {
        // kontrollib ühte muutujat mingite väärtuste vastu
        switch (input) {
            case "a":
                direction = Direction.LEFT;
                break;
            case "s":
                direction = Direction.DOWN;
                break;
            case "d":
                direction = Direction.RIGHT;
                break;
            case "w":
                direction = Direction.UP;
                break;
        }
        switch (direction) {
            case LEFT:
                if (CoordinateX > 1) {
                    CoordinateX--;
                }
                break;
            case DOWN:
                if (CoordinateY < worldHeight-2) {
                    CoordinateY++;
                }
                break;
            case RIGHT:
                if (CoordinateX < worldWidth-2) {
                    CoordinateX++;
                }
                break;
            case UP:
                if (CoordinateY > 1) {
                    CoordinateY--;
                }
                break;
        }

//            if (direction == Direction.LEFT && true) {
//                playerCoordinateX--;
//            } else if (direction == Direction.DOWN || input.equals("mihkel")) {
//                playerCoordinateY++;
//            } else if (direction == Direction.RIGHT) {
//                playerCoordinateX++;
//            } else if (direction == Direction.UP) {
//                playerCoordinateY--;
//            }

    }

}

// Tellimuse - id, tooted, kasutaja, aja
// Kasutaja - frontendis registreerumise järgselt
// Ühe toote
// Kategooria