package teineproovikt;

import org.junit.Test;

import java.io.ByteArrayOutputStream;

import static junit.framework.Assert.*;

public class JookivaatTests {

    @Test
    public void T2idaPudelKuiSaab() {
        JoogiPudel joogiPudel = new JoogiPudel(0.5, "Plastik", 0.2, 0.1);
        Joogivaat joogivaat = new Joogivaat(12.0, 3);
        joogivaat.T2idaJoogipudel(joogiPudel);
        boolean isT2idetud = joogivaat.T2idaJoogipudel(joogiPudel);
        assertTrue(isT2idetud);
    }


    @Test
    public void T2idaPudelKuiEiSaa() {
        JoogiPudel joogiPudel = new JoogiPudel(0.5, "Plastik", 0.2, 0.1);
        Joogivaat joogivaat = new Joogivaat(12.0, 0.3);
        joogivaat.T2idaJoogipudel(joogiPudel);
        boolean isT2idetud = joogivaat.T2idaJoogipudel(joogiPudel);
        assertFalse(isT2idetud);
    }



    @Test
    public void villidaEiSaabNull() {
        JoogiPudel joogiPudel = new JoogiPudel(0.5, "Plastik", 0.2, 0.1);
        Joogivaat joogivaat = new Joogivaat(12.0, 0.3);
        joogivaat.T2idaJoogipudel(joogiPudel);
        int pudeliteArv = joogivaat.villiPudelid(joogiPudel);
        assertEquals(0,pudeliteArv);
    }


    @Test
    public void villidaSaabRohkemKuiNull() {
        JoogiPudel joogiPudel = new JoogiPudel(0.5, "Plastik", 0.2, 0.1);
        Joogivaat joogivaat = new Joogivaat(12.0, 3);
        joogivaat.T2idaJoogipudel(joogiPudel);
        int pudeliteArv = joogivaat.villiPudelid(joogiPudel);
        assertEquals(6,pudeliteArv);
    }
}
