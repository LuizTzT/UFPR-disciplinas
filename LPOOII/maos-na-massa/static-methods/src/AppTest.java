import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    @Test
    public void testMinimo() {
        double[] valores = { 177, 200, 181, 180, 173, 185 };
        assertEquals(173.0, App.minimo(valores), 0.001);
    }

    @Test
    public void testMaximo() {
        double[] valores = { 177, 200, 181, 180, 173, 185 };
        assertEquals(200.0, App.maximo(valores), 0.001);
    }

    @Test
    public void testMedia() {
        double[] valores = { 177, 200, 181, 180, 173, 185 };
        assertEquals(182.667, App.media(valores), 0.001);
    }

    @Test
    public void testDesvPad() {
        double[] valores = { 177, 200, 181, 180, 173, 185 };
        assertEquals(9.395, App.desvPad(valores), 0.001);
    } 
}
