public class Kodutöö1 {
    public static void main(String[] args) {
        //intressi arvutamise ül
        double Rahakogus = intressiFunktsioon(100000, 1.02, 10);
        System.out.println(Rahakogus);

        double Sõit = Sõiduaeg(120, 84.5);
        System.out.println(Sõit);


        String AntudHinne = Hinne(80);
        System.out.println(AntudHinne);
    }
    public static double intressiFunktsioon(double Raha, double intressAastas, int aastateArv) {
        return Raha * intressAastas * aastateArv;
    }

    // Funktsioon number 2 Sõiduaja arvutamine
    public static double Sõiduaeg(double SõiduPikkus, Double SõiduKiirus) {

        return SõiduPikkus / SõiduKiirus;
    }

    // Funktsioon nr 3 hinde arvutamine
    public static String Hinne(float Protsent) {
        if (Protsent >= 90) {
            return "Hinne on 5";
        }
        if (75 <= Protsent && Protsent < 90) {
            return "Hinne on 4";
        }
        if (50 <= Protsent && Protsent < 75) {
            return "Hinne on 3";
        } else {
            return "Hinne on 2";
        }

    }



}

