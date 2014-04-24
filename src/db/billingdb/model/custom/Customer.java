package db.billingdb.model.custom;

public class Customer {
	private int id;
	private String city;
	private int currencyId;
	private String username;
	private String fullname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(int currencyId) {
		this.currencyId = currencyId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getCombinedName() {
		if (username != null && !username.isEmpty() && fullname != null
				&& !fullname.isEmpty()) {
			return String.format("%12s - %s", username, fullname);
		}

		return null;
	}
}
