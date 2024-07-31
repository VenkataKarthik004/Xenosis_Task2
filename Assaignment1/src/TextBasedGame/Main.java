package TextBasedGame;

public class Main {
	    public static void main(String[] args) {
	        Player player = new Player("Hero", 100, 10);
	        GameWorld gameWorld = new GameWorld(player);

	        // Add some enemies
	        gameWorld.addEnemy(new Enemy("Goblin", 30, 5));
	        gameWorld.addEnemy(new Enemy("Orc", 50, 10));

	        // Add some items
	        player.addItem(new Item("Sword", "A sharp blade"));
	        player.addItem(new Item("Shield", "Protects against attacks"));

	        Game game = new Game(gameWorld);
	        game.start();
	    }


}
