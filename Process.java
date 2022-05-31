import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Process extends Pokemon{
	Scanner scan = new Scanner(System.in);
	Vector<Pokemon> pokemonVector = new Vector<>();
	Random rand = new Random();
	Integer choose;
	
	public Process(String name, Integer level, Integer hp, Integer exp, Integer att, Integer def, Integer agl,
			String type) {
		super(name, level, hp, exp, att, def, agl, type);
	}
	
	public void viewPoke(){
		if (pokemonVector.isEmpty()) {
			System.out.println("Create your pokemon first!");
		} else {
			System.out.println("");
			Pokemon poke = pokemonVector.get(0);
			System.out.println("Name: "+ poke.getName());
			System.out.println("Level: "+ poke.getLevel());
			System.out.println("HP: "+ poke.getHp());
			System.out.println("EXP: "+ poke.getExp());
			System.out.println("ATT: "+ poke.getAtt());
			System.out.println("DEF: "+ poke.getDef());
			System.out.println("AGL: "+ poke.getAgl());
			System.out.println("Type: "+ poke.getType()); 
		}
		System.out.print("Press Enter to continue...");
		scan.nextLine();
	}
	
	public void createPokemon(){
		do {
			System.out.println("P O K E M O N");
			System.out.println("=============================================");
			System.out.printf("| %-3s| %-11s| %-4s| %-4s| %-4s| %-6s|\n", "NO", "NAME", "ATT", "DEF", "AGL", "TYPE");
			System.out.println("=============================================");
			System.out.printf("| %-3s| %-11s| %-4s| %-4s| %-4s| %-6s|\n", "1.", "Charmender", 70, 25, 90, "Fire");
			System.out.printf("| %-3s| %-11s| %-4s| %-4s| %-4s| %-6s|\n", "2.", "Bulbasaur", 90, 30, 80, "Water");
			System.out.printf("| %-3s| %-11s| %-4s| %-4s| %-4s| %-6s|\n", "3.", "Squirtle", 55, 40, 85, "Grass");
			System.out.println("=============================================");
			System.out.print("Choose [1-3] >> ");
			choose = scan.nextInt();
			scan.nextLine();
			
		} while (choose < 1 || choose > 3);
		
		switch (choose) {
		case 1:
			pokemonVector.add(new Pokemon("Charmender", 0, 100, 0, 70, 25, 90, "Fire"));
			break;
		case 2:
			pokemonVector.add(new Pokemon("Bulbasaur", 0, 100, 0, 90, 30, 80, "Water"));
			break;
		case 3:
			pokemonVector.add(new Pokemon("Squirtle", 0, 100, 0, 55, 40, 85, "Grass"));
			break;
		}
		System.out.println("Successfully created your Pokemon!");
		System.out.print("Press Enter to continue...");
		scan.nextLine();
		
	}
	
	public void calculateNew(Integer newHp) {
		if(newHp < 0) {
			newHp = 0;
		}
		pokemonVector.get(0).setHp(newHp);
	}
	
	public void calculateNew(Integer newExp, Integer newLevel) {
		if (newExp >= 100) {
			newLevel +=1;
			newExp -= 100;	
		}
		pokemonVector.get(0).setExp(newExp);
		pokemonVector.get(0).setLevel(newLevel);
	}
	
	public void trainPokemon(){
		
		
		if(pokemonVector.isEmpty()){
			System.out.println("No Pokemon available");
		}else {
			Pokemon poke = pokemonVector.get(0);
			int num, num2;
			Integer newHp = poke.getHp();
			Integer newExp = poke.getExp();
			Integer newLevel = poke.getLevel();
			
			choose = 1;
			
			while(newHp > 0 && choose == 1) {
				int levelLawan = rand.nextInt(newLevel+2 - newLevel) + newLevel;
				String pokemonLawan;
				num = rand.nextInt(3)+1;
				if (num == 1) {
					pokemonLawan = "Charmender";
				}else if(num == 2) {
					pokemonLawan = "Bulbasaur";
				}else {
					pokemonLawan = "Squirtle";
				}
				
				System.out.println(poke.getName() + "(" + newLevel + ") VS "+ pokemonLawan + "(" + levelLawan + ")");
				System.out.println("Training in progress...");
				num2 = rand.nextInt(2);
				
				if(num2 == 0) {
					newHp -= 40;
					newExp += 10;
					
					calculateNew(newHp);
					calculateNew(newExp, newLevel);
					
					System.out.println("You lose!");
					
				}else {
					newHp -= 20;
					newExp += 30;
					
					calculateNew(newHp);
					calculateNew(newExp, newLevel);
					
					System.out.println("You win!");
				}
				
				if(newHp != 0) {
					System.out.println("Do you want to train again?");
					System.out.print("Choose [0 if NO and 1 if YES] >> ");
					choose = scan.nextInt();
					scan.nextLine();
				}else {
					System.out.println("Your Hp is 0!");
				}
			}
			
			System.out.print("Press Enter to continue...");
			scan.nextLine();
		}
		
	}
	
	public void healPokemon(){
		
		if(pokemonVector.isEmpty()){
			System.out.println("No Pokemon available");
		}else{
			Pokemon poke = pokemonVector.get(0);
			Integer newHp = poke.getHp()  + 25;
			
			if(newHp > 100) {
				newHp = 100;
			}
			pokemonVector.get(0).setHp(newHp); 
			
			System.out.println("Your Pokemon is healed!");
		}
		System.out.print("Press Enter to continue...");
		scan.nextLine();
	}
}