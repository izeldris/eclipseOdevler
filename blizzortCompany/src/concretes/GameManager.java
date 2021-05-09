package concretes;

import abstracts.IGameService;
import entities.Game;

public class GameManager implements IGameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun Bilgileri Sisteme Ba�ar� �le Kaydedildi.");
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun Bilgileri G�ncellendi.");

	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun Sistemden Kald�r�ld�.");

	}

}
