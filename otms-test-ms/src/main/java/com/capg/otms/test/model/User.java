package com.capg.otms.test.model;


public class User {

	private long userId ;
	private String userName ;
	private TestBean userTest ;
	private boolean isAdmin ;
	private String userPassword;

	public User() { }

	public User(long userId, String userName, TestBean userTest, boolean isAdmin, String userPassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userTest = userTest;
		this.isAdmin = isAdmin;
		this.userPassword = userPassword;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public TestBean getUserTest() {
		return userTest;
	}

	public void setUserTest(TestBean userTest) {
		this.userTest = userTest;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
}