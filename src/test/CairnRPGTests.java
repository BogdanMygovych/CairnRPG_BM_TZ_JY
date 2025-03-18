import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CairnRPGTests {

    @Test
    void testWorldCreation() {
        World w = new World("My World", "Me");
        assertNotNull(w);
    }

    @Test
    void testCharacterRunAway() {
        Character c = new Character("Max", 100, 10, true);
        boolean result = c.runAway(); // true/false
        assertNotNull(result);
    }

    @Test
    void testItemCreationAndInfo() {
       
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
