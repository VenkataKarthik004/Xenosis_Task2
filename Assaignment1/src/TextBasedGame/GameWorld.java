package TextBasedGame;

import java.util.ArrayList;
import java.util.List;

public class GameWorld {
	
	    private Player player;
	    private List<Enemy> enemies;

	    public GameWorld(Player player) {
	        this.player = player;
	        this.enemies = new ArrayList<>();
	    }

	    // Getters and setters
	    public Player getPlayer() {
	        return player;
	    }

	    public void setPlayer(Player player) {
	        this.player = player;
	    }

	    public List<Enemy> getEnemies() {
	        return enemies;
	    }

	    public void addEnemy(Enemy enemy) {
	        enemies.add(enemy);
	    }

	    public void removeEnemy(Enemy enemy) {
	        enemies.remove(enemy);
	    }
	

}
