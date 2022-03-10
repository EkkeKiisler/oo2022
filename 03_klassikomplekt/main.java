public class main {
    public static void main(String[] args) {

        Info info = new Info("asd", "asfa", "asfa", 1, 5);
        Arvuti arvuti = new Arvuti(info,1999);

        String arvutiInfo = arvuti.getInfo();
        System.out.println(arvutiInfo
        );
    }
}
