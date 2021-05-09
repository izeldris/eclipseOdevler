package entities;

import java.time.LocalDate;
import abstracts.IEntity;

public class User implements IEntity {
	private int id;
	private int userId;
	private String nationalId;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private int age;
	private String gsm;
	private String userName;
	private String password;
	private String email;
	private String adress;
	private Gender gender;

	public User() {

	}

	public User(int id, int userId, String nationalId, String firstName, String lastName, LocalDate dateOfBirth,
			String gsm, String userName, String password, String email, String adress, Gender gender) {
		super();
		this.id = id;
		this.userId = userId;
		this.nationalId = nationalId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gsm = gsm;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.adress = adress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGsm() {
		return gsm;
	}

	public void setGsm(String gsm) {
		this.gsm = gsm;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = LocalDate.now().getYear() - this.getDateOfBirth().getYear();
	}

}
