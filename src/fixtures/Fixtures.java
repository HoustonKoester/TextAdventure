package fixtures;

public abstract class Fixtures {

	public String name;
	public String shortDescription;
	public String longDescription;
	
	public Fixtures(String name, String shortDescription, String longDescription) {
		this.name = name;
		this.longDescription = longDescription;
		this.shortDescription = shortDescription;
	}
}
