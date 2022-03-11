public class MainKodu {
    public static void main(String[] args) {
        Andmed andmed = new Andmed("Valgeklaar", "roheline", 5, "Eesti");
        hind hind = new hind(andmed, 5, 2);

        String hindAndmed = hind.getInfo();
        System.out.println(hindAndmed);
    }
}
