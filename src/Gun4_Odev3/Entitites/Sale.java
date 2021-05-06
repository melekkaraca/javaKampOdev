package Gun4_Odev3.Entitites;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Sale {
	private int id;
	private int customerId;
	private int gameId;
	private LocalDate dateOfBuy;
	private BigDecimal salePrice;
	public Sale() {
		
	}
	public Sale(int id, int customerId, int gameId, LocalDate dateOfBuy, BigDecimal salePrice) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.gameId = gameId;
		this.dateOfBuy = dateOfBuy;
		this.salePrice = salePrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public LocalDate getDateOfBuy() {
		return dateOfBuy;
	}
	public void setDateOfBuy(LocalDate dateOfBuy) {
		this.dateOfBuy = dateOfBuy;
	}
	public BigDecimal getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}
	
}
