public class kodutööMain {
    public static void main(String[] args) {
        Õun one = new Õun("Valgeklaar", 5.5, 2, "roheline");
        Õun two = new Õun("Agra", 10, 1, "punane");
        System.out.println(one);
        System.out.println(two);

        one.õunaKalkulaator(5.5,2);
        two.õunaKalkulaator(10,1);

    }
}
