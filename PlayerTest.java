import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PlayerTest {
    @Test
    public void testPlayerInitialization() {
        Player player = new Player(50, 5, 10);
        assertEquals(50, player.getHealth());
        assertEquals(5, player.getStrength());
        assertEquals(10, player.getAttack());
    }

    @Test
    public void testPlayerTakeDamage() {
        Player player = new Player(50, 5, 10);
        player.takeDamage(20);
        assertEquals(30, player.getHealth());
    }

    @Test
    public void testPlayerIsAlive() {
        Player player = new Player(50, 5, 10);
        assertTrue(player.isAlive());
        player.takeDamage(50);
        assertFalse(player.isAlive());
    }
}