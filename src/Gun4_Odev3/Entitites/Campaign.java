package Gun4_Odev3.Entitites;

import java.math.BigDecimal;

public class Campaign {
	private int id;
	private int gameId;
	private int discountRate;
	private BigDecimal unitPrice;
	private BigDecimal salePrice;
	public Campaign() {
		
	}
	public Campaign(int id, int gameId, int discountRate, BigDecimal unitPrice) {
		super();
		this.id = id;
		this.gameId = gameId;
		this.discountRate = discountRate;
		this.unitPrice = unitPrice;		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public int getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	
	public BigDecimal getSalePrice() {
		int salePrice = getUnitPrice().intValue() - (getUnitPrice().intValue() / 100 * this.discountRate);
		return BigDecimal.valueOf(salePrice);		
	}
	
	
}
