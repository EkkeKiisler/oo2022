public class Andmed {
    String sort;
    String värvus;
    int läbimõõtCM;
    String päritolu;

    public Andmed(String sort, String värvus, int läbimõõtCM, String päritolu) {
        this.sort = sort;
        this.värvus = värvus;
        this.läbimõõtCM = läbimõõtCM;
        this.päritolu = päritolu;
    }

    @Override
    public String toString() {
        return "Andmed{" +
                "sort='" + sort + '\'' +
                ", värvus='" + värvus + '\'' +
                ", läbimõõtCM=" + läbimõõtCM +
                ", päritolu='" + päritolu + '\'' +
                '}';
    }
}
