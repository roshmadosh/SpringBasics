package link.hiroshisprojects.springbasics.validation;


class Name {

	private String first;
	private String middleInitial;
	private String last;
	public Name(String first, String middleInitial, String last) {
		this.first = first;
		this.middleInitial = middleInitial;
		this.last = last;
	}

	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getMiddleInitial() {
		return middleInitial;
	}
	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}

}	
