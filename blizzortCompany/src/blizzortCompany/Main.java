package blizzortCompany;

import java.time.LocalDate;

import adapters.GovServiceAdapter;
import concretes.PersonManager;
import concretes.SalesManager;
import concretes.CampaignManager;
import concretes.GameManager;
import entities.Gender;
import entities.User;
import entities.Campaign;
import entities.Employee;
import entities.Game;
import entities.GameType;


public class Main {

	public static void main(String[] args) throws Exception {
			PersonManager personManager=new PersonManager(new GovServiceAdapter());
			Campaign campaign=new Campaign(1,"Sharp Shooters","A Campaign that special for only FPS lovers.",20,LocalDate.of(2021, 5, 15),LocalDate.of(2021, 5, 30));
			User user=new User(1,1,"15001020304","Harun Emre","Altun",LocalDate.of(1995,8,28),"5392295167","QantaSS","q1w2e3r4","harunemrealtun@gmail.com","Bahçelievler,ÝSTANBUL",Gender.MALE);
			personManager.add(user);
			
			SalesManager salesManager=new SalesManager();
			salesManager.sale(new Game(1,"Horizon-Zero Dawn","A Game That You Will Encounter Endless Waves of Bosses",GameType.ADVENTURE,150,320), user);
			System.out.println("\n");
			salesManager.discountSale(new Game(2,"Call of Duty: Modern Warfare","Objective is lost. On your feet soldier!",GameType.FPS,400,440), user,campaign);
			
	}

}
