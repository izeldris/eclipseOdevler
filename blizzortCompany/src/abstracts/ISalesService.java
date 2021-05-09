package abstracts;

import entities.Campaign;
import entities.Employee;
import entities.Game;
import entities.User;

public interface ISalesService {
	void sale(Game game, User user) throws Exception;

	void discountSale(Game game, User user, Campaign campaign) throws Exception;

	void employeeSale(Game game, Employee employee, Campaign campaign) throws Exception;
}
