import java.util.*;

public class Main {

	Scanner scan = new Scanner(System.in);
	Integer choose;
	
	public Main() {
		String name = null;
		Integer level = null;
		Integer hp = null;
		Integer exp = null;
		Integer att = null;
		Integer def = null;
		Integer agl = null;
		String type = null;
		Process proc = new Process(name, level, hp, exp, att, def, agl, type);

		do{
			System.out.println("POKEMON TRAINER SIMULATION");
			System.out.println("1. Create My Pokemon");
			System.out.println("2. View My Pokemon");
			System.out.println("3. Training");
			System.out.println("4. Heal");
			System.out.println("5. Exit");
			System.out.print("Choose [1-5] >> ");

			choose = scan.nextInt();
			scan.nextLine();

			switch (choose) {
			case 1:
				proc.createPokemon();
				break;
			case 2:
				proc.viewPoke();
				break;
			case 3:
				proc.trainPokemon();
				break;
			case 4:
				proc.healPokemon();
				break;
			}
		}while(choose != 5);
	}

	public static void main(String[] args) {
		new Main();
	}
}