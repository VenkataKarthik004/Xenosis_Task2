package TextBasedGame;

import java.util.Scanner;

public class Game {
	    private GameWorld gameWorld;
	    private Scanner scanner;

	    public Game(GameWorld gameWorld) {
	        this.gameWorld = gameWorld;
	        this.scanner = new Scanner(System.in);
	    }

	    public void start() {
	        System.out.println("Welcome to the Text-Based Game!");
	        while (true) {
	            System.out.println("\nWhat would you like to do?");
	            System.out.println("1. Move");
	            System.out.println("2. Attack");
	            System.out.println("3. Inventory");
	            System.out.println("4. Exit");

	            int choice = scanner.nextInt();
	            switch (choice) {
	                case 1:
	                    move();
	                    break;
	                case 2:
	                    attack();
	                    break;
	                case 3:
	                    showInventory();
	                    break;
	                case 4:
	                    System.out.println("Exiting the game...");
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }

	    private void move() {
	        System.out.println("You move to a new location.");
	    }

	    private void attack() {
	        if (gameWorld.getEnemies().isEmpty()) {
	            System.out.println("No enemies to attack.");
	            return;
	        }

	        Enemy enemy = gameWorld.getEnemies().get(0);
	        System.out.println("Attacking " + enemy.getName());
	        enemy.takeDamage(gameWorld.getPlayer().getAttackPower());
	        if (enemy.getHealth() <= 0) {
	            System.out.println("You defeated " + enemy.getName());
	            gameWorld.removeEnemy(enemy);
	        } else {
	            gameWorld.getPlayer().takeDamage(enemy.getAttackPower());
	            System.out.println(enemy.getName() + " attacked you. Your health is now " + gameWorld.getPlayer().getHealth());
	        }
	    }

	    private void showInventory() {
	        System.out.println("Inventory:");
	        for (Item item : gameWorld.getPlayer().getInventory()) {
	            System.out.println(item.getName() + ": " + item.getDescription());
	        }
	    }
	

}
