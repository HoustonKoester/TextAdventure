package game;
import java.util.Scanner;

import fixtures.Room;
public class Main {

	public static void main(String[] args) throws InterruptedException {
		Player mc = new Player();
		Room[] dungeon = RoomManager.init();
		mc.setCurrentRoom(dungeon[0]);
		
		if(mc.getIndex() == 0) {
		System.out.println("You awaken with your head in a daze feeling cold tile against your face\nYou stand up slowly.\n");
		Thread.sleep(1500);
		System.out.println(mc.getCurrentRoom().longDescription);
		}
		while(true) {
			
			if(mc.getIndex() == 0 && mc.isLighter()) {
				System.out.println("Do you want to start the fire in the middle of the room?");
				Scanner s = new Scanner(System.in);
				String str = s.nextLine();
				String[] tok = str.split("\\s+");
				if(tok[0].equals("yes")) {
					System.out.println("As the fire burns you sit and wait.");
					Thread.sleep(1500);
					System.out.println("You hear a machine starting up.");
					Thread.sleep(2000);
					System.out.println("The doors to the next room quickly slam shut.");
					Thread.sleep(3000);
					System.out.println("The fire goes out, only ashes remain.");
					Thread.sleep(2000);
					System.out.println("You hear a soft hiss as a gas floods into the room. It gets hard to breath as your vision blurs.");
					Thread.sleep(3000);
					System.out.println("You see an L shaped indent on the floor among the ashes.");
					if(mc.isTool()) {
						System.out.println("Do you want to insert the old tool?");
						str = s.nextLine();
						tok = str.split("\\s+");
						if(tok[0].equals("yes")) {
							System.out.println("You push the L shaped tool into the slot as your vision fades");
							Thread.sleep(4000);
							System.out.println("You wake up in an open field");
							Thread.sleep(2000);
							System.out.println("As you look around it seems like there might be other people around,");
							Thread.sleep(2000);
							System.out.println("You can hear the sounds of swords clashing in the distance. ");
							Thread.sleep(3000);
							System.out.println("You look up and above you a sign reads \"Welcome to the abyss\"");
				
							s.close();
							Thread.sleep(4000);
							System.out.println("\n\n GOOD END? \n\n");
							System.exit(0);
							
						}
					}
					Thread.sleep(2000);
					System.out.println("Your vision fades...");
					s.close();
					Thread.sleep(4000);
					System.out.println("\n\n BAD END \n\n");
					System.exit(0);
				}else {
					System.out.println("You decide to continue looking around");
				}
			}
			
			
			if(mc.getIndex() == 2) {
				System.out.println(dungeon[mc.getIndex()+mc.getCurrentRoom().rightDist].name + dungeon[mc.getIndex()+mc.getCurrentRoom().rightDist].shortDescription );
			}else if(mc.getIndex() != 15){
				System.out.println(dungeon[mc.getIndex()+mc.getCurrentRoom().leftDist].name + dungeon[mc.getIndex()+mc.getCurrentRoom().leftDist].shortDescription );
				Thread.sleep(300);
				System.out.println(dungeon[mc.getIndex()+mc.getCurrentRoom().rightDist].name + dungeon[mc.getIndex()+mc.getCurrentRoom().rightDist].shortDescription );
			}else{
				System.out.println(dungeon[mc.getIndex()+mc.getCurrentRoom().rightDist].name + dungeon[mc.getIndex()+mc.getCurrentRoom().rightDist].shortDescription );
			}
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String[] tok = str.split("\\s+");
		
		//help and directions options
		if(tok[0].equals("Help") || tok[0].equals("help")){
			System.out.println(mc.getCurrentRoom().help);
		}else if(tok[0].equals("Options") || tok[0].equals("options")) {
			System.out.println(dungeon[mc.getIndex()+mc.getCurrentRoom().leftDist].name + dungeon[mc.getIndex()+mc.getCurrentRoom().leftDist].shortDescription );	
			System.out.println(dungeon[mc.getIndex()+mc.getCurrentRoom().rightDist].name + dungeon[mc.getIndex()+mc.getCurrentRoom().rightDist].shortDescription );
		
			//go ____ options
		}else if(tok[0].equals("Go") || tok[0].equals("go")) {
			if(tok[1].equals("Left") || tok[1].equals("left")) {
				goLeft(mc,dungeon);
			}else if(tok[1].equals("Right") || tok[1].equals("right")) {
				goRight(mc,dungeon);
			}else if((tok[1].equals("nothingness") || tok[1].equals("Nothingness")) && (mc.getIndex() > 5)){
				goToVoid(mc,dungeon);
			}else {
				System.out.println("I dont think I can go that way");
			}
			
		// look at || inspect element options	
		}else if(tok[0].equals("Look") || tok[0].equals("look") || tok[0].equals("inspect")|| tok[0].equals("Inspect")) {
			if(tok[0].equals("Look") || tok[0].equals("look")){
				if((tok[2].equals("hole") || tok[2].equals("Hole")) && mc.getIndex() == 7  ) {
					//hole inspect
					System.out.println("You look at the hole and see a metal object glistening inside. Do you want to grab it?");
					str = s.nextLine();
					tok = str.split("\\s+");
					if(tok[0].equals("yes")) {
					mc.setKey(true);
					System.out.println("You feel something prick your hand");
					Thread.sleep(800);
					System.out.println("Pulling out the item shows that it's a heavy iron key");
					Thread.sleep(800);
					}
					
				}else if((tok[2].equals("fingernail") || tok[2].equals("Fingernail")|| tok[2].equals("fingernails") || tok[2].equals("Fingernails") ) && mc.getIndex() == 10  ){
					//fingernail inspect
					System.out.println("All of the fingernails look the exact same!");
					Thread.sleep(800);
					System.out.println("You gingerly pick one up to look at it.");
					Thread.sleep(800);
					System.out.println("As you pick it up you realize that it looks exactly like your fingernail.");
					Thread.sleep(800);
					System.out.println("A shiver gets sent down your spine thinking back to the skull room.\n");
					Thread.sleep(800);
				}
			}else if(tok[0].equals("inspect")|| tok[0].equals("Inspect")) {
				if((tok[1].equals("hole") || tok[1].equals("Hole")) && mc.getIndex() == 7  ) {
					//hole inspect
					System.out.println("You look at the hole and see a metal object glistening inside. Do you want to grab it?");
					str = s.nextLine();
					tok = str.split("\\s+");
					if(tok[0].equals("yes")) {
					mc.setKey(true);
					System.out.println("You feel something prick your hand");
					Thread.sleep(800);
					System.out.println("Pulling out the item shows that it's a heavy iron key");
					Thread.sleep(800);
					}
				}else if((tok[1].equals("fingernail") || tok[1].equals("Fingernail")) && mc.getIndex() == 10  ){
					//fingernail inspect
					System.out.println("All of the fingernails look the exact same!");
					Thread.sleep(800);
					System.out.println("You gingerly pick one up to look at it.");
					Thread.sleep(800);
					System.out.println("As you pick it up you realize that it looks exactly like your fingernail.");
					Thread.sleep(800);
					System.out.println("A shiver gets sent down your spine thinking back to the skull room.\n");
					Thread.sleep(800);
				}
			}
			
			
		}else if((tok[0].equals("Grab") || tok[0].equals("grab") || tok[0].equals("pick") || tok[0].equals("Pick")) && mc.getIndex() == 1){
			//pick up lighter event
			System.out.println("You pick up the old lighter");
			mc.setLighter(true);
			Thread.sleep(1000);
		}else if((tok[0].equals("Use") || tok[0].equals("use")) && mc.getIndex() == 6 && mc.isKey() == true){
			System.out.println("You use the old key on the chest.\nYou can hear the old lock pop before it drops to the ground.");
			Thread.sleep(800);
			System.out.println("You open the chest and inside the chest is a strange tool.\nDo you want to pick it up? ");
			str = s.nextLine();
			tok = str.split("\\s+");
			if(tok[0].equals("yes")) {
			mc.setTool(true);
			Thread.sleep(800);
			System.out.println("You grab the tool, it almost looks like an \"L\"");

			}
			Thread.sleep(800);
			
		}else if(tok[0].equals("Left") || tok[0].equals("left")) {
			goLeft(mc,dungeon);
		}else if(tok[0].equals("Right") || tok[0].equals("right")) {
			goRight(mc,dungeon);
			
			
		//}

		
			}
		}

	}	
	


