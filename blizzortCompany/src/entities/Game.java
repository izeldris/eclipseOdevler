package entities;

import abstracts.IEntity;

public class Game implements IEntity {
	private int id;
	private String gameName;
	private String description;
	private GameType gameType;
	private int unitsInStock;
	private double price;
	private double priceAfterDiscount;

	Campaign campaign;

	public Game() {
	}

	public Game(int id, String gameName, String description, GameType gameType, int unitsInStock, double price) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.description = description;
		this.gameType = gameType;
		this.unitsInStock = unitsInStock;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getGameName() {
		return gameName;
	}

	public String getDescription() {
		return description;
	}

	public GameType getGameType() {
		return gameType;
	}

	public double getPrice() {
		return price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setGameType(GameType gameType) {
		this.gameType = gameType;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPriceAfterDiscount() {
		return priceAfterDiscount;
	}

	public void setPriceAfterDiscount(double priceAfterDiscount) {
		this.priceAfterDiscount = this.price - (this.price * campaign.getDiscount() / 100);
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

}
