package entities;

import java.time.LocalDate;
import abstracts.IEntity;

public class Campaign implements IEntity {
	private int id;
	private String campName;
	private String description;
	private int discount;
	private LocalDate campBegin;
	private LocalDate campEnd;

	public Campaign() {

	}

	public Campaign(int id, String campName, String description, int discount, LocalDate campBegin, LocalDate campEnd) {
		super();
		this.id = id;
		this.campName = campName;
		this.description = description;
		this.discount = discount;
		this.campBegin = campBegin;
		this.campEnd = campEnd;
	}

	public int getId() {
		return id;
	}

	public String getCampName() {
		return campName;
	}

	public String getDescription() {
		return description;
	}

	public int getDiscount() {
		return discount;
	}

	public LocalDate getCampBegin() {
		return campBegin;
	}

	public LocalDate getCampEnd() {
		return campEnd;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCampName(String campName) {
		this.campName = campName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public void setCampBegin(LocalDate campBegin) {
		this.campBegin = campBegin;
	}

	public void setCampEnd(LocalDate campEnd) {
		this.campEnd = campEnd;
	}

}
