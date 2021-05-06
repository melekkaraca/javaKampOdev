package Gun4_Odev3.Concrete;

import Gun4_Odev3.Abstract.GameService;
import Gun4_Odev3.Entitites.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi: "+ game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi: "+ game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi: "+ game.getName());
		
	}

}
