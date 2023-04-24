package unasat.AppTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import unasat.Entity.Brillen;
import unasat.Entity.Klanten;
import unasat.Scanners.BrillenScanner;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

    class ApplicatieTest {
        Brillen b = new Brillen(20, 123, 932.63, "wit", "nike");
        Klanten k = new Klanten("darlene", -2.5, -0.5, 873321, 162, "pzs");

        @Test
        void BrillenTest() {
            assertAll("bril", () -> assertEquals("nike", b.getMerk()), () -> assertEquals("wit", b.getKleur()));
        }

        @Test
        void KlantenTest() {
            assertAll("klant", () -> assertEquals(162, k.getVerzekeringsnummer()), () -> assertEquals("darlene", k.getNaam()), () -> assertEquals(873321, k.getTelefoonNummer()));
        }

        @Test
        void Test() {
            BrillenScanner bs = new BrillenScanner();

            List<Integer> lijst = new ArrayList<>();
            lijst.add(2);
            lijst.add(43);
            lijst.add(566);

            Assertions.assertEquals((566), bs.findMax(lijst));
            Assertions.assertEquals((2), bs.findMin(lijst));
        }
    }
