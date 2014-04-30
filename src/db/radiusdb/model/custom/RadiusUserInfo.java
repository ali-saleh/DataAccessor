package db.radiusdb.model.custom;

import java.util.Date;

public class RadiusUserInfo {
	
	private String username;
	private String fullname;
	private String cityString;
	private String catagory;
	private Date activeUntil;
	private String city;
	//private String catInfo;

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

	public String getCityString() {
		return cityString;
	}

	public void setCityString(String cityString) {
		this.cityString = cityString;
		this.city = extractCityNumber(cityString);
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public Date getActiveUntil() {
		return activeUntil;
	}

	public void setActiveUntil(Date activeUntil) {
		this.activeUntil = activeUntil;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCatInfo(String catInfo) {
		//this.catInfo = catInfo;
	}
	
	private String extractCityNumber(String cityString2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	// c.PID 'username',
	// c.CustomerName 'fullname',
	// c.city 'cityString',
	// rug.groupname 'catagory',
	// max(STR_TO_DATE(rc.value, '%d %b %Y')) 'activeUntil',
	// ui.lastname 'catInfo'
}
