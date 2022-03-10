public class hind {
    Andmed andmed;
    int kogusKg;
    int hindKg;

    public hind(Andmed andmed, int kogusKg, int hindKg) {
        this.andmed = andmed;
        this.kogusKg = kogusKg;
        this.hindKg = hindKg;

    }

    public String getInfo() {
        return "Õuna andmed on: " + this.andmed + ". Maksumus on " + kogusKg*hindKg + " eurot.";
    }
}
