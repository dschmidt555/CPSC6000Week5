import java.util.Random;


public class Main {

	public static void main(String[] args) {
		
		Cannon cannon = new Cannon();
		
		cannon.insertShell();
		cannon.fire();
		cannon.fire();
		cannon.insertShell();
		cannon.unload();
		cannon.fire();
		cannon.insertShell();
		cannon.fire();
		
		System.out.println("..................");
		System.out.println("Random Cannon States:...");
		randomCannonFire();

		
	}
	
	//Function that gives out random states 
	public static void randomCannonFire() {
		Random rand = new Random();
				
		Cannon cannon = new Cannon();
		
		int randomInt = rand.nextInt(4);

		
		if(randomInt == 1) {
			cannon.insertShell();
		}else if (randomInt == 2) {
			cannon.fire();
		}else if (randomInt == 3) {
			cannon.unload();
		}else {
			cannon.ejectShell();
		}
		
		
		cannon.fire();

		
	}

}
