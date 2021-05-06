package Gun4_Odev3.Abstract;

import Gun4_Odev3.Entitites.Campaign;
import Gun4_Odev3.Entitites.Customer;
import Gun4_Odev3.Entitites.Game;

public interface SaleService {
	void buy(Game game, Customer customer, Campaign campaign);
}
