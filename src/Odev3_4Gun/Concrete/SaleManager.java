package Odev3_4Gun.Concrete;

import java.time.LocalDateTime;
import Odev3_4Gun.Abstract.SaleService;
import Odev3_4Gun.Entitites.Campaign;
import Odev3_4Gun.Entitites.Customer;
import Odev3_4Gun.Entitites.Game;
import Odev3_4Gun.Entitites.Sale;

public class SaleManager implements SaleService{

	@Override
	public void buy(Game game, Customer customer, Campaign campaign) {
		LocalDateTime now = LocalDateTime.now();
		Sale sale = new Sale();
		sale.setId(1);
		sale.setCustomerId(customer.getCustomerId());
		sale.setGameId(game.getId());
		sale.setDateOfBuy(now.toLocalDate());
		sale.setSalePrice(campaign.getSalePrice());
		
		System.out.println(
						customer.getFirstName() + " müþterisi, "+ 
						game.getName() + " oyununu %"+ 
						campaign.getDiscountRate()+" indirimle "+
						campaign.getSalePrice()+" TL'ye satýn aldý.");
		
	}

}
