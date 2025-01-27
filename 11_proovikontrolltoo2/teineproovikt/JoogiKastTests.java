package teineproovikt;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class JoogiKastTests {
    @Test
    public void arvutaMass() {
        Joogikast joogiKast = new Joogikast("Puit", 200, 2.5, 20);
        Jook jook = new Jook("Coca cola", 0.6, 1.4);
        JoogiPudel joogiPudel = new JoogiPudel(12.0, "Klaas", 20.0, 0.2);
        joogiPudel.jook = jook;
        joogiKast.joogiPudel = joogiPudel;
        double mass = joogiKast.getMass(20);
        assertEquals(220.8, 0.1);
    }

    @Test
    public void villiPudelidKasti() {
        Joogikast joogiKast = new Joogikast("Puit", 200, 2.5, 20);
        Jook jook = new Jook("Coca cola", 0.6, 1.4);
        JoogiPudel joogiPudel = new JoogiPudel(2.0, "Klaas", 20.0, 0.2);
        joogiPudel.jook = jook;
        joogiKast.joogiPudel = joogiPudel;
        Joogivaat joogivaat = new Joogivaat(312, 36);
        double mass = joogiKast.villiKastiPudelid(joogivaat);
        assertEquals(18, 0.1);
    }

    @Test
    public void villiPudelidKastiKuiOnT2is() {
        Joogikast joogiKast = new Joogikast("Puit", 200, 2.5, 20);
        Jook jook = new Jook("Coca cola", 0.6, 1.4);
        JoogiPudel joogiPudel = new JoogiPudel(2.0, "Klaas", 20.0, 0.2);
        joogiPudel.jook = jook;
        joogiKast.joogiPudel = joogiPudel;
        Joogivaat joogivaat = new Joogivaat(312, 36);
        double mass = joogiKast.villiKastiPudelid(joogivaat);
        assertEquals(20, 0.1);
    }
}
