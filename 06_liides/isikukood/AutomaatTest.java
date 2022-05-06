package isikukood;

import kujundid.Kolmnurk;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AutomaatTest {


    @Test
    public void kontrolli_kas_on_naisterahvas_kui_isikukoodi_alguses_on_4() {
        isikukoodEE ee = new isikukoodEE("4513112313");
        assertEquals(false,ee.isMale());
    }
    @Test
    public void kontrolli_kas_on_synniaasta_1951_kui_isikukoodi_keskel_on_51() {
        isikukoodLV lv = new isikukoodLV("120351-51237");
        assertEquals(1951, lv.getBirthYear());
    }
    @Test
    public void kontrolli_kas_kujundi_pindla_arvutatakse_korrektselt() {
        Kolmnurk kolmnurk = new Kolmnurk(5.0,6.0,7.0);
        assertEquals(18, kolmnurk.arvutaYmbermõõt(), 0.1);
    }
}