	public static void goRight(Player mc, Room[] dungeon) throws InterruptedException {
		mc.setIndex(mc.getIndex() +mc.getCurrentRoom().rightDist );
		mc.setCurrentRoom(dungeon[mc.getIndex()]);
		System.out.println(".");
		Thread.sleep(450);
		System.out.println("..");
		Thread.sleep(450);
		System.out.println("...");
		Thread.sleep(450);
		System.out.println(mc.getCurrentRoom().longDescription);
		Thread.sleep(1500);
		
		if(mc.getIndex() == 15) {
			mc.setIndex(mc.getIndex() +mc.getCurrentRoom().rightDist );
			mc.setCurrentRoom(dungeon[mc.getIndex()]);
			System.out.println("...");
			Thread.sleep(450);
			System.out.println("..");
			Thread.sleep(450);
			System.out.println(".");
			Thread.sleep(450);
			System.out.println(dungeon[mc.getIndex()].name);
			Thread.sleep(1500);
			System.out.println(dungeon[mc.getIndex()].shortDescription );
			Thread.sleep(1500);
			System.out.println(mc.getCurrentRoom().longDescription+"\n");
		}
	}
	
	public static void goLeft(Player mc, Room[] dungeon) throws InterruptedException {
		if(mc.getIndex() == 6) {
			System.out.println("There's no door there");
		}
		mc.setIndex(mc.getIndex() +mc.getCurrentRoom().leftDist );
		mc.setCurrentRoom(dungeon[mc.getIndex()]);
		System.out.println(".");
		Thread.sleep(450);
		System.out.println("..");
		Thread.sleep(450);
		System.out.println("...");
		Thread.sleep(450);
		System.out.println(mc.getCurrentRoom().longDescription);
		Thread.sleep(1500);
		
		if(mc.getIndex() == 15) {
			mc.setIndex(mc.getIndex() +mc.getCurrentRoom().rightDist );
			mc.setCurrentRoom(dungeon[mc.getIndex()]);
			System.out.println("...");
			Thread.sleep(450);
			System.out.println("..");
			Thread.sleep(450);
			System.out.println(".");
			Thread.sleep(450);
			System.out.println(dungeon[mc.getIndex()].name);
			Thread.sleep(1500);
			System.out.println(dungeon[mc.getIndex()].shortDescription );
			Thread.sleep(1500);
			System.out.println(mc.getCurrentRoom().longDescription +"\n");
		}
	}
	
	public static void goToVoid(Player mc, Room[] dungeon) throws InterruptedException {
		mc.setIndex(mc.getIndex() +mc.getCurrentRoom().rightDist );
		mc.setCurrentRoom(dungeon[mc.getIndex()]);
		System.out.println(".");
		Thread.sleep(450);
		System.out.println("..");
		Thread.sleep(450);
		System.out.println("...");
		Thread.sleep(450);
		System.out.println(mc.getCurrentRoom().longDescription);
		Thread.sleep(1500);
		
		mc.setIndex(mc.getIndex() +mc.getCurrentRoom().rightDist );
		mc.setCurrentRoom(dungeon[mc.getIndex()]);
		System.out.println("...");
		Thread.sleep(450);
		System.out.println("..");
		Thread.sleep(450);
		System.out.println(".");
		Thread.sleep(450);
		System.out.println(dungeon[mc.getIndex()].name + dungeon[mc.getIndex()].shortDescription );
		Thread.sleep(1500);
		System.out.println(mc.getCurrentRoom().longDescription);
	}
	
	
}
