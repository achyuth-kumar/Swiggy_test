public class Arena {
    private Dice dice;

    public Arena() {
        this.dice = new Dice();
    }

    public void fight(Player player1, Player player2) {
        while (player1.isAlive() && player2.isAlive()) {
            if (player1.getHealth() < player2.getHealth()) {
                performAttack(player1, player2);
            } else {
                performAttack(player2, player1);
            }
        }

        if (!player1.isAlive()) {
            System.out.println("Player 1 is dead. Player 2 wins!");
        } else {
            System.out.println("Player 2 is dead. Player 1 wins!");
        }
    }

    private void performAttack(Player attacker, Player defender) {
        int attackRoll = dice.roll();
        int defenseRoll = dice.roll();
        int attackDamage = attackRoll * attacker.getAttack();
        int defenseValue = defenseRoll * defender.getStrength();
        int damageDealt = Math.max(0, attackDamage - defenseValue);

        defender.takeDamage(damageDealt);

        System.out.printf("%s attacks %s: attack roll = %d, defense roll = %d, damage dealt = %d\n",
            attacker, defender, attackRoll, defenseRoll, damageDealt);
        System.out.printf("Defender health is now %d\n", defender.getHealth());
    }
}