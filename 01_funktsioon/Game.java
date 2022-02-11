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
        // short -- 3200 kohta
        // long -- 9,223,372,036,854,775,807
        // boolean -- kahendväärtus true/false
        // || -- or
        int worldHeight = 5;
        int worldWidth = 10;


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
                System.out.print(symbol);
            }
            System.out.println();
        }

        }
    }

