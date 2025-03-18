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

       assertEquals("Potion", Item.getName());
       assertEquals(20, Item.getHealingPower());
       assertEquals("This is " + Item.getName() + " and its healing power is " + Item.getHealingPower(), Item.info());
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
}
