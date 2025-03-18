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
    Item potion = new Item("Potion", 20);

    assertEquals("Potion", potion.getName());
    assertEquals(20, potion.getHealingPower());
    assertEquals("This is " + potion.getName() + " and its healing power is " + potion.getHealingPower(), potion.info());
}



    @Test
    void testHeroLevelUp() {
        Hero hero = new Hero(100.0F, 10.0F, true);

        hero.setExperience(100);
        hero.levelUp();

        assertEquals(2, hero.getLevel());
        assertEquals(20, hero.getExperience());
        assertEquals(110.0, hero.health);
        assertEquals(11.0, hero.attackPower);
    }


    @Test
    void testHeroInventoryAddAndUse() {
        Hero hero = new Hero(100.0F, 10.0F, true);
        Item potion = new Item("Potion", 20);

        assertTrue(hero.addToInventory(potion)); // should be true
        assertTrue(hero.showInventory().contains("Potion")); // should be true

        hero.useItem();
        assertTrue(hero.showInventory().contains("Potion")); // should be false
    }

   @Test
void testHeroFight() {
    Hero hero = new Hero(100.0F, 10.0F, true);
    Enemy enemy = new Enemy(100.0, 10.0, true);

    boolean attackSuccess = hero.fight(enemy);
    assertTrue(attackSuccess);
}


    @Test
    void testEnemyFightMagic() {

    }

    @Test
    void testBossFightUltra() {

    }

    @Test
    void testShowInventory() {
        Hero hero = new Hero(100.0F, 10.0F, true);
        hero.addToInventory(new Item("Potio", 20));

        assertTrue(hero.showInventory().contains("Potion"));
    }

    @Test
    void testInfoMethods() {
        Hero hero = new Hero(100.0F, 10.0F, true);
        Item potion = new Item("Potion", 20);

        assertEquals("This is " + Item.getName() + " and its healing power is " + Item.getHealingPower(), Item.info());
        assertEquals("This is " + hero.name + ". Health: " + hero.health + ", level: " + hero.getLevel() + ", experience: " + hero.getExperience() + ", money: " + hero.getMoney() + ", attack power: " + hero.attackPower + ".", Hero.info());
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
