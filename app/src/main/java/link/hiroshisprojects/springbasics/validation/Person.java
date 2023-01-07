package link.hiroshisprojects.springbasics.validation;


class Person {

	private Name name;
	
	public Person(String first, String middleInitial, String last) {
		name = new Name(first, middleInitial, last);
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

}	
