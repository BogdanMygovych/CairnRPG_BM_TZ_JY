import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CairnRPGTests {

    @Test
    void testWorldDefaults() {
        World world = new World();
        assertNotNull(world.info());
    }

    @Test
    void testCharacterRunAway() {
        Character c = new Character("Max", 100, 10, true);
        boolean result = c.runAway(); // true/false
        assertNotNull(result);
    }

    @Test
    void testItemCreationAndInfo() {
        Item potion = new Item("Potion", 20);
        assertEquals("Potion", potion.getName());
        assertEquals(20, potion.getHealingPower());
        assertTrue(potion.info().contains("Potion"));
    }


    @Test
    void testHeroLevelUp() {

    }


    @Test
    void testHeroInventoryAddAndUse() {

    }

    @Test
    void testHeroFight() {

    }

    @Test
    void testEnemyFightMagic() {

    }

    @Test
    void testBossFightUltra() {

    }

    @Test
    void testShowInventory() {

    }

    @Test
    void testInfoMethods() {


    }
}
