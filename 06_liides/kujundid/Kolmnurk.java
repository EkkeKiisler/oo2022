package kujundid;

public class Kolmnurk implements Kujund{
    double kylg1;
    double kylg2;
    double kylg3;

    public Kolmnurk(double v, double v1, double v2) {
    }

    @Override
    public double arvutaYmbermõõt() {
        return kylg1 + kylg2 + kylg3;
    }
    @Override
    public double arvutaPindala() {
        return kylg1-(arvutaYmbermõõt())/2 * kylg2-(arvutaYmbermõõt())/2 * kylg3-(arvutaYmbermõõt())/2;
    }

}
