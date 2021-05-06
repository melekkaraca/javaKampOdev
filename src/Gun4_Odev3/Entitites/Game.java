package Gun4_Odev3.Entitites;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import Gun4_Odev3.Abstract.Entity;

public class Game implements Entity{
	private int id;
	private int categoryId;
	private String name;
	private BigDecimal unitPrice;
	private Boolean active;
	public Game() {
		
	}
	public Game(int id, int categoryId, String name, BigDecimal unitPrice, Boolean active) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.name = name;
		this.unitPrice = unitPrice;
		this.active = active;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
}
