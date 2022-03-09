package com.bridgelabz.observerdesignpattern;

 abstract class Page { 
	 public void onDataReceived(String data) {
			System.out.println("Data received in "
					+ getClass().getSimpleName() + data);
		}
}
