public class Toiduained {
    String nimetus;
    double valkudeProtsent;
    double rasvadeProtsent;
    double süsivesikuteProtsent;


    public Toiduained(String nimetus, double valkudeProtsent, double rasvadeProtsent, double süsivesikuteProtsent) {
        this.nimetus = nimetus;
        this.valkudeProtsent = valkudeProtsent;
        this.rasvadeProtsent = rasvadeProtsent;
        this.süsivesikuteProtsent = süsivesikuteProtsent;
    }

    public double protsendiPiir(double valkudeProtsent, double rasvadeProtsent, double süsivesikuteProtsent){
        double protsendiPiir = valkudeProtsent + rasvadeProtsent +süsivesikuteProtsent;
        if (protsendiPiir > 100) {
            System.out.println("Andmetes on viga, kuna nende protsent läks üle 100!");
        }
        return valkudeProtsent + rasvadeProtsent + süsivesikuteProtsent;
    }
    public void Toiduained() {
        Toiduained toiduained = new Toiduained("Kartul", 20, 15, 22);
    }

}

