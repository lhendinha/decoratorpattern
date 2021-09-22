import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DecoratorTest {
    @Test
    void testThinHamburguer() {
        System.out.println("Running: testThinHamburguer");
        Hamburguer hamburguer = new ThinHamburguer();

        assertEquals(hamburguer.getDescription(), "Thin hamburguer, with tomato sauce");
        assertEquals(hamburguer.cost(), 15.99);
    }

    @Test
    void testThickHamburguer() {
        System.out.println("Running: testThickHamburguer");
        Hamburguer hamburguer = new ThickHamburguer();

        assertEquals(hamburguer.getDescription(), "Thick hamburguer, with tomato sauce");
        assertEquals(hamburguer.cost(), 20.99);
    }

    @Test
    void testThinCheeseHamburguer() {
        System.out.println("Running: testThinCheeseHamburguer");
        Hamburguer hamburguer = new ThinHamburguer();
        Hamburguer cheeseHamburguer = new Cheese(hamburguer);

        assertEquals(cheeseHamburguer.getDescription(), "Thin hamburguer, with tomato sauce, Cheese");
        assertEquals(cheeseHamburguer.cost(), 16.14);
    }

    @Test
    void testThinBaconHamburguer() {
        System.out.println("Running: testThinBaconHamburguer");
        Hamburguer hamburguer = new ThinHamburguer();
        Hamburguer baconHamburguer = new Bacon(hamburguer);

        assertEquals(baconHamburguer.getDescription(), "Thin hamburguer, with tomato sauce, Bacon");
        assertEquals(baconHamburguer.cost(), 16.98);
    }

    @Test
    void testThickCheeseHamburguer() {
        System.out.println("Running: testThickCheeseHamburguer");
        Hamburguer hamburguer = new ThickHamburguer();
        Hamburguer cheeseHamburguer = new Cheese(hamburguer);

        assertEquals(cheeseHamburguer.getDescription(), "Thick hamburguer, with tomato sauce, Cheese");
        assertEquals(cheeseHamburguer.cost(), 21.139999999999997);
    }

    @Test
    void testThickBaconHamburguer() {
        System.out.println("Running: testThickBaconHamburguer");
        Hamburguer hamburguer = new ThickHamburguer();
        Hamburguer baconHamburguer = new Bacon(hamburguer);

        assertEquals(baconHamburguer.getDescription(), "Thick hamburguer, with tomato sauce, Bacon");
        assertEquals(baconHamburguer.cost(), 21.979999999999997);
    }
}
