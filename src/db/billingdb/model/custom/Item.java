package db.billingdb.model.custom;

public class Item {
	//i.id, i.internal_number, p.price, c.code, d.desc
	
	private int id;
	private String internal_number;
	private Double price;
	private String code;
	private String desc;
	
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInternal_number() {
		return internal_number;
	}
	public void setInternal_number(String internal_number) {
		this.internal_number = internal_number;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
