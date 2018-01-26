
public class Description {
	enum Gender {
		KOBIETA, FACET
	}
	
	public String name;
	public Gender plec;
	
	Description(String name, Gender plec) {
		this.name = name;
		this.plec = plec;
	}
}
