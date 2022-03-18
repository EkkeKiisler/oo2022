package isikukood;
// 06_liides -> parem klõps new package
//game

public class IsikukoodMain {
    public static void main(String[] args) {
        isikukoodEE ee = new isikukoodEE("39402431256");
        System.out.println(ee.isMale());
        System.out.println(ee.getBirthYear());
        System.out.println(ee.getBirthMonth());

        isikukoodLV lv = new isikukoodLV("120388-51237");
        System.out.println(lv.isMale());
        System.out.println(lv.getBirthYear());
        System.out.println(lv.getBirthMonth());
    }
}
