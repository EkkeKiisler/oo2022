import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
// Algarvud
public class main {
    public static void main(String[] args) {
        //Kas arv jagub 2, 3, 5 või 7-ga?
        Scanner sc = new Scanner(System.in);
        System.out.println("Sisesta number: ");
        int number = sc.nextInt();
        int number2 = number % 2;
        int number3 = number % 3;
        int number5 = number % 5;
        int number7 = number % 7;
        if (number2 == 0) {
            System.out.println("Arv " + number + " jagub kahega");
        }
        if (number3 == 0) {
            System.out.println("Arv " + number + "  jagub kolmega");
        }
        if (number5 == 0) {
            System.out.println("Arv " + number + " jagub viiega");
        }
        if (number7 == 0) {
            System.out.println("Arv " + number + " jagub seitsmega");
        }
        if (number2 != 0 && number3 != 0 && number5 != 0 && number7 != 0) {
            System.out.println("Arv " + number + " ei jagu 2, 3, 5 ega 7-ga");
        }


        //Kas arv on algarv või mitte?
        boolean arv = false;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                arv = true;
                break;
            }
        }
        if (arv == false)
            System.out.println(number + " on algarv.");
        else
            System.out.println(number + " ei ole algarv.");


        //Massiiv esimese tuhande algarvuga
        int arvud = 7919;
        List algarvud = new ArrayList();

        for (int num = 2; num <= arvud; num++) {
            boolean onAlgarv = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    onAlgarv = false;
                    break;
                }
            }
            if (onAlgarv == true)
                algarvud.add(num);


        }
        System.out.println(algarvud);
        System.out.println("Tuhandes algarv on " + algarvud.get(algarvud.size() - 1));
        int max = (int) algarvud.get(algarvud.size() - 1);
        int ruudusMax = max * max;
        System.out.println("Tuhandes algarv ruudus on " + ruudusMax);
        List maxAlgarvud = new ArrayList();
        for (int Maxnum = 62710412; Maxnum <= ruudusMax; Maxnum++) {
            boolean onMaxAlgarv = true;
            for (int i = 2; i <= Maxnum / 2; i++) {
                if (Maxnum % i == 0) {
                    onMaxAlgarv = false;
                    break;
                }
            }
            if (onMaxAlgarv == true)
                maxAlgarvud.add(Maxnum);


        }
        System.out.println("Kümme suurimat algarvu, mis on väiksemad, kui tuhandenda algarvu ruut on " + maxAlgarvud);
    }
}




//if (num % i == 0) {
//        int numbrid = num;
//        num += 1;
//        arv2 = true;
//        }
//        if (arv2 = false) {
//        algarvud.add(num);
//        }
