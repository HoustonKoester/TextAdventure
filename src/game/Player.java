package game;
import fixtures.Room;

public class Player {
private int index = 0;
public int getIndex() {
	return index;
}

public void setIndex(int index) {
	this.index = index;
}

private Room currentRoom;
private String[] inventory;
private boolean lighter = false;
private boolean key = false;
private boolean fingernails = false;
private boolean tool = false;

public boolean isTool() {
	return tool;
}

public void setTool(boolean tool) {
	this.tool = tool;
}

public boolean isLighter() {
	return lighter;
}

public boolean isFingernails() {
	return fingernails;
}

public void setFingernails(boolean fingernails) {
	this.fingernails = fingernails;
}

public void setLighter(boolean lighter) {
	this.lighter = lighter;
}

public boolean isKey() {
	return key;
}

public void setKey(boolean key) {
	this.key = key;
}

public Room getCurrentRoom() {
	return currentRoom;
}

public void setCurrentRoom(Room currentRoom) {
	this.currentRoom = currentRoom;
}

public String[] getInventory() {
	return inventory;
}

public void setInventory(String[] inventory) {
	this.inventory = inventory;
}

}
