package fixtures;

public class Room extends Fixtures{
	public int leftDist;
	public int rightDist;
	public String item;
	public String help;
	public Room(String name, String shortDescription, String longDescription, int left, int right, String str, String help) {
		super(name, shortDescription, longDescription);
		this.leftDist = left;
		this.rightDist = right;
		this.item = str;
		this.help = help;
	}

	
	
}
