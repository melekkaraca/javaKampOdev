package Gun4_Odev3;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;

import Gun4_Odev3.Abstract.CustomerService;
import Gun4_Odev3.Abstract.GameService;
import Gun4_Odev3.Abstract.SaleService;
import Gun4_Odev3.Adapters.MernisServiceAdapter;
import Gun4_Odev3.Concrete.CustomerManager;
import Gun4_Odev3.Concrete.GameManager;
import Gun4_Odev3.Concrete.SaleManager;
import Gun4_Odev3.Entitites.Campaign;
import Gun4_Odev3.Entitites.Customer;
import Gun4_Odev3.Entitites.Game;

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
	



