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
					+ " Kullanıcısına Satışı Başarıyla Gerçekleşmiştir.");

		} else {
			System.out.println("Stokta kopya bulunmamaktadır.");
		}
	}

	@Override
	public void discountSale(Game game, User user, Campaign campaign) {
		if (game.getUnitsInStock() >= 1) {
			System.out.printf(game.getGameName() + " Oyunu " + user.getFirstName()
			+ " Kullanıcısına Satışı => " + campaign.getCampName() + " <= Kampanyası İle Satışı Başarıyla Gerçekleşmiştir.");
		} else {
			System.out.println("Stokta kopya bulunmamaktadır.");
		}

	}

	@Override
	public void employeeSale(Game game, Employee employee, Campaign campaign) {
		if (game.getUnitsInStock() >= 1) {
			System.out.printf(game.getGameName() + " Oyunu " + employee.getFirstName()
			+ " Kullanıcısına Satışı =>" + campaign.getCampName() + "<= Kampanyası İle Satışı Başarıyla Gerçekleşmiştir.");
		} else {
			System.out.println("Stokta kopya bulunmamaktadır.");
		}

	}

}
