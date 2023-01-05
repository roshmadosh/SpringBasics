package link.hiroshisprojects.springbasics.environment;

class DataSource {

	private String dbUrl;

	public void init() {
		System.out.println("DB URL is: " + dbUrl);
	}

	public DataSource(String dbUrl) {
		this.dbUrl = dbUrl;

	}
}
