import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class ArenaTest {
    @Test
    public void testFight() {
        Player player1 = new Player(50, 5, 10);
        Player player2 = new Player(100, 10, 5);
        Arena arena = new Arena();
        arena.fight(player1, player2);

        // Ensure the game ends when a player's health reaches 0
        assertFalse(player1.isAlive() || player2.isAlive());
    }

   
}
