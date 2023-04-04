public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Prem";
//        player.health = 69;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.remainingHealth());
//
//        damage = 60;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.remainingHealth());

         EnhancedPlayer player = new EnhancedPlayer("Prem", 200, "Sword");
         System.out.println("Initial health is " + player.getHitPoints());
    }
}