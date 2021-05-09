package concretes;

import abstracts.ISalesService;
import abstracts.IUserCheckService;
import entities.Campaign;
import entities.User;
import entities.Employee;
import entities.Game;

public class SalesManager implements ISalesService {

	@Override
	public void sale(Game game, User user) throws Exception {
		if (game.getUnitsInStock() >= 1) {
			System.out.printf(game.getGameName() + " Oyunu " + user.getFirstName()
					+ " Kullan�c�s�na Sat��� Ba�ar�yla Ger�ekle�mi�tir.");

		} else {
			System.out.println("Stokta kopya bulunmamaktad�r.");
		}
	}

	@Override
	public void discountSale(Game game, User user, Campaign campaign) {
		if (game.getUnitsInStock() >= 1) {
			System.out.printf(game.getGameName() + " Oyunu " + user.getFirstName()
			+ " Kullan�c�s�na Sat��� => " + campaign.getCampName() + " <= Kampanyas� �le Sat��� Ba�ar�yla Ger�ekle�mi�tir.");
		} else {
			System.out.println("Stokta kopya bulunmamaktad�r.");
		}

	}

	@Override
	public void employeeSale(Game game, Employee employee, Campaign campaign) {
		if (game.getUnitsInStock() >= 1) {
			System.out.printf(game.getGameName() + " Oyunu " + employee.getFirstName()
			+ " Kullan�c�s�na Sat��� =>" + campaign.getCampName() + "<= Kampanyas� �le Sat��� Ba�ar�yla Ger�ekle�mi�tir.");
		} else {
			System.out.println("Stokta kopya bulunmamaktad�r.");
		}

	}

}
