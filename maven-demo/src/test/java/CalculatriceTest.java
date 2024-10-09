import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatriceTest {
        Calculatrice calcul = new Calculatrice();

        @Test
        public void testCalculerSom() {
        assertEquals(25, calcul.Somme(10, 15));
        }
        @Test
        public void testCalculerDiff() {
        assertEquals(4, calcul.division(40, 10));
        }
        }