package Odev3_4Gun.Abstract;

import Odev3_4Gun.Entitites.Campaign;
import Odev3_4Gun.Entitites.Customer;
import Odev3_4Gun.Entitites.Game;

public interface SaleService {
	void buy(Game game, Customer customer, Campaign campaign);
}
