package vorlage;

public abstract class Person {
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public Person(String name) throws Exception {
		if (name.length() < 5){
			throw new Exception("Der Name der Person muss mindestens 5 Zeichen enthalten!");
		}
		else {
			this.name = name;
		}
	}
}
