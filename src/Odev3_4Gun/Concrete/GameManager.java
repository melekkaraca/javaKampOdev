package Odev3_4Gun.Concrete;

import Odev3_4Gun.Abstract.GameService;
import Odev3_4Gun.Entitites.Game;

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
