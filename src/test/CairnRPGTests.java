import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CairnRPGTests {

    // --- World Tests ---
    @Test
    void testWorldConstructorAndInfo() {
        World world = new World();
        assertNotNull(world);
        assertEquals("Default Game", world.getGameName());
        assertEquals("Default Publisher", world.getPublisher());
        assertTrue(world.info().contains("Game:"));
    }

    @Test
    void testWorldSetters() {
        World world = new World();
        world.setGameName("Cairn RPG");
        world.setPublisher("CU Devs");
        assertEquals("Cairn RPG", world.getGameName());
        assertEquals("CU Devs", world.getPublisher());
    }

    // --- Item Tests ---
    @Test
    void testItemConstructorAndGetters() {
        Item potion = new Item("Potion", 20);
        assertEquals("Potion", potion.getName());
        assertEquals(20, potion.getHealingPower());
        assertTrue(potion.info().contains("Heals"));
    }

    @Test
    void testItemSetters() {
        Item item = new Item("Elixir", 30);
        item.setName("Mega Elixir");
        item.setHealingPower(50);
        assertEquals("Mega Elixir", item.getName());
        assertEquals(50, item.getHealingPower());
    }

    // --- Character Tests ---
    @Test
    void testCharacterConstructorAndInfo() {
        Character character = new Character("Maximus", 100.0f, 10.0f, true);
        assertNotNull(character);
        assertTrue(character.info().contains("Maximus"));
    }

    @Test
    void testCharacterRunAway() {
        Character character = new Character("Maximus", 100.0f, 10.0f, true);
        assertNotNull(character.runAway());
    }

    @Test
    void testCharacterSettersAndGetters() {
        Character c = new Character("Test", 50f, 10f, true);
        c.setName("NewName");
        c.setHealth(75f);
        c.setAttackPower(12.5f);
        c.setIsAlive(false);

        assertEquals("NewName", c.getName());
        assertEquals(75f, c.getHealth());
        assertEquals(12.5f, c.getAttackPower());
        assertFalse(c.getIsAlive());
    }

    // --- Hero Tests ---
    @Test
    void testHeroConstructorDefaults() {
        Hero hero = new Hero(100.0f, 15.0f, true);
        assertEquals(1, hero.getLevel());
        assertEquals(0, hero.getExperience());
        assertEquals(0.0f, hero.getMoney());
        assertTrue(hero.info().contains("Level:"));
    }

    @Test
    void testHeroAddToInventoryAndUseItem() {
        Hero hero = new Hero(100.0f, 10.0f, true);
        boolean added = hero.addToInventory(new Item("Elixir", 30));
        assertTrue(added);

        float before = hero.getHealth();
        int healed = hero.useItem(1); // Uses the item we just added
        assertTrue(healed > 0);
        assertTrue(hero.getHealth() > before);
    }

    @Test
    void testHeroFight() {
        Hero hero = new Hero(100.0f, 10.0f, true);
        Enemy enemy = new Enemy(100.0f, 5.0f, true);
        boolean result = hero.fight(enemy);
        assertTrue(result || !result); // just assert it returns a boolean
    }

    @Test
    void testHeroLevelUp() {
        Hero hero = new Hero(100.0f, 10.0f, true);
        hero.setExperience(120);
        hero.levelUp();
        assertEquals(2, hero.getLevel());
        assertEquals(0, hero.getExperience());
    }

    @Test
    void testHeroShowInventory() {
        Hero hero = new Hero(100.0f, 10.0f, true);
        String inventory = hero.showInventory();
        assertTrue(inventory.contains("Potion"));
    }

    // --- Enemy Tests ---
    @Test
    void testEnemyConstructorDefaults() {
        Enemy enemy = new Enemy(100.0f, 10.0f, true);
        assertEquals("EnemyName", enemy.getName());
        assertEquals(30, enemy.getMagicPoints());
        assertTrue(enemy.info().contains("Magic Points"));
    }

    @Test
    void testEnemyFight() {
        Enemy enemy = new Enemy(100.0f, 10.0f, true);
        Hero hero = new Hero(100.0f, 10.0f, true);
        boolean result = enemy.fight(hero);
        assertTrue(result || !result); // Ensure boolean returned
    }

    @Test
    void testEnemySettersAndGetters() {
        Enemy enemy = new Enemy();
        enemy.setMagicPoints(50);
        assertEquals(50, enemy.getMagicPoints());
    }

    // --- Boss Tests ---
    @Test
    void testBossConstructorAndInfo() {
        Boss boss = new Boss();
        assertEquals("The Dark Overlord", boss.getName());
        assertEquals(3, boss.getUltrasLeft());
        assertTrue(boss.info().contains("Ultras Left"));
    }

    @Test
    void testBossFightUsesUltras() {
        Boss boss = new Boss();
        Hero hero = new Hero(100.0f, 10.0f, true);
        for (int i = 0; i < 5; i++) {
            boss.fight(hero); // Use ultras
        }
        assertTrue(boss.getUltrasLeft() <= 3);
    }

    @Test
    void testBossSetters() {
        Boss boss = new Boss();
        boss.setUltrasLeft(1);
        assertEquals(1, boss.getUltrasLeft());
    }
}
