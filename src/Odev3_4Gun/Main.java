package Odev3_4Gun;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;

import Odev3_4Gun.Abstract.CustomerService;
import Odev3_4Gun.Abstract.GameService;
import Odev3_4Gun.Abstract.SaleService;
import Odev3_4Gun.Adapters.MernisServiceAdapter;
import Odev3_4Gun.Concrete.CustomerManager;
import Odev3_4Gun.Concrete.GameManager;
import Odev3_4Gun.Concrete.SaleManager;
import Odev3_4Gun.Entitites.Campaign;
import Odev3_4Gun.Entitites.Customer;
import Odev3_4Gun.Entitites.Game;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customerOperations();
		gameOperations();
		saleOperations();  
	}
	public static void customerOperations() {
		//e-devlet sistemi doðrulama testi için þimdilik 18 yaþýnda  büyükse true dönüyor
		CustomerService customerManager = new CustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer(1,"Melek", "Karaca", Long.valueOf("12345678910"), LocalDate.of(1988,04,23),null);
		customerManager.add(customer);
		customer.setFirstName("Dilek");
		
		
	}
	public static void gameOperations() {
		GameService gameManager= new GameManager();
		Game game = new Game();
		game.setId(1);
		game.setCategoryId(5);
		game.setName("Oyun 1");
		game.setUnitPrice(BigDecimal.valueOf(1500));
		game.setActive(true);
		gameManager.add(game);
	}
	public static void saleOperations() {
		SaleService saleManager = new SaleManager();
		Customer customer = new Customer(1,"Melek", "Karaca", null, null,null);
		Game game = new Game(1,5,"Oyun 1",BigDecimal.valueOf(1500),null);
		Campaign campaign = new Campaign(1,1,15,game.getUnitPrice());
		saleManager.buy(game, customer, campaign);
	}
}
	



