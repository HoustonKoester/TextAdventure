package game;
import fixtures.Room;
public class RoomManager {

	public static Room[] init() {
		Room[] dungeon = new Room[16];
		
		Room startRoom = new Room(
				"You wake up here again\n",
				"In a vaguely familiar place",
				"You look around the room, it's a round room with rough, worn walls.\n"
				+ "There appears to be a fireplace in the middle filled with wood.\n"
				+ "You can taste the damp air as you breath,\n"
				+ "looking up you can see a glistening crystal illuminating the room softly.\n",
				1,
				2,
				"",
				"Seems like I might be able to light a fire if I had a lighter, \notherwise I guess I have to go left or right.\n");
		dungeon[0] = startRoom;
		
		Room fireRoom = new Room(
				"Left - ",
				"Looking down the walk way it looks dark, but you can smell smoke in the air\n",
				"It's very dim in this room, but with the little light that reaches this room you can make out the details.\n"
				+ "In the center of the room appears to be the remains of a campfire,\n"
				+ "next to the campfire is a small lighter.\n",
				2,
				3,
				"lighter",
				"I could grab the lighter.\n");
		dungeon[1] = fireRoom;
		
		Room echoRoom = new Room(
				"Right - ",
				"You can hear your voice echo back to you whenever you try to speak.\n",
				"You enter a small room and your steps echo back to you with every step. \n"
				+ "The longer you spend in this room the more you swear you can start hearing footsteps that aren't your own.\n",
				0,
				4,
				""
				,"I feel like I shouldn't stay here... too late");
		dungeon[2] = echoRoom;
		
		Room wetRoom = new Room(
				"Left - ",
				"You can hear water dripping from this room.\n",
				"As you walk into the room you notice that there's a decent amount of standing water in the room. \n"
				+ "The smell of mildew hits you and you can see a thin white coating of mold on some of the stones.\n",
				4,
				5,
				"",
				"I guess there's nothing here, I should go left or go right.\n");
		dungeon[3] = wetRoom;
		
		Room skullRoom = new Room(
				"Right - ",
				"You can hear flames crackling from this pathway.\n",
				"You gaze into the room and hundreds of skulls gaze coldly back at you. \n"
				+ "They're set in niches in the walls in a checkerboard pattern, they all appear the same. \n"
				+ "Each skull bears a half-melted candle on its head. \n"
				+ "The grinning bones stare vacantly into the room, which otherwise seems empty.\n",
				5,
				6,
				"",
				"Something doesn't feel right... I should go left or go right.\n");
		dungeon[4] = skullRoom;
		
		Room chestRoom = new Room(
				"Right - ",
				"This seems like a normal pathway.\n",
				"This small bare chamber holds nothing but a large ironbound chest, \n"
				+ "which is big enough for a man to fit in and bears a heavy iron lock. \n"
				+ "The floor has a layer of undisturbed dust upon it.\n",
				9,
				9,
				"oldkey",
				"If I had a key I could use it on that chest,\nI guess I have to go left or right...\n");
		dungeon[6] = chestRoom;
		
		Room floodedRoom = new Room(
				"Left - ",
				"There's a stream of water coming from this hallway.\n",
				"You open the door to the room and you're hit with a small wave of water the floods out of the room.\n"
				+ "As you regain composure you see the source of the water is coming from a hole in the wall.\n"
				+ "You can see something glinting inside the hole.\n",
				8,
				8,
				"key",
				"Let's look at hole, otherwise I guess I have to go left or right...\n");
		dungeon[7] = floodedRoom;
		
		Room marbleRoom = new Room(
				"Right - ",
				"There's an elagent white light coming from this hallway\n",
				"Unlike the cobblestone common throughout the dungeon, \n"
				+ "this room is walled and floored with black marble veined with white. \n"
				+ "The ceiling is similarly marbled, but the thick pillars that hold it up are white. \n"
				+ "A brown stain drips down one side of a nearby pillar.\n",
				7,
				7,
				"",
				"Doesn't look like anything is here I guess I have to go left or right...\n");
		dungeon[8] = marbleRoom;
		
		Room rockfallRoom = new Room(
				"Left - ",
				"There's a pile of rocks blocking this pathway\n",
				"You attempt to move rocks out of the pathway.\n "
				+ "One by one\n"
				+ "Another rock hits the ground, you swear you can see progress being made.\n"
				+ "...\n"
				+ "..\n"
				+ ".\n",
				6,
				6,
				"",
				"whoops");
		dungeon[9] = rockfallRoom;
		
		Room fingernailRoom = new Room(
				"Right - ",
				"You can't tell if that's the smell of blood or iron coming from here\n",
				"This room has eerily smooth walls excluding the one side of the room that has a slight crack.\n"
				+ "As you look closer at the crack you can see scratches and a pile of what appears to be\n"
				+ "fingernails...",
				5,
				5,
				"",
				"I could look at fingernails, but I feel like I should to go left or right...\n");
		dungeon[10] = fingernailRoom;
		
		
		
		
		Room darkRoom = new Room( 
			"Left/Right - ",
			"There's nothing but darkness down this way.\n","You step into the darkness and wait.",-15,-15,"","Too late for help");
		dungeon[15] = darkRoom;
		return dungeon;
	}
	
}
