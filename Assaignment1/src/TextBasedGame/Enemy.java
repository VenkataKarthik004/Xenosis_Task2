package TextBasedGame;

public class Enemy {

	    private String name;
	    private int health;
	    private int attackPower;

	    public Enemy(String name, int health, int attackPower) {
	        this.name = name;
	        this.health = health;
	        this.attackPower = attackPower;
	    }

	    // Getters and setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getHealth() {
	        return health;
	    }

	    public void setHealth(int health) {
	        this.health = health;
	    }

	    public int getAttackPower() {
	        return attackPower;
	    }

	    public void setAttackPower(int attackPower) {
	        this.attackPower = attackPower;
	    }

	    public void takeDamage(int damage) {
	        health -= damage;
	    }
	}


