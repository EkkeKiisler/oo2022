import java.util.Scanner;

public class Game {
    //main --> pakub
    public static void main(String[] args) {
        // sout --> pakub
        System.out.println("Hello World");
        // String -- sõnaline muutuja
        // char -- üks täht
        // int -- täiskohaline number (kuni 2.1 miljardit)
        // double -- 15kohaline komakohaga number (peale koma)
        // float -- 7kohaline komakohaga number (peale koma)
        // byte -- 128 kohta
        // short -- 32000 kohta
        // long -- 9,223,372,036,854,775,807
        // boolean -- kahendväärtus true/false
        // || -- or
        int worldHeight = 5;
        int worldWidth = 10;
        // Math.random() -- 0 .. 0.9999 --- 0 ... 4.9999 --- 0..2 .. 1...3
        int playerCoordinateY = generateRandomCoordinate(worldHeight);
        int playerCoordinateX = generateRandomCoordinate(worldWidth);
        int enemyCoordinateY = generateRandomCoordinate(worldHeight);
        int enemyCoordinateX = generateRandomCoordinate(worldWidth);

        printMap(worldHeight, worldWidth, playerCoordinateX,
                playerCoordinateY, enemyCoordinateY, enemyCoordinateX);


        // klasside tegemine hakkab tunnis nr 2
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        while (!input.equals("end")) {
            // kontrollib ühte muutujat mingite väärtusete vastu
            switch (input) {
                case "a":
                    playerCoordinateX--;
                    break;
                case "s":
                    playerCoordinateY++;
                    break;
                case "d":
                    playerCoordinateX++;
                    break;
                case "w":
                    playerCoordinateY--;
                    break;

            }

            printMap(worldHeight, worldWidth, playerCoordinateX,
                    playerCoordinateY, enemyCoordinateY, enemyCoordinateX);
            input = scanner.nextLine();
        }


    }
    //int -- sama tüüp mis peab olema funktsiooni sees returni järgi
    public static int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1;
    }

    public static void printMap(int worldHeight, int worldWidth,
                                int playerCoordinateX, int playerCoordinateY,
                                int enemyCoordinateY, int enemyCoordinateX) {
        char symbol;    //deklareerib 1 kord muutuja, mitte iga kord
        //fori --> pakub
        for (int y = 0; y < worldHeight; y++) {
            for (int x = 0; x < worldWidth; x++) {

                if (y == 0 || y == worldHeight-1) { // primitiiv || andmebaasipäring
                    symbol = '-';


                } else if (x == 0 || x == worldWidth-1) {
                    symbol = '|';



                } else {
                    symbol =' ';


                }
                if (playerCoordinateX == x && playerCoordinateY == y) {
                    symbol = 'x';
                }
                if (enemyCoordinateX == x && enemyCoordinateY == y) {
                    symbol = 'z';
                }
                System.out.print(symbol);

            }
            System.out.println();
        }
    }
}

