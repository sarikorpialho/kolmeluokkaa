package kolmeluokkaa;

public class person {
	private String name;
	private String birthday;
	
	public person(String name, String birthday) {
		this.birthday = birthday;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	

}
