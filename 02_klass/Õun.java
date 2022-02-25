public class Õun {
    String sort;
    double kogus;
    float hind;
    String värv;

        public Õun(String sort, double kogus, float hind, String värv) {
            this.sort = sort;
            this.kogus = kogus;
            this.hind = hind;
            this.värv = värv;
        }
        public void õunaKalkulaator(double kogus, float hind) {
            System.out.println(kogus * hind);
        }

    @Override
    public String toString() {
        return "Õun{" +
                "sort='" + sort + '\'' +
                ", kogus=" + kogus +
                ", hind=" + hind +
                ", värv='" + värv + '\'' +
                '}';
    }
}

