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
					+ " Kullanýcýsýna Satýþý Baþarýyla Gerçekleþmiþtir.");

		} else {
			System.out.println("Stokta kopya bulunmamaktadýr.");
		}
	}

	@Override
	public void discountSale(Game game, User user, Campaign campaign) {
		if (game.getUnitsInStock() >= 1) {
			System.out.printf(game.getGameName() + " Oyunu " + user.getFirstName()
			+ " Kullanýcýsýna Satýþý => " + campaign.getCampName() + " <= Kampanyasý Ýle Satýþý Baþarýyla Gerçekleþmiþtir.");
		} else {
			System.out.println("Stokta kopya bulunmamaktadýr.");
		}

	}

	@Override
	public void employeeSale(Game game, Employee employee, Campaign campaign) {
		if (game.getUnitsInStock() >= 1) {
			System.out.printf(game.getGameName() + " Oyunu " + employee.getFirstName()
			+ " Kullanýcýsýna Satýþý =>" + campaign.getCampName() + "<= Kampanyasý Ýle Satýþý Baþarýyla Gerçekleþmiþtir.");
		} else {
			System.out.println("Stokta kopya bulunmamaktadýr.");
		}

	}

}
