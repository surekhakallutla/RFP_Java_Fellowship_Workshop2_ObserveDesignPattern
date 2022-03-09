package com.bridgelabz.observerdesignpattern;

public class Main {
	public static void main(String[] args) {
		Subject subject = new Subject();
		AboutPage aboutPage = new AboutPage();
		BillingPage billPage = new BillingPage();
		LogInPage logInPage = new LogInPage();
		RegistrationPage registrationPage = new RegistrationPage();
		DashBoardPage dashBoardPage = new DashBoardPage();
		
		subject.register(aboutPage);
		subject.register(registrationPage);
		subject.register(logInPage);
		subject.register(billPage);
		subject.register(dashBoardPage);
		
		subject.update("data");
		System.out.println();
		
		subject.unRegister(dashBoardPage);
		subject.unRegister(registrationPage);
		
		subject.update("new Data");
		
	}

}
