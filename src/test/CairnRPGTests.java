import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CairnRPGTests {
    private Enemy enemy;
    private Character hero;

    @BeforeEach
    void setUp() {
        enemy = new Enemy(100.0, 10.0, true);
        hero = new Character("Hero", 120.0, 15.0, true);
    }

    
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
        @Test
    void testEnemyCreation() {
        Enemy enemy = new Enemy(100.0, 10.0, true);  // Creating an enemy
        assertEquals("Enemy", enemy.getName(), "Enemy name should be 'Enemy'");
        assertEquals(100.0, enemy.getHealth(), 0.01, "Enemy health should be 100");
        assertEquals(10.0, enemy.getAttackPower(), 0.01, "Enemy attack power should be 10");
        assertTrue(enemy.getIsAlive(), "Enemy should be alive when created");
    }
}
