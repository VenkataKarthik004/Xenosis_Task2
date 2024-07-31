package TextBasedGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	    private String name;
	    private int health;
	    private int attackPower;
	    private List<Item> inventory;

	    public Player(String name, int health, int attackPower) {
	        this.name = name;
	        this.health = health;
	        this.attackPower = attackPower;
	        this.inventory = new ArrayList<>();
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

	    public List<Item> getInventory() {
	        return inventory;
	    }

	    public void addItem(Item item) {
	        inventory.add(item);
	    }

	    public void removeItem(Item item) {
	        inventory.remove(item);
	    }

	    public void takeDamage(int damage) {
	        health -= damage;
	    }
	}


