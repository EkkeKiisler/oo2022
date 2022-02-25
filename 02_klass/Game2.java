import java.util.Scanner;

public class Game2 {
    //main --> pakub
    public static void main(String[] args) {
        // sout --> pakub
        // String -- sõnaline muutuja
        // char -- üks täht
        // int -- täiskohaline number (kuni 2.1 miljardit)
        // double -- 15kohaline komakohaga number (peale koma)
        // float -- 7kohaline komakohaga number (peale koma)
        // byte -- 128 kohta
        // short -- 3200 kohta
        // long -- 9,223,372,036,854,775,807
        // boolean -- kahendväärtus true/false
        // || -- or

        // Math.random() -- 0 .. 0.9999 --- 0 ... 4.9999 --- 0..2 .. 1...3
        World world = new World(5,10);
        Player mangija1 = new Player(world.worldHeight, world.worldWidth);
        Player mangija2 = new Player(world.worldHeight, world.worldWidth);

        // uue instantsi loomine --- uue mälukohaga objekti tekitamine
        // kellel on kõik omadused, mis on defineeritud tema klassis
        Enemy vaenlane1 = new Enemy(world.worldHeight, world.worldWidth);


        world.printMap(mangija1.CoordinateY,
                mangija1.CoordinateX, vaenlane1.CoordinateY, vaenlane1.CoordinateX);


        // klasside tegemine hakkab tunnis nr 2
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        while (!input.equals("end")) {
            mangija1.movePlayer(input, world.worldHeight, world.worldWidth);
            world.printMap(mangija1.CoordinateX,
                    mangija1.CoordinateY, vaenlane1.CoordinateY, vaenlane1.CoordinateX);
            input = scanner.nextLine();
        }


    }
    //int -- sama tüüp mis peab olema funktsiooni sees returni järgi


}

