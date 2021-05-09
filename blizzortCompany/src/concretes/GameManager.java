package concretes;

import abstracts.IGameService;
import entities.Game;

public class GameManager implements IGameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun Bilgileri Sisteme Baþarý Ýle Kaydedildi.");
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun Bilgileri Güncellendi.");

	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun Sistemden Kaldýrýldý.");

	}

}
